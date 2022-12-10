package com.photoraw.domain.commons;

import org.springframework.http.HttpStatus;


public class TokenExpiredException extends TokenException {

	private static final long serialVersionUID = 1L;

	public TokenExpiredException() {
		super();
	}

	public TokenExpiredException(String message) {
		super(message);
	}
	
	@Override
	public HttpStatus getHttpStatus() {
		return HttpStatus.FORBIDDEN; 
	}

}
