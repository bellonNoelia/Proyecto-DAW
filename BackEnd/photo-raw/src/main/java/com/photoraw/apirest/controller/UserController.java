package com.photoraw.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.photoraw.apirest.dto.UserDTO;
import com.photoraw.apirest.mapper.UserDTOMapper;
import com.photoraw.domain.entity.User;
import com.photoraw.domain.usecase.UserUseCase;

@RestController
@RequestMapping("api/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserUseCase userUseCase;
	@Autowired
	private UserDTOMapper userDTOMapper;

	@GetMapping("/artists")
	public ResponseEntity<List<UserDTO>> listado() {
		List<User> listadoArtistas = userUseCase.listadoArtistas();
		return ResponseEntity.ok().body(userDTOMapper.toUserDTOList(listadoArtistas));
	}
}
