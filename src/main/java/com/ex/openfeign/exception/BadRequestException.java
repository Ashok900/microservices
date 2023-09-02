package com.ex.openfeign.exception;

public class BadRequestException extends Exception{
	
	public BadRequestException(String message) {
		super(message);
	}

}
