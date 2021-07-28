package com.prakash.messaging.exceptions;

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(String exceptionMessage) {
		super(exceptionMessage);
	}
}
