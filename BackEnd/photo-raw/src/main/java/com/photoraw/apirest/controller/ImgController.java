package com.photoraw.apirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.photoraw.apirest.dto.ImgDTO;
import com.photoraw.apirest.mapper.ImgDTOMapper;
import com.photoraw.domain.usecase.ImgUseCase;

@RestController
@RequestMapping("api/img")
@CrossOrigin(origins = "http://localhost:4200")
public class ImgController {
	@Autowired
	private ImgUseCase imgUseCase;
	@Autowired
	private ImgDTOMapper imgDTOMapper;

	@GetMapping("{idPhoto}")
	public ResponseEntity<byte[]> find(@PathVariable("idPhoto") int idPhoto) {
		ImgDTO result = imgDTOMapper.toImgDTO(imgUseCase.find(idPhoto));
		return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(result.getImg());
	}
	
}
