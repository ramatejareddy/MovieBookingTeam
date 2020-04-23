package com.cg.movie.service;

import java.util.List;

import com.cg.movie.entity.Theater;
import com.cg.movie.entity.Ticket;
import com.cg.movie.entity.user;

public interface BookingServiceInterface {
	public double totalCost(int seatId,int noOfSeats);
	public List<user> getUserDetails();
	public List<Ticket> getTicketDetails();
	public List<Theater> getTheater(int movieId);
	

}
