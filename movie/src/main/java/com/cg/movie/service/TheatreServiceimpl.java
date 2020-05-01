package com.cg.movie.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movie.Dao.TheatreDao;
import com.cg.movie.Exception.TheatreIdNotFoundException;
import com.cg.movie.entity.Theatre;

@Service
@Transactional
public class TheatreServiceimpl implements TheatreService {
	@Autowired
	TheatreDao dao;
    /********************************************************************************************************************
	*       @author           Hemanth reddy
	*       Description       It is a service used for adding theatre details
	*       version           1.0
	*       created date      21-APR-2020
	********************************************************************************************************************/
	@Override
	public void create(Theatre theatre) {
		boolean status=dao.create(theatre);
		if(status==true)
		{
			System.out.println("Added SucessFully");
		}
		else
		{
			System.out.println("Not Added");
		}
		
	}
	/********************************************************************************************************************
	*       @author           Hemanth reddy
	*       Description       It is a service used for fetching all theatre details
	*       version           1.0
	*       created date      21-APR-2020
	********************************************************************************************************************/
	@Override
	public List<Theatre> reterive() {
		List<Theatre> list=dao.reterive();
		return list;
	}
	/********************************************************************************************************************
	*       @author           Hemanth reddy
	*       Description       It is a service used for fetching paticular theatre details by id.
	*       version           1.0
	*       created date      21-APR-2020
	********************************************************************************************************************/
	@Override
	public Theatre findById(int id) throws TheatreIdNotFoundException {
		Theatre th=dao.findById(id);
		if(th==null)
		{
			 throw new TheatreIdNotFoundException("Theatre id not found.Please enter a valid id");
		}
		return th;
	}
	/********************************************************************************************************************
	*       @author           Hemanth reddy
	*       Description       It is a service used for deleting particular theatre details by id.
	*       version           1.0
	*       created date      21-APR-2020
	********************************************************************************************************************/
	@Override
	public void delete(int id) {
		dao.delete(id);
		
	}
	/********************************************************************************************************************
	*       @author           Hemanth reddy
	*       Description       It is a service used for updating theatre details
	*       version           1.0
	*       created date      21-APR-2020
	********************************************************************************************************************/
	@Override
	public void update(int id,String name,String city,String managerName,String managerContact) {
		dao.update(id,name,city,managerName,managerContact);
	}
}
	
	



