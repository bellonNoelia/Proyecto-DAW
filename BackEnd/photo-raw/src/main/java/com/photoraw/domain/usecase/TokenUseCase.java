package com.photoraw.domain.usecase;

import com.photoraw.domain.commons.TokenException;
import com.photoraw.domain.entity.User;

public interface TokenUseCase {
	
	String generateToken(User user);
	
	User getUserByToken(String token) throws TokenException;
	
	void removeToken(String token);
	
}
