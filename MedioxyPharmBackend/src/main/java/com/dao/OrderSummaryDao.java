package com.dao;

import java.util.List;

import com.model.Checkout4;
import com.model.OrderSummary;


public interface OrderSummaryDao {
	
	public boolean addOrderSummary(OrderSummary orderSummary);
	public List<OrderSummary>retrieveOrderSummary();
	
	public OrderSummary getOrderSummary(int id);
	
	

}
