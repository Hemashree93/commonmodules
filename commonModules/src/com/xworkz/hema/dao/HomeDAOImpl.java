package com.xworkz.hema.dao;

import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.hema.entity.HomeEntity;

@Component
public class HomeDAOImpl implements HomeDAO {
	

	@Autowired
	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public HomeDAOImpl() {
		System.out.println("created \t" + this.getClass().getSimpleName());
	}

	public void save(HomeEntity homeEntity) {
		System.out.println("Invoking save method");
		Session session = null;
		try {

			System.out.println("session created");
			session = factory.openSession();
			System.out.println("Transaction begin");
			session.beginTransaction();
			System.out.println("Entity saving...");
			session.save(homeEntity);
			System.out.println("Commiting....");
			session.getTransaction().commit();
			System.out.println("Data saved");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("INFO:" + e.getMessage());
		}finally {
			if (Objects.nonNull(session))
				session.close();
	}
	}

	
	public HomeEntity fetchByemail(String email) {

		Session session = factory.openSession();
		try {
			String syntax = "SELECT SE FROM HomeEntity SE WHERE SE.email ='" + email + "'";
			Query query = session.createQuery(syntax);
			Object result = query.uniqueResult();
			
			if(Objects.nonNull(result)) {
				System.out.println("Entity is already exist");
				HomeEntity entity=(HomeEntity) result;
				return entity;
			}else {
				System.out.println("Email is not duplicate,");
				return null;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Info: " + e.getMessage());
			session.close();
		}finally {
			if (Objects.nonNull(session))
				session.close();
		}
	
		return null;
		
	}
	@Override
	public HomeEntity fetchByEmailandPassword(String email, String password) {
		Session session=factory.openSession();
		try {
			
			System.out.println("invoke entity");
			
			Query query=session.getNamedQuery("fetchByEmailandPassword");
			query.setParameter("email", email);
			query.setParameter("password", password);
			System.out.println("query " + query);
			Object result=query.uniqueResult();
			if(Objects.nonNull(result)) {
			System.out.println("Entity found:"+email);
			HomeEntity entity=(HomeEntity) result;
			return entity;
			}
			else {
				System.out.println("Entity not found");
				return null;
			}
	}catch(HibernateException e) {
		e.printStackTrace();
	
	}
	
	finally {
			if (Objects.nonNull(session))
				session.close();
			// close session

		}
		return null;

	}

	
}
