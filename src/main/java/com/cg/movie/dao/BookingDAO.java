package com.cg.movie.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.movie.entity.Seat;
import com.cg.movie.entity.Show;
import com.cg.movie.entity.Theater;
import com.cg.movie.entity.Ticket;
import com.cg.movie.entity.user;
import com.cg.movie.exception.MovieBookingException;

@Repository
public class BookingDAO implements BookingDAOInterface{
	@PersistenceContext
	EntityManager entityManager;
	Seat seat=new Seat();
	/**************************************************************************************************
     *Method:getPrice
     *description:To fetch the seat fare  from database.
     *seatId                -fetches the details of that particular id
     *@returns                 -the seat price details
     *@throws TheatreException -it is raised due to invalid id
     *created by               -Rama Teja Reddy
     *created date             -21-APR-2020
**************************************************************************************************/
	

	@Override
	public double getPrice(int seatId) {
		
		Seat s1=entityManager.find(Seat.class, seatId);
		return s1.getSeatPrice();
	}


	@Override
	public List<user> getUserDetails() {
		String jquery="from user user";
		TypedQuery<user> query=entityManager.createQuery(jquery, user.class);
		return query.getResultList();
	}


	@Override
	public List<Ticket> getTicketDetails() {
		String jquery="from Ticket ticket";
		TypedQuery<Ticket> query=entityManager.createQuery(jquery,Ticket.class);
		return query.getResultList();
	}


	@Override
	public List<Theater> getTheater(int movieId) {
		String jpql = "from Theater t inner join fetch t.movie m where m.movieId=:mid";
		TypedQuery<Theater> query = entityManager.createQuery(jpql, Theater.class);
		
		query.setParameter("mid", movieId);
				return query.getResultList();
	}
		
	
}
