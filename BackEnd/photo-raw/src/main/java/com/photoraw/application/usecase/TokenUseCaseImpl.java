package com.photoraw.application.usecase;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.photoraw.domain.entity.User;
import com.photoraw.domain.usecase.TokenUseCase;

@Component
public class TokenUseCaseImpl implements TokenUseCase {
	
	private Map<String, User> tokenRegister = new HashMap<>();

	@Override
	public String generateToken(User user) {
		String datoEntrada = user.getEmail()+user.getPwd();
		String token = Base64.getEncoder().encodeToString(datoEntrada.getBytes());
		tokenRegister.put(token, user);
		return token;
	}

	@Override
	public User getUserByToken(String token) {
		return tokenRegister.get(token);
	}

}
