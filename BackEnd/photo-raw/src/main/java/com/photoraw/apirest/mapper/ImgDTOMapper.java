package com.photoraw.apirest.mapper;

import org.springframework.stereotype.Component;

import com.photoraw.apirest.dto.ImgDTO;
import com.photoraw.domain.entity.Img;

@Component
public class ImgDTOMapper {
	public Img toImg(Img img) {
		if (img == null) {
			return null;
		}
		return new Img(
				img.getId(),
				img.getImg());
				
	}
	
	public ImgDTO toImgDTO (Img img) {
		if (img == null) {
			return null;
		}
		return new ImgDTO(
				img.getId(),
				img.getImg());
				
	}


}
