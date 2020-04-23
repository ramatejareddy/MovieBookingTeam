package com.cg.springbootjpa.controller;

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
import org.springframework.web.bind.annotation.RestController;


import com.cg.springbootjpa.exception.ShowException;
import com.cg.springbootjpa.model.Movie;
import com.cg.springbootjpa.model.Show;

import com.cg.springbootjpa.service.ShowService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ShowController {
	@Autowired
	ShowService showservice;
	
	@PostMapping("/addShow")
	public ResponseEntity<String> saveBook(@RequestBody Show tr) {
		if(tr.getShowName().contentEquals("null")) throw new ShowException("Mech Department not allowed");
        showservice.create(tr);
        
		return new ResponseEntity<String>("Show Added",HttpStatus.OK);
	}
	@GetMapping("/getshow")
    public ResponseEntity<List<Show>> getshowlist() {
			List<Show> list = showservice.reterive();
			return new ResponseEntity<List<Show>>(list,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteMovie(@PathVariable("id") int id)
	{
		
		Boolean status = showservice.delete(id);
		if(!status)throw new ShowException("show not found.");
		
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		
	}
	@GetMapping("/viewbyid/{id}")
	public ResponseEntity<Show> viewshow(@PathVariable("id") int id)
	{
		Show tr=showservice.findById(id);
		return new ResponseEntity<Show>(tr,HttpStatus.OK);
		
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Object> updateshow(@PathVariable("id") int id,@RequestBody Show tr)
	{
		showservice.update(id, tr.getShowName(), tr.getSeats(), tr.getScreenName(), tr.getMovie(),tr.getTheater());
		return new ResponseEntity<>(HttpStatus.OK);
	}


}
