package com.photoraw.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.photoraw.domain.entity.Img;
import com.photoraw.domain.repository.ImgRepository;
import com.photoraw.infrastructure.entities.ImgEntity;
import com.photoraw.infrastructure.mapper.ImgMapper;
import com.photoraw.infrastructure.repository.execute.ImgCrudRepository;


@Repository
public class ImgRepositoryImpl implements ImgRepository {

	@Autowired
	private ImgCrudRepository crud;

	@Autowired
	private ImgMapper imgMapper;

	@Override
	public Img find(int id) {
		ImgEntity findById = crud.findById(id);
		return imgMapper.toImg(findById);
	}

	@Override
	public Integer save(Img img) {
		ImgEntity savedEntity = crud.save(imgMapper.toImgEntity(img));
		return savedEntity != null ? savedEntity.getId() : null;
	}
}
