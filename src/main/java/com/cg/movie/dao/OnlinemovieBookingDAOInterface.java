package com.cg.movie.dao;

import java.util.List;

import com.cg.movie.entity.BookingState;
import com.cg.movie.entity.Seat;
import com.cg.movie.entity.user;

public interface OnlinemovieBookingDAOInterface {
	public double getPrice(int seatId);
	public List<user> getUserDetails();
	public List<Seat> getSeat();
	
	BookingState getseat(int seatId);


}
