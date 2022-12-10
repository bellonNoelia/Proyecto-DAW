package com.photoraw.domain.repository;

import com.photoraw.domain.entity.Img;

public interface ImgRepository {
	
	Img find(int id);

	Integer save(Img img);
}
