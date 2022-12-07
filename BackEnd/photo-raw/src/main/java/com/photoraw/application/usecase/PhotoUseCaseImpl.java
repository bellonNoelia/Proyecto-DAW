package com.photoraw.application.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.photoraw.domain.entity.Photo;
import com.photoraw.domain.repository.PhotoRepository;
import com.photoraw.domain.usecase.PhotoUseCase;

@Component
public class PhotoUseCaseImpl implements PhotoUseCase {
	
	@Autowired
	private PhotoRepository photoRepository;

	@Override
	public List<Photo> findAllPhotos() {
		return photoRepository.findAllPhotos();
	}

	@Override
	public void deletePhoto(Integer idPhoto) {
		photoRepository.deletePhoto(idPhoto);
	}

	@Override
	public void updatePhoto(Photo photo) {
		photoRepository.updatePhoto(photo);
	}

	@Override
	public void createPhoto(Photo photo) {
		photoRepository.createPhoto(photo);
	}
}
