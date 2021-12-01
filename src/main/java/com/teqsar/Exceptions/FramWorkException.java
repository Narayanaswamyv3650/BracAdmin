package com.teqsar.Exceptions;

public class FramWorkException extends RuntimeException{
	
	/*
	 * here we are overriding the parent class methods 
	 * i.e Runtime exception have methods 
	 *  public RuntimeException(String message) {
        super(message);
    	}	
	 */
	
	public FramWorkException(String message) {
		super(message);
	}
	public FramWorkException(String message, Throwable cause) {
		super(message,cause);
	}

}
