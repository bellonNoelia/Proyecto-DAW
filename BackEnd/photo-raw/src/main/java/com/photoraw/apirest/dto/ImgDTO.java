package com.photoraw.apirest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImgDTO {
	@JsonProperty
	private Integer id;
	@JsonProperty
	private byte[] img;
	public ImgDTO(Integer id, byte[] img) {
		super();
		this.id = id;
		this.img = img;
	}
	public ImgDTO() {
		super();

	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	
	
}
