package com.cg.movie.Dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.movie.Dao.TheatreDao;
import com.cg.movie.Exception.TheatreIdNotFoundException;
import com.cg.movie.entity.Theatre;

@Repository
public class TheatreDaoimpl implements TheatreDao{
	@PersistenceContext
	EntityManager em;
	Theatre theatre = new Theatre();
/**************************************************************************************************
     *Method:                   create
     *description:              Adds new theatre 
     *@returns                 -theatre details
     *@throws TheatreIdNotFoundException -it is raised due to invalid id
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
/**************************************************************************************************
     *Method:                   reterive
     *description:              displays all the records
     *@returns                 -theatre details
     *created by               -Hemanth Reddy
     *created date             -21-APR-2020
**************************************************************************************************/
	@Override
	public List<Theatre> reterive() {
		String Qstr="SELECT theatre from Theatre theatre";
		TypedQuery<Theatre> query=em.createQuery(Qstr,Theatre.class);
		return query.getResultList();
	}
/**************************************************************************************************
     *Method:                   findById
     *description:              display the paticular record by id
     *theatreId                -fetches the details of that particular id
     *@returns                 -theatre details
     *@throws TheatreIdNotFoundException -it is raised due to invalid id
     *created by               -Hemanth Reddy
     *created date             -21-APR-2020
**************************************************************************************************/
	@Override
	public Theatre findById(int id) {
		  
		Theatre th = em.find(Theatre.class, id);
		if(th==null)
		{
			 throw new TheatreIdNotFoundException("Theatre id not found.Please enter a valid id");
		}
		return th;
		
	}
/**************************************************************************************************
     *Method:                   delete
     *description:              delete the paticular record by id
     *theatreId                -fetches the details of that particular id
     *@returns                 -theatre details
     *@throws TheatreIdNotFoundException -it is raised due to invalid id
     *created by               -Hemanth Reddy
     *created date             -21-APR-2020
**************************************************************************************************/
	@Override
	public void delete(int id) {
	Theatre th=em.find(Theatre.class, id);//this method will which id to remove
	
	System.out.println(th.getTheatreId() +" "+th.getTheatreName() + " "+th.getTheatreCity()+" "+th.getManagerName()+""+th.getManagerContact()+"is removed");
	
	em.remove(th);//this is object from the database
	
	}
	/**************************************************************************************************
     *Method:                   update
     *description:              update the paticular record by id
     *theatreId                -fetches the details of that particular id
     *@returns                 -theatre details
     *@throws TheatreIdNotFoundException -it is raised due to invalid id
     *created by               -Hemanth Reddy
     *created date             -21-APR-2020
**************************************************************************************************/
	@Override
	public void update(int id,String name,String city,String managerName,String managerContact) {
		Theatre th=em.find(Theatre.class, id);
		th.setTheatreName(name);
		th.setTheatreCity(city);
		th.setManagerName(managerName);
		th.setManagerContact(managerContact);
}
}

