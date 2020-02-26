package com.hema.hemaa.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hema.hemaa.dto.HomeDTO;
import com.hema.hemaa.entity.HomeEntity;

@Repository
public class HomeDAOImpl implements HomeDAO{
	
	@Autowired
	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	public HomeDAOImpl() {
		System.out.println("created \t"+this.getClass().getSimpleName());
	}


	public void save(HomeEntity homeEntity) {
		System.out.println("Invoking save method");
		Session session = null;
		try {

			System.out.println("session created");
			session = factory.openSession();
			System.out.println("Transaction begun");
			session.beginTransaction();
			System.out.println("Entity saving...");
			session.save(homeEntity);
			System.out.println("Commiting....");
			session.getTransaction().commit();
			System.out.println("Data saved");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("INFO:" + e.getMessage());
		}
		
	}
	}
