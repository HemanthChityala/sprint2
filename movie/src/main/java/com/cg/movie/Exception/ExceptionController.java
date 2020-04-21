package com.cg.movie.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.movie.Exception.TheatreException;

public class ExceptionController {
	@ExceptionHandler(value = TheatreException.class)
	public ResponseEntity<Object> handleException(TheatreException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}
}
