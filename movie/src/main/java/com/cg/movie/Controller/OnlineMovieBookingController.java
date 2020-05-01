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

import com.cg.movie.Exception.TheatreIdNotFoundException;
import com.cg.movie.entity.Theatre;
import com.cg.movie.service.TheatreService;
@CrossOrigin(origins = "http://localhost:4200")
/**************************************************************************************************
@RequestMapping               -It is used to map web requests onto specific handler classes 
                               or handler methods.
**************************************************************************************************/
@RequestMapping("/theatre")
@RestController
public class OnlineMovieBookingController {
	@Autowired
	TheatreService service;
/**************************************************************************************************
	 *@PostMapping             -Handles the Http post requests.
     *created by               -Hemanth Reddy
     *created date             -21-APR-2020
**************************************************************************************************/
	@PostMapping("/theatredetails")
	public ResponseEntity<Object> savetheatre(@RequestBody Theatre th) {
        service.create(th);
		return new ResponseEntity<>(HttpStatus.OK);
	}
/**************************************************************************************************
	 *@GetMapping              -Handles HTTP GET requests.
     *created by               -Hemanth Reddy
     *created date             -21-APR-2020
**************************************************************************************************/
	@GetMapping("/listalltheatres")
    public ResponseEntity<List<Theatre>> getTheatrelist() {
			List<Theatre> list = service.reterive();
			return new ResponseEntity<List<Theatre>>(list,HttpStatus.OK);
	}
/**************************************************************************************************
	 *@DeleteMapping           -Handles HTTP DELETE requests.
     *created by               -Hemanth Reddy
     *created date             -21-APR-2020
**************************************************************************************************/
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteTheatre(@PathVariable("id") int id)
	{
		service.delete(id);
		return new ResponseEntity<>("Deleted",HttpStatus.NO_CONTENT);
	}
/**************************************************************************************************
	 *@GetMapping              -Handles HTTP GET requests.
     *created by               -Hemanth Reddy
     *created date             -21-APR-2020
**************************************************************************************************/
	@GetMapping("/view/{id}")
	public ResponseEntity<Theatre> viewTheatre(@PathVariable("id") int id)
	{
		Theatre th=service.findById(id);
		return new ResponseEntity<Theatre>(th,HttpStatus.OK);
		
	}
/**************************************************************************************************
     *@PutMapping              -Handles HTTP PUT requests.
     *created by               -Hemanth Reddy
     *created date             -21-APR-2020
**************************************************************************************************/
	@PutMapping("/update/{id}")
	public ResponseEntity<Object> updateTheatre(@PathVariable("id") int id,@RequestBody Theatre th)
	{
		service.update(id,th.getTheatreName() ,th.getTheatreCity() ,th.getManagerName() ,th.getManagerContact());
		return new ResponseEntity<>(HttpStatus.OK);
	}
}

