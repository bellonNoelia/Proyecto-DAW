package com.photoraw.apirest.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.photoraw.apirest.dto.UserDTO;
import com.photoraw.domain.entity.User;
import com.photoraw.domain.usecase.UserUseCase;

@RestController
@RequestMapping("api/login")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	@Autowired
	private UserUseCase userUseCase;

	@GetMapping("{email}/{pwd}")
	public ResponseEntity<String> login(@PathVariable("email") String email, @PathVariable("pwd") String pwd) {

		return ResponseEntity.ok().body("PRUEBA");
	}

	@PostMapping
	public ResponseEntity<String> login(@RequestBody(required = true) UserDTO usuario) {

		User login = userUseCase.login(usuario.getEmail(),usuario.getPwd());
		
		if (login  == null) {
			return ResponseEntity.notFound().build();
		}
		String datoEntrada = usuario.getEmail()+usuario.getPwd();
		String token = Base64.getEncoder().encodeToString(datoEntrada.getBytes());
		
		return ResponseEntity.ok().body(token);
	}

}
