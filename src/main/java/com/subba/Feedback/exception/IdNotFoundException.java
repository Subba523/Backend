package com.subba.Feedback.exception;

public class IdNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public IdNotFoundException(String message) {
		super(message);
	}
}
	