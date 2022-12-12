package com.photoraw.domain.repository;

import java.util.List;

import com.photoraw.domain.entity.Photo;

public interface PhotoRepository {
	
	List<Photo> findAllPhotos();

	List<Photo> findPhotosByUser(Integer idUser);
	
	Photo readPhoto(Integer idPhoto);
	
	void deletePhoto(Integer idPhoto);

	void createPhoto(Photo photo);

	void updatePhoto(Photo photo);
}
