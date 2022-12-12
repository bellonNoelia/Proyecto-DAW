package com.photoraw.application.usecase;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.apache.commons.codec.binary.Base64;

import com.photoraw.domain.commons.TokenException;
import com.photoraw.domain.entity.Img;
import com.photoraw.domain.entity.Photo;
import com.photoraw.domain.entity.User;
import com.photoraw.domain.repository.PhotoRepository;
import com.photoraw.domain.usecase.ImgUseCase;
import com.photoraw.domain.usecase.PhotoUseCase;
import com.photoraw.domain.usecase.TokenUseCase;

@Component
public class PhotoUseCaseImpl implements PhotoUseCase {
	
	@Autowired
	private PhotoRepository photoRepository;
	
	@Autowired
	private ImgUseCase imgUseCase;
	
	@Autowired
	private TokenUseCase tokenUseCase; 

	@Override
	public List<Photo> findAllPhotos() {
		return photoRepository.findAllPhotos();
	}

	@Override
	public List<Photo> findPhotosByUser(Integer idUser) {
		return photoRepository.findPhotosByUser(idUser);
	}
	@Override
	public Photo readPhoto(Integer idPhoto) {
		return photoRepository.readPhoto(idPhoto);
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
	@Transactional
	public void createPhoto(Photo photo, String token) throws TokenException {
		String infoPhotobase64 = photo.getInfoPhotobase64();
		if (infoPhotobase64 != null) {
			// info Usuario
			User userByToken = tokenUseCase.getUserByToken(token);

			if (userByToken != null) {
				photo.setIdUser(userByToken.getId());

				// info imagen
				byte[] decodedByte = Base64.decodeBase64(infoPhotobase64);
				Integer savedImg = imgUseCase.save(new Img(null, decodedByte));
				photo.setIdPhoto(savedImg);

				photoRepository.createPhoto(photo);
			}
		}
	}
}
