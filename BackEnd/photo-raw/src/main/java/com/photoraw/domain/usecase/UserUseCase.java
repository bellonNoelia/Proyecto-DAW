package com.photoraw.domain.usecase;

import java.util.List;

import com.photoraw.domain.commons.TokenException;
import com.photoraw.domain.entity.User;

public interface UserUseCase {
	
	String login(String email, String pwd);
	
	List <User> listadoArtistas(String token) throws TokenException;
	
}
