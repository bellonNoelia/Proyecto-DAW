package com.photoraw.infrastructure.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.photoraw.domain.entity.User;
import com.photoraw.domain.repository.UserRepository;
import com.photoraw.infrastructure.mapper.UserMapper;
import com.photoraw.infrastructure.respository.execute.UserCrudRepository;

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
	
	
//	public void register() {
//		crud.save(mapper.toUserEntity)
//	}
	
}
