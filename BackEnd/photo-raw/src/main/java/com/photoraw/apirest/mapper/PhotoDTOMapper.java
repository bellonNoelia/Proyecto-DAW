package com.photoraw.apirest.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.photoraw.apirest.dto.PhotoDTO;
import com.photoraw.domain.entity.Photo;

@Component
public class PhotoDTOMapper {
	public List<PhotoDTO> toPhotoDTO(List<Photo> entities){
		if(entities==null) {
			return new ArrayList<>();
		}
		List<PhotoDTO> result=new ArrayList<>();
		for(Photo entity:entities) {
			result.add(toPhotoDTO(entity));
		}
		return result;
	}

	public Photo toPhoto(PhotoDTO dto) {
		if (dto == null) {
			return null;
		}
		return new Photo(
				dto.getId(), 
				dto.getTitle(), 
				dto.getPrice(), 
				dto.getSize(), 
				dto.getIdUser(),
				dto.getIdCategory(),
				null,
				dto.getInfoPhotobase64());

	}
	public PhotoDTO toPhotoDTO(Photo entity) {
		if (entity == null) {
			return null;
		}
		return new PhotoDTO(
				entity.getId(), 
				entity.getTitle(), 
				entity.getPrice(), 
				entity.getSize(), 
				entity.getIdUser(),
				entity.getIdCategory(),
				entity.getIdPhoto(),
				null);

	}
}
