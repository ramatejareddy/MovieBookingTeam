package com.cg.movie.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.movie.entity.Movie;




@Transactional
@Repository
public class MovieImp implements MovieDao{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Movie movie) {
		
			em.persist(movie);
			return true;

	}

	@Override
	public List<Movie> reterive() {
		String Qstr="SELECT Movie from Movie movie";
		TypedQuery<Movie> query=em.createQuery(Qstr,Movie.class);
		return query.getResultList();
	}

	@Override
	public Movie findById(int id) {
		return em.find(Movie.class, id);
		
	}

	@Override
	public void delete(int id) {
		Movie tr=em.find(Movie.class, id);
		em.remove(tr);
		
	}

	@Override
	public void update(int id,String name,String language,String director,String genre) {
		Movie tr=em.find(Movie.class, id);
		tr.setMovieId(id);
		tr.setDirector(director);
		tr.setLanguage(language);
		tr.setMovieName(name);
		tr.setGenre(genre);
		
	}

}