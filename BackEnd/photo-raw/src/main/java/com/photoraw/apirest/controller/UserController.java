package com.photoraw.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.photoraw.apirest.dto.UserDTO;
import com.photoraw.apirest.mapper.UserDTOMapper;
import com.photoraw.domain.commons.TokenException;
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
	public ResponseEntity<List<UserDTO>> listado(
			@RequestHeader("token") String token) {
		List<User> listadoArtistas;
		try {
			listadoArtistas = userUseCase.listadoArtistas(token);
		} catch (TokenException e) {
			return ResponseEntity.status(e.getHttpStatus()).build(); 
		}
		return ResponseEntity.ok().body(userDTOMapper.toUserDTOList(listadoArtistas));
	}
	
	@GetMapping("/artists/{id}")
	public ResponseEntity<UserDTO> listado(
			@RequestHeader("token") String token,
			@PathVariable("id") String idPhoto) {
		User artist;
		try {
			artist = userUseCase.getArtist(token, Integer.valueOf(idPhoto));
		} catch (TokenException e) {
			return ResponseEntity.status(e.getHttpStatus()).build(); 
		}
		return ResponseEntity.ok().body(userDTOMapper.toUserDTO(artist));
	}
	
	@GetMapping("/userLog")
	public ResponseEntity <Integer> userLog (@RequestHeader("token") String token ) {
		int id=-1;
		try {
			User user = userUseCase.usuarioLogado(token);
			id=user.getId();
			
		} catch (TokenException e) {
			return ResponseEntity.status(e.getHttpStatus()).build(); 
		}
		return ResponseEntity.ok().body(id);
	}
}
