package com.photoraw.domain.usecase;

import com.photoraw.domain.entity.User;

public interface UserUseCase {
	User login(String email, String pwd);
}
