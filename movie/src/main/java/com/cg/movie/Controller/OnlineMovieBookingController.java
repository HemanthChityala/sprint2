package com.cg.movie.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cg.movie.service.TheatreServiceInterface;

@RestController
public class OnlineMovieBookingController {
	@Autowired
	TheatreServiceInterface service;
	
	@GetMapping("/theatreName/{theatreId}")
	public ResponseEntity<String> getTheatreName(@PathVariable("theatreId") int theatreId)
	{
		String theatreName=service.theatreName(theatreId);
		String statement=theatreName;
		return new ResponseEntity<String>(statement,HttpStatus.OK);
	}

}

