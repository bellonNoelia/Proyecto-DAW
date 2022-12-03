package com.photoraw.apirest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.photoraw.apirest.dto.UserDTO;

@RestController
@RequestMapping("api/login")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	
	@GetMapping("{email}/{pwd}")
	public ResponseEntity<String> login(
			@PathVariable("email")String email,
			@PathVariable("pwd") String pwd) {

		return ResponseEntity.ok().body("PRUEBA");
	}
	
	@PostMapping
	public ResponseEntity<String> login(@RequestBody(required = true) UserDTO usuario) {
		if(usuario != null && usuario.getEmail().contains("noe")) {
			ResponseEntity.ok().body("true");
		}
		return ResponseEntity.ok().body("false");
	}
	
}
