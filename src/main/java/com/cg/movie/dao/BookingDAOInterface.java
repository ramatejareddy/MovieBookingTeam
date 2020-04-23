package com.cg.movie.dao;

import java.util.List;

import com.cg.movie.entity.Ticket;
import com.cg.movie.entity.user;

public interface BookingDAOInterface {
	public double getPrice(int seatId);
	public List<user> getUserDetails();
	public List<Ticket> getTicketDetails();

}
