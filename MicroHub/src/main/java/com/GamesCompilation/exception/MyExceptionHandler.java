package com.GamesCompilation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.persistence.EntityExistsException;

@ControllerAdvice
public class MyExceptionHandler extends ResponseEntityExceptionHandler {
	
@ExceptionHandler(EntityExistsException.class)
public ResponseEntity<String> entityExsist(EntityExistsException e){
	return new ResponseEntity<String>(e.getMessage(),HttpStatus.FOUND);
}
	
}
