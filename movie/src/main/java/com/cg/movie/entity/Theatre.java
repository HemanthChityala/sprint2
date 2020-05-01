package com.cg.movie.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="lpu_movie_theatre")
public class Theatre{
	

	public Theatre() {
		super();
	}
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="theatreId")
	private int theatreId;
	@Column(name="theatreName",length=25)
	private String theatreName;
	@Column(name="theatreCity",length=25)
	private String theatreCity;
	@Column(name ="managerName",length=25)
	private String managerName;
	@Column(name ="managerContact",length=10)
	private String managerContact;
	
	
//	public Movie getMovie() {
	//	return movie;
//	}
//	public void setMovie(Movie movie) {
//		this.movie = movie;
//	}
	//@ManyToOne
//	@JoinColumn(name="movieId", referencedColumnName = "movie_Id")
	//private Movie movie;


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
	public String getTheatreCity() {
		return theatreCity;
	}
	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
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

	
	
	
	
	
}
