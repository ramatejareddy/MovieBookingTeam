package com.cg.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.movie.entity.Theater;
import com.cg.movie.entity.Ticket;
import com.cg.movie.entity.user;
import com.cg.movie.exception.MovieBookingException;
import com.cg.movie.service.BookingServiceInterface;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class OnlineMovieBookingController {
	@Autowired
	BookingServiceInterface service;
	
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
	@GetMapping("/getTicketDetails")
	public List<Ticket> getTicketDetails(@RequestBody Ticket ticket) {
		List<Ticket> ticketDetails=service.getTicketDetails();
		return ticketDetails;
	}
	@GetMapping("/getTheater/{movieId}")
	public List<Theater> getTheater(@PathVariable("movieId") int movieId) throws MovieBookingException{
		List<Theater> theaterList =service.getTheater(movieId);
		if(theaterList.isEmpty())
		{
			 throw new MovieBookingException("movie id is not found"+movieId);
		}
		return theaterList;
	}

}
