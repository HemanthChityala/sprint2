package com.cg.movie.Dao;

import java.util.List;

import com.cg.movie.entity.Theatre;



public interface TheatreDao {
	public String gettheatreName(int theatreId);
	
	public boolean create(Theatre theatre);

	public List<Theatre> reterive();
}
