package com.cg.movie.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movie.dao.BookingDAOInterface;
import com.cg.movie.entity.Ticket;
import com.cg.movie.entity.user;
@Service
@Transactional
public class BookingService implements BookingServiceInterface {

	
	@Autowired
	BookingDAOInterface dao;
	/********************************************************************************************************************
	*       @author           Rama Teja Reddy
	*       Description       It is a service that provides service for calculating the booking cost
	*       version           1.0
	*       created date      21-APR-2020
	********************************************************************************************************************/
	
	
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
	/********************************************************************************************************************
	*       @author           Rama Teja Reddy
	*       Description       It is a service that provides service for fetching the ticket details
	*       version           1.0
	*       created date      21-APR-2020
	********************************************************************************************************************/
	
	
	@Override
	public List<Ticket> getTicketDetails() {
	
		return dao.getTicketDetails();
	}

}
