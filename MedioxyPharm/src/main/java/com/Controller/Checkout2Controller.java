package com.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.Checkout2Dao;
import com.model.Checkout2;

@Controller
public class Checkout2Controller {
	
	@Autowired
	Checkout2Dao checkout2Dao;
	

	@RequestMapping(value="/checkout2/{username}",method=RequestMethod.POST)
	public String delivery(@PathVariable("username")String username,
			               @RequestParam("delivery")String delivery,HttpSession session)
	{
		
		Checkout2 checkout2=new Checkout2();
		checkout2.setDelivery(delivery);
		checkout2.setUsername((String) session.getAttribute("username"));
		username=(String) session.getAttribute("username");
		checkout2Dao.addCheckout2(checkout2);
		return "checkout3";
		
	}
}
