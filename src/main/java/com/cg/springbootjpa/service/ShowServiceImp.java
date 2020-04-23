package com.cg.springbootjpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springbootjpa.dao.ShowDao;
import com.cg.springbootjpa.model.Movie;
import com.cg.springbootjpa.model.Show;
import com.cg.springbootjpa.model.Theater;
@Transactional
@Service
public class ShowServiceImp implements ShowService {
	
	@Autowired
	ShowDao showdao;
	
	@Override
	public void create(Show show) {
		boolean b=showdao.create(show);
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
	public List<Show> reterive() {
		List<Show> list=showdao.reterive();
		return list;
	}

	@Override
	public Show findById(int id) {
		Show tr=showdao.findById(id);
		return tr;
	}

	@Override
	public Boolean delete(int id) {
		showdao.delete(id);
		return null;
		
	}

	@Override
	public void update(int id, String showName, int seats, String screenName, Movie movie, Theater theater) {
		showdao.update(id,showName,seats,screenName,movie,theater);
		
	}
}
