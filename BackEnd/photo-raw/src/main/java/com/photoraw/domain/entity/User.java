package com.photoraw.domain.entity;

public class User {

	private Integer id;
	private int avatarId;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String pwd;
	private int rol;

	public User() {
		super();
	}

	public User(Integer id, int avatarId, String firstName, String lastName, int age, String email, String pwd, int rol) {
		super();
		this.id = id;
		this.avatarId = avatarId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.pwd = pwd;
		this.rol = rol;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getAvatar() {
		return avatarId;
	}

	public void setAvatar(int avatar) {
		this.avatarId = avatar;
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

	public int getRol() {
		return rol;
	}

	public void setRol(int rol) {
		this.rol = rol;
	}



}
