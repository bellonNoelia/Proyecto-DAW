package com.photoraw.domain.repository;

import com.photoraw.domain.entity.User;

public interface UserRepository {
	User login(String email, String pwd);
}
