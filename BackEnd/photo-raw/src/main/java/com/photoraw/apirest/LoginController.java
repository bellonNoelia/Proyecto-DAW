package com.photoraw.apirest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/login")
public class LoginController {
	
	@GetMapping("{email}/{pwd}")
	public ResponseEntity<String> login(
			@PathVariable("email")String email,
			@PathVariable("pwd") String pwd) {

		return ResponseEntity.ok().body("PRUEBA");
	}
	
}
