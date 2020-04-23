package com.cg.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.movie.entity.BookingState;
import com.cg.movie.entity.Seat;
import com.cg.movie.entity.user;
import com.cg.movie.exception.MovieBookingException;
import com.cg.movie.service.OnlinemovieBookingServiceInterface;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class OnlineMovieBookingController {
	@Autowired
	OnlinemovieBookingServiceInterface service;
	
	@GetMapping("/seatfare/{seatId}/{noOfSeats}")
	public String calculateFare(@PathVariable("seatId") int seatId,@PathVariable("noOfSeats") int noOfSeats)
	{
		double totalFare=service.totalCost(seatId,noOfSeats);
		String statement="total cost "+totalFare;
		return (statement);
	}
	@GetMapping("/getUserDetails")
	public List<user> userDetails(){
		List<user> userList= service.getUserDetails();
		return  userList;
	}
	@GetMapping("/getSeat")
	public List<Seat> getSeat(){
		List<Seat> userList= service.getSeat();
		return  userList;
	}
	@GetMapping("/view/{id}")
	public ResponseEntity<BookingState> viewSeatStatus(@PathVariable("id") int seatId)
	{
		BookingState tr=service.getseat(seatId);
		return new ResponseEntity<BookingState>(tr,HttpStatus.OK);
		
	}

	
}
