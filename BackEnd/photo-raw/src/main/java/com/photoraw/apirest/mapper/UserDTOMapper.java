package com.photoraw.apirest.mapper;

import org.springframework.stereotype.Component;

import com.photoraw.apirest.dto.UserDTO;
import com.photoraw.domain.entity.Rol;
import com.photoraw.domain.entity.User;
@Component
public class UserDTOMapper {
	 public User toUser(UserDTO dto) {
		if(dto == null) {
			return null;
		}
			return new User(
					dto.getId(),
					dto.getAvatar(), 
					dto.getFirstName(), 
					dto.getLastName(), 
					dto.getAge(), 
					dto.getEmail(), 
					dto.getPwd(), 
					dto.getIdRol());
	}
	
	public Rol toRol(Rol rol) {
		if(rol == null) {
			return null;
		}		
		return new Rol(rol.getId(),rol.getRol());
	
	}
}
