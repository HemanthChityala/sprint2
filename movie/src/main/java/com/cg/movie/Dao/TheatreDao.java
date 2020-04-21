package com.cg.movie.Dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.movie.Dao.TheatreDaoInterface;
import com.cg.movie.Exception.TheatreException;
import com.cg.movie.entity.Theatre;
@Repository
public class TheatreDao implements TheatreDaoInterface{
	@PersistenceContext
	EntityManager entityManager;
	Theatre theatre = new Theatre();
	@Override
	public String gettheatreName(int theatreId) {
		
		Theatre t1=entityManager.find(Theatre.class,theatreId);
		if(t1==null)
		{
			 throw new TheatreException("theatre id is not found"+ theatreId);
		}
		return t1.getTheatreName();
	}
}