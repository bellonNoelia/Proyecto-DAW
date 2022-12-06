package com.photoraw.domain.usecase;

import java.util.List;

import com.photoraw.domain.entity.Photo;

public interface PhotoUseCase {
	List<Photo> findAllPhotos();

	void deletePhoto(Integer idPhoto);

	void updatePhoto(Photo photo);

	void createPhoto(Photo photo);
}
