package com.photoraw.apirest.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.photoraw.apirest.dto.UserDTO;
import com.photoraw.domain.entity.Rol;
import com.photoraw.domain.entity.User;

@Component
public class UserDTOMapper {
	public User toUser(UserDTO dto) {
		if (dto == null) {
			return null;
		}
		return new User(dto.getId(), dto.getAvatar(), dto.getFirstName(), dto.getLastName(), dto.getAge(),
				dto.getEmail(), dto.getPwd(), dto.getIdRol());
	}

	public Rol toRol(Rol rol) {
		if (rol == null) {
			return null;
		}
		return new Rol(rol.getId(), rol.getRol());

	}

	public UserDTO toUserDTO(User user) {
		if (user == null) {
			return null;
		}
		return new UserDTO(user.getId(), user.getAvatar(), user.getFirstName(), user.getLastName(), user.getAge(),
				user.getEmail(), user.getPwd(), user.getRol());
	}

	public List<UserDTO> toUserDTOList(List<User> list) {
		List<UserDTO> listaDTO = new ArrayList<>();
		for (User user : list) {
			listaDTO.add(this.toUserDTO(user));
		}
		return listaDTO;
	}
}
