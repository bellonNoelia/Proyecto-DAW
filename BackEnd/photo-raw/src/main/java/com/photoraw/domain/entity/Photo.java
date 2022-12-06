package com.photoraw.domain.entity;


public class Photo {
	private Integer id;
	private String title;
	private String price;
	private String size;
	private byte[] photo;
	private int idUser;
	private int idCategory;
	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Photo(Integer id, String title, String price, String size, byte[] photo, int idUser, int idCategory) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.size = size;
		this.photo = photo;
		this.idUser = idUser;
		this.idCategory = idCategory;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
	
	
	
}
