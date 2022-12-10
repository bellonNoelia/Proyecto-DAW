package com.photoraw.infrastructure.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "photo")
public class PhotoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "photo_name")
	private String title;
	@Column(name = "photo_price")
	private String price;
	@Column(name = "photo_size")
	private String size;
	@Column (name = "id_img")
	private int idPhoto;
	@Column(name = "user_id ")
	private int idUser;
	@Column(name = "category_id ")
	private int idCategory;

	public PhotoEntity() {
		super();
		
	}

	public PhotoEntity(Integer id, String title, String price, String size, int idPhoto, int idUser, int idCategory) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.size = size;
		this.idPhoto = idPhoto;
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

	public int getIdPhoto() {
		return idPhoto;
	}

	public void setIdPhoto(int photo) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
