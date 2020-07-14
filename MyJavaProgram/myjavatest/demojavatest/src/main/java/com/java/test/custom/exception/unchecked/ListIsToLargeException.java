package com.java.test.custom.exception.unchecked;

public class ListIsToLargeException extends RuntimeException {
	public ListIsToLargeException(String message)
	{
		super(message);
	}
}
