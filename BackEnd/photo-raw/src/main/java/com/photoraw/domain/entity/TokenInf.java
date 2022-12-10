package com.photoraw.domain.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class TokenInf {

	private User userInfo;
	
	private LocalTime fechaCreacionToken;

	public TokenInf() {
		super();
	}

	public TokenInf(User userInfo, LocalTime fechaCreacionToken) {
		super();
		this.userInfo = userInfo;
		this.fechaCreacionToken = fechaCreacionToken;
	}

	public User getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(User userInfo) {
		this.userInfo = userInfo;
	}

	public LocalTime  getFechaCreacionToken() {
		return fechaCreacionToken;
	}

	public void setFechaCreacionToken(LocalTime  fechaCreacionToken) {
		this.fechaCreacionToken = fechaCreacionToken;
	}
	
}
