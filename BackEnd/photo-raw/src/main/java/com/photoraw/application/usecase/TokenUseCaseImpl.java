package com.photoraw.application.usecase;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.photoraw.domain.commons.LogOutException;
import com.photoraw.domain.commons.TokenException;
import com.photoraw.domain.commons.TokenExpiredException;
import com.photoraw.domain.entity.TokenInf;
import com.photoraw.domain.entity.User;
import com.photoraw.domain.usecase.TokenUseCase;

@Component
public class TokenUseCaseImpl implements TokenUseCase {
	
	private Map<String, TokenInf> tokenRegister = new HashMap<>();
	
	private int timeExpiredToken = 5;

	@Override
	public String generateToken(User user) {
		String datoEntrada = user.getEmail()+user.getPwd();
		String token = Base64.getEncoder().encodeToString(datoEntrada.getBytes());
		tokenRegister.put(token, new TokenInf(user, LocalTime.now()));
		return token;
	}

	@Override
	public User getUserByToken(String token) throws TokenException{
		TokenInf tokenInf = tokenRegister.get(token);
		if(tokenInf ==null) {
			throw new LogOutException();
		}
		if(isExpiredToken(tokenInf.getFechaCreacionToken())) {
			tokenRegister.remove(token);
			throw new TokenExpiredException();
		}
		renovarFechaToken(token);
		return tokenInf.getUserInfo();
	}
	
	private boolean isExpiredToken(LocalTime fechaToken) {	
		return timeExpiredToken < ChronoUnit.MINUTES.between(fechaToken, LocalTime.now());
	}
	
	private void renovarFechaToken(String token) {
		tokenRegister.get(token).setFechaCreacionToken(LocalTime.now());
	}

	@Override
	public void removeToken(String token) {
		this.tokenRegister.remove(token);
	}

}
