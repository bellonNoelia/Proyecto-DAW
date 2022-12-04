package com.photoraw.infrastructure.mapper;
import org.mapstruct.Mapper;

import com.photoraw.domain.entity.Rol;
import com.photoraw.domain.entity.User;
import com.photoraw.infrastructure.entities.RolEntity;
import com.photoraw.infrastructure.entities.UserEntity;

@Mapper
public interface UserMapper {
	
	default public User toUser(UserEntity entity) {
		if(entity == null) {
			return null;
		}
			return new User(
					entity.getId(), 
					entity.getAvatar(), 
					entity.getFirstName(), 
					entity.getLastName(), 
					entity.getAge(), 
					entity.getEmail(), 
					entity.getPwd(), 
					toRol(entity.getRol()));
	}
	
	default Rol toRol(RolEntity entity) {
		if(entity == null) {
			return null;
		}		
		return new Rol(entity.getId(),entity.getRol());
	
	}
	
}
