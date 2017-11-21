package com.dao;

import java.util.List;

import com.model.Basket;



public interface BasketDao {
	
	public boolean addBasket(Basket basket);
	public boolean updateBasket(Basket basket);
	public boolean deleteBasket(Basket basket);
	public List<Basket> retrieveBasket();
	public Basket getBasket(int id);
	
	

}
