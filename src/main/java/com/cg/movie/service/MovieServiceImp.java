package com.cg.movie.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movie.dao.MovieDao;
import com.cg.movie.entity.Movie;


@Transactional
@Service
public class MovieServiceImp implements MovieService{
	
	@Autowired
	MovieDao moviedao;
	
	@Override
	public void create(Movie movie) {
		boolean b=moviedao.create(movie);
		if(b==true)
		{
			System.out.println("Added SucessFully");
		}
		else
		{
			System.out.println("Not Added");
		}
		
	}

	@Override
	public List<Movie> reterive() {
		List<Movie> list=moviedao.reterive();
		return list;
	}

	@Override
	public Movie findById(int id) {
		Movie tr=moviedao.findById(id);
		return tr;
	}

	@Override
	public Boolean delete(int id) {
		moviedao.delete(id);
		return null;
		
	}

	@Override
	public void update(int id,String name,String language,String director,String genre) {
		moviedao.update(id,name,language,director,genre);
		
	}

}
