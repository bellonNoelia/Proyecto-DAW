package com.photoraw.domain.repository;

import java.util.List;

import com.photoraw.domain.entity.Photo;

public interface PhotoRepository {
	
	List<Photo> findAllPhotos();

	void deletePhoto(Integer idPhoto);

	void createPhoto(Photo photo);

	void updatePhoto(Photo photo);
}
