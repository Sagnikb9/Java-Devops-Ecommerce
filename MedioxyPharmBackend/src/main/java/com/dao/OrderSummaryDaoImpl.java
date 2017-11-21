package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Checkout4;
import com.model.OrderSummary;
@Repository("orderSummaryDao")
public class OrderSummaryDaoImpl implements OrderSummaryDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean addOrderSummary(OrderSummary orderSummary) {
		try
		{
			sessionFactory.getCurrentSession().save(orderSummary);
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
	public List<OrderSummary> retrieveOrderSummary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public OrderSummary getOrderSummary(int id) {
		return null;
		
	}

	

}
