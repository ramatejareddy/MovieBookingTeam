package com.cg.movie.dao;

import java.util.List;

import com.cg.movie.entity.Movie;




public interface MovieDao {
	public boolean create(Movie movie);

	public List<Movie> reterive();

	public Movie findById(int id);

	public void delete(int id);

	public void update(int id,String Showame,String language,String director,String genre);

}
