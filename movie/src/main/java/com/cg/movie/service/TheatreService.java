package com.cg.movie.service;

import java.util.List;

import com.cg.movie.entity.Theatre;

public interface TheatreService {
	public String theatreName(int theatreId);
	
	public void create(Theatre theatre);

	public List<Theatre> reterive();
}
