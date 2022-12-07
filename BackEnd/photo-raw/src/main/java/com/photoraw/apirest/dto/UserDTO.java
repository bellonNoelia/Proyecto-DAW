package com.photoraw.apirest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {

	@JsonProperty
	private Integer id;
	@JsonProperty
	private byte[] avatar;
	@JsonProperty
	private String firstname;
	@JsonProperty
	private String lastname;
	@JsonProperty
	private int age;
	@JsonProperty
	private String email;
	@JsonProperty
	private String pwd;
	@JsonProperty
	private int rol;
	
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserDTO(Integer id, byte[] avatar, String firstName, String lastName, int age, String email, String pwd,
			int idRol) {
		super();
		this.id = id;
		this.avatar = avatar;
		this.firstname = firstName;
		this.lastname = lastName;
		this.age = age;
		this.email = email;
		this.pwd = pwd;
		this.rol = idRol;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public byte[] getAvatar() {
		return avatar;
	}
	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastName) {
		this.lastname = lastName;
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

	public int getIdRol() {
		return rol;
	}

	public void setIdRol(int idRol) {
		this.rol = idRol;
	}

}
