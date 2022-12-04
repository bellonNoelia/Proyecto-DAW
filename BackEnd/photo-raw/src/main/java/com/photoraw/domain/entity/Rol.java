package com.photoraw.domain.entity;


public class Rol {

	private int id;

	private String rol;

	public Rol(int id, String rol) {
		super();
		this.id = id;
		this.rol = rol;
	}
	public Rol() {
		super();
		// TODO Auto-generated constructor stub
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
