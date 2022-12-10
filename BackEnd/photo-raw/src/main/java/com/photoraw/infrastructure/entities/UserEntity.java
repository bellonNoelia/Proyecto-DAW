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
@Table(name = "user")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
   	@Column (name = "img_id")
	private int avatar;
	@Column(name = "user_name")
	private String firstName;
	@Column(name = "user_lastname")
	private String lastName;
	@Column(name = "user_age")
	private int age;
	@Column(name = "user_email")
	private String email;
	@Column(name = "user_password")
	private String pwd;
//	@ManyToOne
//	private RolEntity rol;
	@Column(name = "rol_id")
	private int idRol;


	public UserEntity(Integer id, int avatarId, String firstName, String lastName, int age, String email, String pwd,
			int idRol) {
		super();
		this.id = id;
		this.avatar = avatarId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.pwd = pwd;
		this.idRol = idRol;
	}

	public UserEntity() {
		super();

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getAvatar() {
		return avatar;
	}

	public void setAvatar(int avatar) {
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

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	
}
