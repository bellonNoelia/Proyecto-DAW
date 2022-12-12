package com.photoraw.application.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.photoraw.domain.commons.TokenException;
import com.photoraw.domain.entity.User;
import com.photoraw.domain.repository.UserRepository;
import com.photoraw.domain.usecase.TokenUseCase;
import com.photoraw.domain.usecase.UserUseCase;

@Component
public class UserUseCaseImpl implements UserUseCase {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private TokenUseCase tokenUseCase;

	@Override
	public String login(String email, String pwd) {
		
		User usuario = userRepository.login(email, pwd);
		
		if (usuario  == null) {
			return null;
		}		
		return tokenUseCase.generateToken(usuario);
	}

	@Override
	public List<User> listadoArtistas(String token) throws TokenException {
		this.tokenUseCase.getUserByToken(token);
		
		return userRepository.listadoArtistas(1);
	}
	
	@Override
	public User getArtist(String token, Integer idPhoto) throws TokenException {
		this.tokenUseCase.getUserByToken(token);	
		return userRepository.getArtist(1, idPhoto);
	}

	@Override
	public User usuarioLogado(String token) throws TokenException {
		User user=this.tokenUseCase.getUserByToken(token);
		
		return user;
	}

	

}
