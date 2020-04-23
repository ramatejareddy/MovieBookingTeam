package com.cg.movie.controller;
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

import com.cg.movie.entity.Movie;
import com.cg.movie.exception.MovieException;
import com.cg.movie.service.MovieService;





@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MovieController {
	
	@Autowired
	MovieService movieservice;
	
	@PostMapping("/movie")
	public ResponseEntity<String> saveBook(@RequestBody Movie tr) {
		if(tr.getMovieName().contentEquals("null")) throw new MovieException("Empty Name not allowed");
        movieservice.create(tr);
        
		return new ResponseEntity<String>("Trainer Added",HttpStatus.OK);
	}
	@GetMapping("/getmovies")
    public ResponseEntity<List<Movie>> getmovielist() {
			List<Movie> list = movieservice.reterive();
			return new ResponseEntity<List<Movie>>(list,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteMovie(@PathVariable("id") int id)
	{
		
		Boolean status = movieservice.delete(id);
		if(!status)throw new MovieException("Movie not found.");
		
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		
	}
	@GetMapping("/view/{id}")
	public ResponseEntity<Movie> viewMovie(@PathVariable("id") int id)
	{
		Movie tr=movieservice.findById(id);
		return new ResponseEntity<Movie>(tr,HttpStatus.OK);
		
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Object> updateMovie(@PathVariable("id") int id,@RequestBody Movie tr)
	{
		movieservice.update(id, tr.getMovieName(), tr.getLanguage(), tr.getGenre(), tr.getDirector());
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
