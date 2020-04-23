package com.cg.movie.service;

import java.util.List;

import com.cg.movie.entity.BookingState;
import com.cg.movie.entity.Seat;
import com.cg.movie.entity.user;

public interface OnlinemovieBookingServiceInterface {
	public double totalCost(int seatId,int noOfSeats);
	public List<user> getUserDetails();
	public List<Seat> getSeat();
	//Seat getPrice1();
	//public Seat getPrice1(int seatId);
	public BookingState getseat(int seatId);
	

}
