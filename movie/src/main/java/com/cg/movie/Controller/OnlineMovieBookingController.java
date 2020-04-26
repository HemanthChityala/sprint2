package com.cg.movie.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteTheatre(@PathVariable("id") int id)
	{
		service.delete(id);
		return new ResponseEntity<>("Deleted",HttpStatus.NO_CONTENT);
	}
	@GetMapping("/view/{id}")
	public ResponseEntity<Theatre> viewTrainer(@PathVariable("id") int id)
	{
		Theatre th=service.findById(id);
		return new ResponseEntity<Theatre>(th,HttpStatus.OK);
		
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Object> updateTrainer(@PathVariable("id") int id,@RequestBody Theatre th)
	{
		service.update(id,th.getTheatreName() ,th.getCity() ,th.getManagerName() ,th.getManagerContact());
		return new ResponseEntity<>(HttpStatus.OK);
	}
}

