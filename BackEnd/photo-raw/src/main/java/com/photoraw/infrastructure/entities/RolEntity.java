package com.photoraw.infrastructure.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class RolEntity {
	
    @Id
	private int id;
	@Column
	private String rol;
	public RolEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RolEntity(int id, String rol) {
		super();
		this.id = id;
		this.rol = rol;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
}
