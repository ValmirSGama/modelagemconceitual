package com.valmirsales.modelagemconceitual.resources.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.valmirsales.modelagemconceitual.services.exception.ObjectNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFoundException(ObjectNotFoundException e, HttpServletRequest request){
		
		 StandardError error = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		 return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
}
