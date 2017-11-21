package com.dao;

import java.util.List;

import com.model.Checkout4;


public interface Checkout4Dao {
	
	public boolean addCheckout4(Checkout4 checkout4);
	public List<Checkout4>retrieveCheckout4();
	public boolean deleteCheckout4(Checkout4 checkout4);
	public boolean updateCheckout4(Checkout4 checkout4);
	public Checkout4 getCheckout4(int id);
	
	

}
