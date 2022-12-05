package com.photoraw.apirest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.photoraw.domain.entity.Rol;

public class UserDTO {

	@JsonProperty
	private Integer id;
	@JsonProperty
	private byte[] avatar;
	@JsonProperty
	private String firstName;
	@JsonProperty
	private String lastName;
	@JsonProperty
	private int age;
	@JsonProperty
	private String email;
	@JsonProperty
	private String pwd;
	@JsonProperty
	private Rol rol;
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDTO(Integer id, byte[] avatar, String firstName, String lastName, int age, String email, String pwd,
			Rol rol) {
		super();
		this.id = id;
		this.avatar = avatar;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.pwd = pwd;
		this.rol = rol;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte[] getAvatar() {
		return avatar;
	}
	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	

	
	
	
}
