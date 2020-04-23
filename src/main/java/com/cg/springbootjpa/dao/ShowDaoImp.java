package com.cg.springbootjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.springbootjpa.model.Movie;
import com.cg.springbootjpa.model.Show;
import com.cg.springbootjpa.model.Theater;
@Transactional
@Repository
public class ShowDaoImp implements ShowDao{
	

	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Show show) {
		
			em.persist(show);
			return true;

	}

	@Override
	public List<Show> reterive() {
		String Qstr="SELECT Movie from Movie movie";
		TypedQuery<Show> query=em.createQuery(Qstr,Show.class);
		return query.getResultList();
	}

	@Override
	public Show findById(int id) {
		return em.find(Show.class, id);
		
	}

	@Override
	public void delete(int id) {
		Show tr=em.find(Show.class, id);
		em.remove(tr);
		
	}

	@Override
	public void update(int id, String showName, int seats, String screenName, Movie movie, Theater theater) {
		Show tr=em.find(Show.class, id);
		tr.setShowId(id);
		tr.setMovie(movie);
		tr.setScreenName(screenName);
		tr.setSeats(seats);
		tr.setShowName(showName);
		tr.setTheater(theater);
	}
}
