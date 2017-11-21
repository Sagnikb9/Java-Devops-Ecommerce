package com.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.BasketDao;
import com.dao.Checkout3Dao;
import com.model.Basket;
import com.model.Checkout3;
import com.model.Details;



@Controller
public class Checkout3Controller {

	@Autowired
	Checkout3Dao checkout3Dao;
	
	@Autowired
	BasketDao basketDao;
	

	@RequestMapping(value="/checkout3/{username}",method=RequestMethod.POST)
	public String payment(@PathVariable("username")String username,
			               @RequestParam("payment")String payment,HttpSession session)
	{
		
		Checkout3 checkout3=new Checkout3();
		checkout3.setPayment(payment);
		checkout3.setUsername((String) session.getAttribute("username"));
		username=(String) session.getAttribute("username");
		checkout3Dao.addCheckout3(checkout3);
		return "checkout4";
		
	}
	
	
}
