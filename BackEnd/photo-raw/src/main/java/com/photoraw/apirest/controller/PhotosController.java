package com.photoraw.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.photoraw.apirest.dto.PhotoDTO;
import com.photoraw.apirest.mapper.PhotoDTOMapper;
import com.photoraw.domain.commons.TokenException;
import com.photoraw.domain.entity.Photo;
import com.photoraw.domain.usecase.PhotoUseCase;



@RestController
@RequestMapping("/api/photos")
@CrossOrigin(origins = "http://localhost:4200")
public class PhotosController {

	@Autowired
	private PhotoUseCase photoUseCase;
	@Autowired 
	private PhotoDTOMapper photoDTOMapper;
	
	@GetMapping("findAllPhotos")
	public ResponseEntity<List<PhotoDTO>>findAllPhotos(){
		List<PhotoDTO> result=photoDTOMapper.toPhotoDTO(photoUseCase.findAllPhotos());
		return ResponseEntity.ok().body(result);
		
	}
	@GetMapping("findPhotosByUser/{id}")
	public ResponseEntity<List<PhotoDTO>>findPhotosByUser(@PathVariable("id") Integer idUser){
		List<PhotoDTO> result=photoDTOMapper.toPhotoDTO(photoUseCase.findPhotosByUser(idUser));
		return ResponseEntity.ok().body(result);
		
	}
	@GetMapping("readPhoto/{id}")
	public ResponseEntity<Photo> readPhoto(@PathVariable("id") Integer idPhoto){
		PhotoDTO result=photoDTOMapper.toPhotoDTO(photoUseCase.readPhoto(idPhoto));
		return ResponseEntity.ok().body(photoDTOMapper.toPhoto(result));
		
	}
	@DeleteMapping("deletePhoto/{id}")
	public void deletePhoto(@PathVariable("id") Integer idPhoto) {
		photoUseCase.deletePhoto(idPhoto);
	}

	@PostMapping("updatePhoto")
	public void updatePhoto(@RequestBody(required = true) PhotoDTO photo) {
		photoUseCase.updatePhoto(photoDTOMapper.toPhoto(photo));
	}

	@PostMapping("createPhoto")
	public void createPhoto(
			@RequestHeader("token") String token,
			@RequestBody(required = true) PhotoDTO photo) {
		try {
			photoUseCase.createPhoto(photoDTOMapper.toPhoto(photo), token);
		} catch (TokenException e) {
			e.printStackTrace();
		}
	}
}
