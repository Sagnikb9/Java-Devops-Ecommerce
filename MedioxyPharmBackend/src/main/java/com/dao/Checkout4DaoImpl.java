package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Checkout4;
import com.model.Product;
import com.model.Supplier;
@Repository("checkout4Dao")
public class Checkout4DaoImpl implements Checkout4Dao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean addCheckout4(Checkout4 checkout4) {
		try
		{
			sessionFactory.getCurrentSession().save(checkout4);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e);
			return false;
		}
	}

	@Override
	public List<Checkout4> retrieveCheckout4() {
		return null;
		
	}

	@Override
	public boolean deleteCheckout4(Checkout4 checkout4) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCheckout4(Checkout4 checkout4) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	@Override
	public Checkout4 getCheckout4(int id) {
		Session session=sessionFactory.openSession();
		Checkout4 checkout4=(Checkout4)session.get(Checkout4.class, id);
		session.close();
		return checkout4;
	}

	
	
		
	
}
