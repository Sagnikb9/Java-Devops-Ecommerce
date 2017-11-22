package com.Controller;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.BasketDao;
import com.dao.Checkout1Dao;
import com.model.Basket;
import com.model.Checkout1;
@Controller
public class Checkout1Controller {

	@Autowired
	Checkout1Dao checkout1Dao;
	
	
	
	
	@RequestMapping(value="/checkout1/{username}",method=RequestMethod.POST)
	public String addCheckout1(@PathVariable("username")String username,
			                @RequestParam("fname")String fname,
			                @RequestParam("lname")String lname,
			                @RequestParam("company")String company,
			                @RequestParam("address")String address,
			                @RequestParam("street")String street,
			                @RequestParam("zip")int zip,
			                @RequestParam("state")String state,
			                @RequestParam("country")String country,
			                @RequestParam("phone")int phone,
			                @RequestParam("email")String email,Model m,HttpSession session)
	{
		String page_url=null;
		String role_name=null;
		
		boolean loggedIn=false;
		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		String logged_UserName=authentication.getName();
		
		session.setAttribute("username",logged_UserName);
	    Collection<GrantedAuthority> authorities=(Collection<GrantedAuthority>)authentication.getAuthorities();
	    for(GrantedAuthority role:authorities)
	    {
	    	if(role.getAuthority().equals("ROLE_USER"))
	    	{
	    		Checkout1 checkout1=new Checkout1();
	    		checkout1.setFname(fname);
	    		checkout1.setLname(lname);
	    		checkout1.setCompany(company);
	    		checkout1.setAddress(address);
	    		checkout1.setStreet(street);
	    		checkout1.setZip(zip);
	    		checkout1.setState(state);
	    		checkout1.setCountry(country);
	    		checkout1.setPhone(phone);
	    		checkout1.setEmail(email);
	    		checkout1.setUsername((String) session.getAttribute("username"));
	    		username=(String) session.getAttribute("username");
	    		
	    		checkout1Dao.addCheckout1(checkout1);
	    		role_name="ROLE_USER";
	    		page_url="checkout2";
	    	}
	    	else
	    	{
	    		page_url="pleaselogin";
	    	}
        
	    }
	    session.setAttribute("loggedIn", loggedIn);
	    session.setAttribute("role", role_name);  
		return page_url;
		
	}
}
