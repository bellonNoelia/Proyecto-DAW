package com.photoraw.application.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.photoraw.domain.entity.User;
import com.photoraw.domain.repository.UserRepository;
import com.photoraw.domain.usecase.UserUseCase;

@Component
public class UserUseCaseImpl implements UserUseCase {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User login(String email, String pwd) {
		return userRepository.login(email, pwd);
	}

}
