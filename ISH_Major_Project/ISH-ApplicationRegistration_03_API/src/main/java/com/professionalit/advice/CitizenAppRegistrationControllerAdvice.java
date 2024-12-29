package com.professionalit.advice;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.professionalit.exception.InvalidSSNException;

@RestControllerAdvice
public class CitizenAppRegistrationControllerAdvice {
	
	@ExceptionHandler(InvalidSSNException.class)
	public ResponseEntity<String> hanleInvalidSSN(InvalidSSNException exception){
		return new  ResponseEntity<String>(exception.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> hanleAllExceptions(Exception exception){
		return new  ResponseEntity<String>(exception.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<String> hanleSQLExceptions(DataIntegrityViolationException exception){
		return new  ResponseEntity<String>("Issue in Server side...please contact admin",HttpStatus.BAD_REQUEST);
	}


}
