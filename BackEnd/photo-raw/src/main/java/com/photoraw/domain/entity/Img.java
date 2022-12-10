package com.photoraw.domain.entity;

public class Img {
	
	private Integer id;
	
	private byte[] img;
	
	public Img() {
		super();	
	}
	
	public Img(Integer id, byte[] img) {
		super();
		this.id = id;
		this.img = img;
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
