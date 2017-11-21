package com.dao;

import java.util.List;



import com.model.Checkout3;

public interface Checkout3Dao {
	
	public boolean addCheckout3(Checkout3 checkout3);
	public List<Checkout3>retrieveCheckout3();
	public boolean deleteCheckout3(Checkout3 checkout3);
	public boolean updateCheckout3(Checkout3 checkout3);
	public Checkout3 getCheckout3(int id);

}