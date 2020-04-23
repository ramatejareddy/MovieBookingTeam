package com.cg.springbootjpa.dao;

//import java.time.LocalDate;
import java.util.List;

import com.cg.springbootjpa.model.Movie;
import com.cg.springbootjpa.model.Show;
import com.cg.springbootjpa.model.Theater;

public interface ShowDao {
	
	public boolean create(Show show);

	public List<Show> reterive();

	public Show findById(int id);

	public void delete(int id);

	public void update(int id,String showName, int seats, String screenName, Movie movie, Theater theater);

}
