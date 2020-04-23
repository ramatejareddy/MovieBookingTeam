package com.cg.movie.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.movie.entity.BookingState;
import com.cg.movie.entity.Seat;
import com.cg.movie.entity.user;
import com.cg.movie.exception.MovieBookingException;

@Repository
public class OnlinemovieBookingDAO implements OnlinemovieBookingDAOInterface{
	@PersistenceContext
	EntityManager entityManager;
	Seat seat=new Seat();
	

	@Override
	public double getPrice(int seatId) {
		
		Seat s1=entityManager.find(Seat.class, seatId);
		if(s1==null)
		{
			 throw new MovieBookingException("seat id is not found"+seatId);
		}
		return s1.getSeatPrice();
	}


	@Override
	public List<user> getUserDetails() {
		String jquery="from user user";
		TypedQuery<user> query=entityManager.createQuery(jquery, user.class);
		return query.getResultList();
	}
	
	/**********************************
     *Method:getSeat
     *description:To fetch the Seat details from database.
     *seatId               -fetches the details of that particular id
     *@returns                 - seat details
     *@throws MovieBookingExceptionException -it is raised due to invalid id
     *created by               - BATHULA SIVA GANESH
     *created date             -21-APR-2020
**********************************/
	
	
	
	
	
	@Override
	public List<Seat> getSeat() {
		String jquery="from Seat Seat";
		TypedQuery<Seat> query=entityManager.createQuery(jquery, Seat.class);
	return query.getResultList();
	}
	
	
	
	/**********************************
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
     *Method:getseat
     *description:To fetch the seat status  details from database.
     *seatId               -fetches the details of that particular id
     *@returns                 -seat starusdetails
     *@throws Movie Exception -it is raised due to invalid id
     *created by               -  BATHULA SIVA GANESH
     *created date             -21-APR-2020
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
**********************************/
	@Override
public BookingState getseat(int seatId) {
		
		Seat s1=entityManager.find(Seat.class, seatId);
		if(s1==null)
		{
			 throw new MovieBookingException("seat  is not found"+seatId);
		}
		return s1.getSeatStatus();
	}


}
