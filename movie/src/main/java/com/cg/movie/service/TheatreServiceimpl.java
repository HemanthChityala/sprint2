package com.cg.movie.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movie.Dao.TheatreDao;
import com.cg.movie.entity.Theatre;
import com.cg.movie.Dao.TheatreDao;
@Service
@Transactional
public class TheatreServiceimpl implements TheatreService {
	@Autowired
	TheatreDao dao;
	/********************************************************************************************************************
	*       @author           Hemanth reddy
	*       Description       It is a service that provides service for fetching theatre details
	*       version           1.0
	*       created date      21-APR-2020
	********************************************************************************************************************/
	@Override
	public void create(Theatre theatre) {
		boolean b=dao.create(theatre);
		if(b==true)
		{
			System.out.println("Added SucessFully");
		}
		else
		{
			System.out.println("Not Added");
		}
		
	}
	
	@Override
	public Theatre findById(int id) {
		Theatre th=dao.findById(id);
		return th;
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
		
	}

	@Override
	public void update(int id,String name,String city,String managerName,String managerContact) {
		dao.update(id,name,city,managerName,managerContact);
	}
}
	
	



