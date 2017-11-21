package com.dao;

import java.util.List;


import com.model.Checkout2;

public interface Checkout2Dao {
	
	public boolean addCheckout2(Checkout2 checkout1);
	public List<Checkout2>retrieveCheckout2();
	public boolean deleteCheckout2(Checkout2 checkout2);
	public boolean updateCheckout2(Checkout2 checkout2);
	public Checkout2 getCheckout2(int id);

}