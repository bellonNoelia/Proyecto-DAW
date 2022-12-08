package com.photoraw.infrastructure.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.photoraw.domain.entity.Img;
import com.photoraw.infrastructure.entities.ImgEntity;

@Mapper
public interface ImgMapper {
	default Img toImg(ImgEntity entity) {
		return new Img(
				entity.getId(),
				entity.getImg());
	}

	default ImgEntity toImgEntity(Img img) {
		return new ImgEntity(
				img.getId(),
				img.getImg()
				);
				
	}
}
