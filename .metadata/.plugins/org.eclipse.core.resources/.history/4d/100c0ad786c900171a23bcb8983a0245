package com.Controller;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.Checkout4Dao;
import com.dao.OrderSummaryDao;
import com.model.Basket;
import com.model.Checkout4;
import com.model.OrderSummary;


public class OrderSummaryController {
@Autowired
OrderSummaryDao orderSummaryDao;

@Autowired
Checkout4Dao checkout4Dao;

@RequestMapping(value="/orderSummary/{username}",method=RequestMethod.POST)
	public String orderSummary(@PathVariable("username")String username,
            @RequestParam("proId")String proId,
            @RequestParam("proName")String proName,
            @RequestParam("quantity")String quantity,
            @RequestParam("proPrice")String proPrice,
            @RequestParam("total")String total,Model m,HttpSession session)
	{
		//Basket basket=new Basket();
		OrderSummary orderSummary=new OrderSummary();
		orderSummary.setProId(proId);
		orderSummary.setProName(proName);
		orderSummary.setQuantity(quantity);
		orderSummary.setProPrice(proPrice);
		orderSummary.setTotal(total);
		orderSummary.setUsername((String) session.getAttribute("username"));
		username=(String) session.getAttribute("username");
		orderSummaryDao.addOrderSummary(orderSummary);
		return "redirect:/orderSummary/{username}";
		
	}

}