package com.cg.movie.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.movie.entity.Theatre;
import com.cg.movie.service.TheatreService;
@RequestMapping("/theatre")
@RestController
public class OnlineMovieBookingController {
	@Autowired
	TheatreService service;
	
	@PostMapping("/theatredetails")
	public ResponseEntity<Object> savetheatre(@RequestBody Theatre tr) {
        service.create(tr);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/gettheatredetails")
    public ResponseEntity<List<Theatre>> getTheatrelist() {
			List<Theatre> list = service.reterive();
			return new ResponseEntity<List<Theatre>>(list,HttpStatus.OK);
	}
	@GetMapping("/theatreName/{theatreId}")
	public ResponseEntity<String> getTheatreName(@PathVariable("theatreId") int theatreId)
	{
		String theatreName=service.theatreName(theatreId);
		String statement=theatreName;
		return new ResponseEntity<String>(statement,HttpStatus.OK);
	}

}

