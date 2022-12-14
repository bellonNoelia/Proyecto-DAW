package com.photoraw.application.usecase;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.photoraw.domain.entity.User;
import com.photoraw.domain.repository.RegisterRepository;
import com.photoraw.domain.usecase.RegisterUseCase;

@Component
public class RegisterUseCaseImpl implements RegisterUseCase {

	@Autowired
	private RegisterRepository registerRepository;

	@Override
	public User register(User usuario) {
		int avatar=(int)(Math.random()*6+1);
		usuario.setAvatar(avatar);
		return registerRepository.register(usuario);
	}

}
