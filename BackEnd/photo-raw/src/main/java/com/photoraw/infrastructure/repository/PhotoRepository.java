package com.photoraw.infrastructure.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.photoraw.domain.entity.Photo;
import com.photoraw.infrastructure.mapper.PhotoMapper;
import com.photoraw.infrastructure.mapper.UserMapper;
import com.photoraw.infrastructure.repository.execute.PhotoCrudRepository;
import com.photoraw.infrastructure.repository.execute.UserCrudRepository;

@Repository
public class PhotoRepository {
	@Autowired
	private PhotoCrudRepository crud;
	
	@Autowired
	private PhotoMapper photoMapper;
	
	
	public List<Photo> findAllPhotos() {
		return photoMapper.toPhoto(crud.findAll());
	}


	public void deletePhoto(Integer idPhoto) {
		crud.deleteById(idPhoto);
	}


	public void updatePhoto(Photo photo) {
			crud.save(photoMapper.toPhotoEntity(photo));
	}

	
	public void createPhoto(Photo photo) {
			crud.save(photoMapper.toPhotoEntity(photo));
	}
}
