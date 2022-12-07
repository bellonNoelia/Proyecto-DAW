package com.photoraw.infrastructure.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.photoraw.domain.entity.User;
import com.photoraw.domain.repository.UserRepository;
import com.photoraw.infrastructure.mapper.UserMapper;
import com.photoraw.infrastructure.repository.execute.UserCrudRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	@Autowired
	private UserCrudRepository crud;
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User login(String email, String pwd) {
		return userMapper.toUser(crud.findUser(email, pwd));
	}

	@Override
	public List<User> listadoArtistas(int idRol) {
		return userMapper.toUserList(crud.findByRol(idRol));
	}
	
}
