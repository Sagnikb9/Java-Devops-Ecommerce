package com.dao;

import java.util.List;


import com.model.Checkout1;

public interface Checkout1Dao {
	
	public boolean addCheckout1(Checkout1 checkout1);
	public List<Checkout1>retrieveCheckout1();
	public boolean deleteCheckout1(Checkout1 checkout1);
	public boolean updateCheckout1(Checkout1 checkout1);
	public Checkout1 getCheckout1(int proId);

}
