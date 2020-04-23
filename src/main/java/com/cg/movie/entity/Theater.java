package com.cg.movie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="lpu_movie_theater")
public class Theater {
	@Id
	@Column(name="theaterId")
	private int theaterId;
	@Column(name="theaterName")
	private String theaterName;
	@Column(name="theater_city")
	private String city;
	@Column(name="managerName")
	private String managerName;
	@Column(name="managerContact")
	private int managerContact;
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public int getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(int managerContact) {
		this.managerContact = managerContact;
	}
	
	public Theater(int theaterId,String theaterName,String city,String managerName,int managerContact )
	{
			this.theaterId=theaterId;
			this.theaterName=theaterName;
			this.city=city;
			this.managerName=managerName;
			this.managerContact=managerContact;
	}

	

}
