package com.photoraw.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;

import com.photoraw.apirest.dto.UserDTO;
import com.photoraw.domain.entity.Rol;
import com.photoraw.domain.entity.User;
import com.photoraw.infrastructure.entities.RolEntity;
import com.photoraw.infrastructure.entities.UserEntity;

@Mapper
public interface UserMapper {
	
	default public List<User> toUserList(List<UserEntity> listEntity) {
		List<User> lista = new ArrayList<>();
		for (UserEntity user : listEntity) {
			lista.add(this.toUser(user));
		}
		return lista;
	}

	default public User toUser(UserEntity entity) {
		if (entity == null) {
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
				entity.getIdRol());
	}

	default public UserEntity toUserEntity(User user) {
		if (user == null) {
			return null;
		}
		return new UserEntity(
				user.getId(), 
				user.getAvatar(), 
				user.getFirstName(), 
				user.getLastName(), 
				user.getAge(),
				user.getEmail(), 
				user.getPwd(),
				user.getRol());
	}

	default Rol toRol(RolEntity entity) {
		if (entity == null) {
			return null;
		}
		return new Rol(entity.getId(), entity.getRol());

	}

	default RolEntity toRolEntity(Rol rol) {
		if (rol == null) {
			return null;
		}
		return new RolEntity(rol.getId(), rol.getRol());

	}

}
