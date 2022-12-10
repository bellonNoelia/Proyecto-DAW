package com.photoraw.domain.usecase;

import com.photoraw.domain.entity.Img;

public interface ImgUseCase {
	Img find(int id);
	
	Integer save(Img img);
}
