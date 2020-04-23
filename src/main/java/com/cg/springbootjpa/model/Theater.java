package com.cg.springbootjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lpu_movie_theater")
public class Theater {
	@Id
	@Column(name="theaterId")
	private int theaterId;
	@Column(name="theaterName")
	private String theaterName;
	
	
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	
	public Theater(int theaterId,String TheaterName)
	{
		this.theaterId=theaterId;
		this.theaterName=theaterName;
	}
	
}

