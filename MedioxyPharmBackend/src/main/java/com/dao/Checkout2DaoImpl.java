package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Checkout1;
import com.model.Checkout2;

@Repository("checkout2Dao")
public class Checkout2DaoImpl implements Checkout2Dao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean addCheckout2(Checkout2 checkout2) {
		try
		{
			sessionFactory.getCurrentSession().save(checkout2);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e);
			return false;
		}
	}

	@Override
	public List<Checkout2> retrieveCheckout2() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Checkout2");
		List<Checkout2>listCheckout2=query.list();
		session.close();
		return listCheckout2;
	}

	@Override
	public boolean deleteCheckout2(Checkout2 checkout2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCheckout2(Checkout2 checkout2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Checkout2 getCheckout2(int id) {
		Session session=sessionFactory.openSession();
		Checkout2 checkout2=(Checkout2)session.get(Checkout2.class, id);
		session.close();
		return checkout2; 
	}

}
