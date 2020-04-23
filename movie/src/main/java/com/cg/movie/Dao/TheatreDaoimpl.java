package com.cg.movie.Dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.movie.Dao.TheatreDao;
import com.cg.movie.Exception.TheatreException;
import com.cg.movie.entity.Theatre;
@Repository
public class TheatreDaoimpl implements TheatreDao{
	@PersistenceContext
	EntityManager em;
	Theatre theatre = new Theatre();
	@Override
	public String gettheatreName(int theatreId) {
		
		Theatre t1=em.find(Theatre.class,theatreId);
		if(t1==null)
		{
			 throw new TheatreException("theatre id is not found"+ theatreId);
		}
		return t1.getTheatreName();
	}
	
	/**************************************************************************************************
     *Method:gettheatreName
     *description:To fetch the theatre details from database.
     *theatreId                -fetches the details of that particular id
     *@returns                 -theatre details
     *@throws TheatreException -it is raised due to invalid id
     *created by               -Hemanth Reddy
     *created date             -21-APR-2020
**************************************************************************************************/
	@Override
	public boolean create(Theatre theatre) {
		if(true)
		{
			em.persist(theatre);
			return true;
		}
		return false;
	}
	@Override
	public List<Theatre> reterive() {
		String Qstr="SELECT theatre from Theatre theatre";
		TypedQuery<Theatre> query=em.createQuery(Qstr,Theatre.class);
		return query.getResultList();
	}
}

