package com.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Basket;
import com.model.Category;
import com.*;
@Repository("basketDao")
public class BasketDaoImpl implements BasketDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	@Override
	public boolean addBasket(Basket basket) {
		try
		{
			sessionFactory.getCurrentSession().save(basket);
			return true;
			
		}	
		catch(Exception e)
		{
			System.out.println("Exception is"+e);
			return false;
		}
		
	}

	@Override
	public boolean updateBasket(Basket basket) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	@Override
	public boolean deleteBasket(Basket basket) {
		try
		{
			sessionFactory.getCurrentSession().delete(basket);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e);
			return false;
		}
	}

	@Transactional
	@Override
	public List<Basket> retrieveBasket() {
		
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Basket where username=:username");
		
		List<Basket>listBasket=query.list();
		session.close();
		return listBasket;
	}
	
	@Transactional
	@Override
	public Basket getBasket(int id){
		
		Session session=sessionFactory.openSession();
		Basket basket=(Basket)session.get(Basket.class, id);
		session.close();
		return basket;
	}
	

}
