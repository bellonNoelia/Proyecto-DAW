package com.photoraw.apirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.photoraw.apirest.dto.TokenDTO;
import com.photoraw.apirest.dto.UserDTO;
import com.photoraw.domain.usecase.UserUseCase;

@RestController
@RequestMapping("api/login")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	@Autowired
	private UserUseCase userUseCase;


	@PostMapping
	public ResponseEntity<TokenDTO> login(@RequestBody(required = true) UserDTO usuario) {
		return ResponseEntity.ok().body(new TokenDTO(userUseCase.login(usuario.getEmail(),usuario.getPwd())));
	}

}
