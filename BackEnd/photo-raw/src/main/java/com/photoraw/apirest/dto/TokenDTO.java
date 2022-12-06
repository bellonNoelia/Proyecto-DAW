package com.photoraw.apirest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenDTO {
	
	@JsonProperty
	private String token;

	public TokenDTO() {
		super();
	}

	public TokenDTO(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
