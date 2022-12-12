package com.photoraw.domain.repository;

import java.util.List;

import com.photoraw.domain.entity.User;

public interface UserRepository {
	
	User login(String email, String pwd);
	
	 List<User> listadoArtistas(int idRol);

	User getArtist(int idRol, Integer idArtista);
}
