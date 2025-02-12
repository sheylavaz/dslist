package com.devsuperior.dslist.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	/*
	 * @ExceptionHandler(ResourceNotFoundException.class) public ResponseEntity<?>
	 * resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
	 * return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND); }
	 */

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(ex.getMessage(), HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
    // Outros manipuladores de exceções
}
