package com.photoraw.apirest.controller;

	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.photoraw.apirest.dto.UserDTO;
import com.photoraw.apirest.mapper.UserDTOMapper;
import com.photoraw.domain.entity.User;
import com.photoraw.domain.usecase.RegisterUseCase;

	@RestController
	@RequestMapping("api/register")
	@CrossOrigin(origins = "http://localhost:4200")

public class RegisterController {

		@Autowired
		private RegisterUseCase registerUseCase;
		@Autowired
		private UserDTOMapper registerMapper;


		@PostMapping
		public ResponseEntity<String> register(@RequestBody(required = true) UserDTO usuario) {

			User register = registerUseCase.register(registerMapper.toUser(usuario));
			
			if (register  == null) {
				return ResponseEntity.notFound().build();
			}
			
			return ResponseEntity.accepted().build();
		}

	
}
