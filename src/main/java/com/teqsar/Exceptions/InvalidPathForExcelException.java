package com.teqsar.Exceptions;

import com.teqsar.Exceptions.FramWorkException;

public class InvalidPathForExcelException extends FramWorkException{

	public InvalidPathForExcelException(String message) {
		super(message);

	}
	public InvalidPathForExcelException(String message, Throwable cause) {
		super(message,cause );

	}

}
