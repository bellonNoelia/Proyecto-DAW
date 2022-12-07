package com.photoraw.infrastructure.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.photoraw.domain.entity.Photo;
import com.photoraw.domain.repository.PhotoRepository;
import com.photoraw.infrastructure.mapper.PhotoMapper;
import com.photoraw.infrastructure.repository.execute.PhotoCrudRepository;

@Repository
public class PhotoRepositoryImpl implements PhotoRepository{
	
	@Autowired
	private PhotoCrudRepository crud;
	
	@Autowired
	private PhotoMapper photoMapper;
	
	@Override
	public List<Photo> findAllPhotos() {
		return photoMapper.toPhoto(crud.findAll());
	}

	@Override
	public void deletePhoto(Integer idPhoto) {
		crud.deleteById(idPhoto);
	}

	@Override
	public void updatePhoto(Photo photo) {
		crud.save(photoMapper.toPhotoEntity(photo));
	}

	@Override
	public void createPhoto(Photo photo) {
			//crud.save(photoMapper.toPhotoEntity(photo));
	}

	@Override
	public void updatePhoto(Integer idPhoto) {
		//TODO tiene que recibir toda la Photo no solo el ID
		//crud.save(photoMapper.toPhotoEntity(photo))
	}
}
