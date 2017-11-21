package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Checkout3;
@Repository("checkout3Dao")
public class Checkout3DaoImpl implements Checkout3Dao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean addCheckout3(Checkout3 checkout3) {
		try
		{
			sessionFactory.getCurrentSession().save(checkout3);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e);
			return false;
		}
	}

	@Override
	public List<Checkout3> retrieveCheckout3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCheckout3(Checkout3 checkout3) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCheckout3(Checkout3 checkout3) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Checkout3 getCheckout3(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
