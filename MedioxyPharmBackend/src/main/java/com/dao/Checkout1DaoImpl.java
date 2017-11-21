package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Category;
import com.model.Checkout1;

@Repository("checkout1Dao")
public class Checkout1DaoImpl implements Checkout1Dao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean addCheckout1(Checkout1 checkout1) {
		try
		{
			sessionFactory.getCurrentSession().save(checkout1);
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
	public List<Checkout1> retrieveCheckout1() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Checkout1");
		List<Checkout1>listCheckout1=query.list();
		session.close();
		return listCheckout1;
	}

	@Transactional
	@Override
	public boolean deleteCheckout1(Checkout1 checkout1) {
		try
		{
			sessionFactory.getCurrentSession().delete(checkout1);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e);
			return false;
		}
	}

	@Override
	public boolean updateCheckout1(Checkout1 checkout1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	@Override
	public Checkout1 getCheckout1(int proId) {
		
		Session session=sessionFactory.openSession();
		Checkout1 checkout1=(Checkout1)session.get(Checkout1.class, proId);
		session.close();
		return checkout1; 
		
	}

}
