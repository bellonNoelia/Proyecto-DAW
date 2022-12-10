package com.photoraw.domain.commons;

import org.springframework.http.HttpStatus;


public abstract class TokenException extends Exception {

	private static final long serialVersionUID = 1L;

	public TokenException() {
		super();
	}

	public TokenException(String message) {
		super(message);
	}
	
	public abstract HttpStatus getHttpStatus();
	
}
