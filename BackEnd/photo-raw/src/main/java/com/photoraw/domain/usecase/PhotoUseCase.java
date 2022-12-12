package com.photoraw.domain.usecase;

import java.util.List;

import com.photoraw.domain.commons.TokenException;
import com.photoraw.domain.entity.Photo;

public interface PhotoUseCase {
	List<Photo> findAllPhotos();
	
	List<Photo> findPhotosByUser(Integer idUser);

	Photo readPhoto(Integer idPhoto);
	void deletePhoto(Integer idPhoto);

	void updatePhoto(Photo photo);

	void createPhoto(Photo photo, String token) throws TokenException;
}
