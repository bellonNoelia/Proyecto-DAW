package com.photoraw.apirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.photoraw.apirest.dto.TokenDTO;
import com.photoraw.apirest.dto.UserDTO;
import com.photoraw.domain.usecase.TokenUseCase;
import com.photoraw.domain.usecase.UserUseCase;

@RestController
@RequestMapping("api/login")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	@Autowired
	private UserUseCase userUseCase;
	@Autowired TokenUseCase tokenUseCase;

	@PostMapping
	public ResponseEntity<TokenDTO> login(@RequestBody(required = true) UserDTO usuario) {
		TokenDTO body = new TokenDTO(userUseCase.login(usuario.getEmail(),usuario.getPwd()));
		if(body.getToken()==null) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
		return ResponseEntity.ok().body(body);
	}

	@GetMapping("logout")
	public void logout(@RequestHeader("token") String token) {
		tokenUseCase.removeToken(token);
	}
	

}
