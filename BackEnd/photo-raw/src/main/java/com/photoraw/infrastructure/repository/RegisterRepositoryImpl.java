package com.photoraw.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.photoraw.domain.entity.User;
import com.photoraw.domain.repository.RegisterRepository;
import com.photoraw.infrastructure.entities.UserEntity;
import com.photoraw.infrastructure.mapper.UserMapper;
import com.photoraw.infrastructure.repository.execute.UserCrudRepository;

@Repository
public class RegisterRepositoryImpl implements RegisterRepository {
	
	@Autowired
	private UserCrudRepository crud;
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User register(User usuario) {
		return userMapper.toUser(crud.save(userMapper.toUserEntity(usuario)));
}

}
