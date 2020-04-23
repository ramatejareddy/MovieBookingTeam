package com.cg.movie.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movie.dao.OnlinemovieBookingDAOInterface;
import com.cg.movie.entity.BookingState;
import com.cg.movie.entity.Seat;
import com.cg.movie.entity.user;
@Service
@Transactional
public class OnlinemovieBookingService implements OnlinemovieBookingServiceInterface {

	
	@Autowired
	OnlinemovieBookingDAOInterface dao;
	
	
	
	
	
	
	/***************************************
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	*       @author           Bathula SIVA GANESH
	*       Description       It is a service that provides service for fetching theatre details
	*       version           1.0
	*       created date      21-APR-2020
	*       
	*       
	*       
	*       
	*       
	*       
	*       
	*       
	*       
	*       
	****************************************/
	
	@Override
	public double totalCost(int seatId,int noOfSeats) {
		double seatPrice=dao.getPrice(seatId);
		double totalPrice= noOfSeats*seatPrice;
		
		return totalPrice;
	}
	@Override
	public List<user> getUserDetails() {
	
		return 	dao.getUserDetails();
	}
	@Override
	public List<Seat> getSeat() {
		// TODO Auto-generated method stub
		return dao.getSeat();
	}
		@Override
	public BookingState getseat(int seatId) {
		// TODO Auto-generated method stub
		BookingState suu = dao.getseat(seatId);
		return suu;
	}

}
