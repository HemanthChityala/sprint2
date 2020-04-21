package com.cg.movie.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movie.Dao.TheatreDaoInterface;
import com.cg.movie.Dao.TheatreDaoInterface;
@Service
@Transactional
public class TheatreService implements TheatreServiceInterface {
	@Autowired
	TheatreDaoInterface dao;
	@Override
	public String theatreName(int theatreId) {
		String TheatreName=dao.gettheatreName(theatreId);
		return TheatreName;
	}

}
