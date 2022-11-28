package com.photoraw.apirest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {

	@JsonProperty
	private String email;
	
	@JsonProperty
	private String pwd;
	
	public UserDTO() {
		super();
	}
	
	public UserDTO(String email, String pwd) {
		super();
		this.email = email;
		this.pwd = pwd;
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
	
	
	
}
