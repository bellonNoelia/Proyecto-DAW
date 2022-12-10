package com.photoraw.domain.commons;

import org.springframework.http.HttpStatus;


public class LogOutException extends TokenException {

	private static final long serialVersionUID = 1L;

	public LogOutException() {
		super();
	}

	public LogOutException(String message) {
		super(message);
	}
	
	@Override
	public HttpStatus getHttpStatus() {
		return HttpStatus.UNAUTHORIZED; 
	}
	
}
