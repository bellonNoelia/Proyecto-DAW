package com.photoraw.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.photoraw.domain.entity.Photo;
import com.photoraw.infrastructure.entities.PhotoEntity;

@Mapper
public interface PhotoMapper {
default List<Photo> toPhoto(List<PhotoEntity> entities){
	if(entities==null) {
		return new ArrayList<>();
	}
	List<Photo> result=new ArrayList<>();
	for(PhotoEntity entity:entities) {
		result.add(toPhoto(entity));
	}
	return result;
}

default Photo toPhoto(PhotoEntity entity) {
	return new Photo(
			entity.getId(),
			entity.getTitle(),
			entity.getPrice(),
			entity.getSize(),
			entity.getIdUser(),
			entity.getIdCategory(),
			entity.getIdPhoto(),
			null);
}

default PhotoEntity toPhotoEntity(Photo photo) {
	return new PhotoEntity(
			photo.getId(),
			photo.getTitle(),
			photo.getPrice(),
			photo.getSize(),
			photo.getIdPhoto(),
			photo.getIdUser(),
			photo.getIdCategory());
			
}
}
