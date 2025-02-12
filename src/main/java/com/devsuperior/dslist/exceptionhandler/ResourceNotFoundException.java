package com.devsuperior.dslist.exceptionhandler;

public class ResourceNotFoundException extends RuntimeException {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 4553200111101790227L;

	public ResourceNotFoundException(String message) {
	     super(message);
	 }
	
}
