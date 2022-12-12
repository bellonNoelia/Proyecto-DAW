package com.photoraw.apirest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhotoDTO {
	@JsonProperty
	private Integer id;
	@JsonProperty
	private String title;
	@JsonProperty
	private String price;
	@JsonProperty
	private String size;
	@JsonProperty
	private Integer idPhoto;
	@JsonProperty
	private String infoPhotobase64;
	@JsonProperty
	private int idArtist;
	@JsonProperty
	private int idCategory;
	
	public PhotoDTO() {
		super();
	
	}
	public PhotoDTO(Integer id, String title, String price, String size, int idArtist, int idCategory, Integer idPhoto, String infoPhotobase64) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.size = size;
		this.idArtist = idArtist;
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
	public int getIdArtist() {
		return idArtist;
	}
	public void setIdArtist(int idUser) {
		this.idArtist = idUser;
	}
	public int getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
	public Integer getIdPhoto() {
		return idPhoto;
	}
	public void setIdPhoto(Integer idPhoto) {
		this.idPhoto = idPhoto;
	}
	public String getInfoPhotobase64() {
		return infoPhotobase64;
	}
	public void setInfoPhotobase64(String infoPhotobase64) {
		this.infoPhotobase64 = infoPhotobase64;
	}
	
	
}
