package com.photoraw.application.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.photoraw.domain.entity.Img;
import com.photoraw.domain.repository.ImgRepository;
import com.photoraw.domain.usecase.ImgUseCase;

@Component
public class ImgUseCaseImpl implements ImgUseCase {
@Autowired

private ImgRepository imgRepository;

@Override
public Img find(int id) {
	return imgRepository.find(id);
}
}
