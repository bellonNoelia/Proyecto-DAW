package com.photoraw.domain.entity;

public class Photo {
	private Integer id;
	private String title;
	private String price;
	private String size;
	private Integer idPhoto;
	private String infoPhotobase64;
	private int idUser;
	private int idCategory;

	public Photo() {
		super();
	}

	public Photo(Integer id, String title, String price, String size, int idUser, int idCategory, Integer idPhoto, String infoPhotobase64) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.size = size;
		this.idUser = idUser;
		this.idCategory = idCategory;
		this.idPhoto = idPhoto;
		this.infoPhotobase64 = infoPhotobase64;
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

	public Integer getIdPhoto() {
		return idPhoto;
	}

	public void setIdPhoto(Integer photo) {
		this.idPhoto = photo;
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

	public String getInfoPhotobase64() {
		return infoPhotobase64;
	}

	public void setInfoPhotobase64(String infoPhotobase64) {
		this.infoPhotobase64 = infoPhotobase64;
	}

}
