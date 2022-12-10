package com.photoraw.infrastructure.mapper;

import java.sql.Blob;
import java.sql.SQLException;


import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import org.apache.ibatis.annotations.Mapper;

import com.photoraw.domain.entity.Img;
import com.photoraw.infrastructure.entities.ImgEntity;

@Mapper
public interface ImgMapper {
	
	default Img toImg(ImgEntity entity) {
		Blob img = entity.getImg();
		if(img == null) {
			return null;
		}	
		
		byte[] blobAsBytes;
		try {
			blobAsBytes = img.getBytes(1, (int) img.length());
		} catch (SQLException e) {
			return null;
		}	
		
		return new Img(
				entity.getId(),
				blobAsBytes);
	}

	default ImgEntity toImgEntity(Img img) {
		if(img == null || img.getImg()== null) {
			return null;
		}
		Blob imgBlob;
		try {
			imgBlob = new SerialBlob(img.getImg());
		} catch (SerialException e) {
			return null;
		} catch (SQLException e) {
			return null;
		}
		return new ImgEntity(
				img.getId(),
				imgBlob
				);		
	}
}
