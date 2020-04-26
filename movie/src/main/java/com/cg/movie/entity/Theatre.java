package com.cg.movie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="lpu_movie_theatre")
public class Theatre {
	@Id
	@Column(name="theatreId")
	private int theatreId;
	@Column(name="theatreName")
	private String theatreName;
	@Column(name="theatre_city")
	private String city;
	@Column(name="managerName")
	private String managerName;
	@Column(name="managerContact")
	private String managerContact;
	
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
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
	public String getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	
	public Theatre()
	{
	}

	

}
