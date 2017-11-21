package com.AdminPanelController;



import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DashboardController {

	
	
	@RequestMapping(value="/adminDashboard")
	public String adminDashboard()
	{
		
		return "adminDashboard";
		
	}
	
	
	
	
	@RequestMapping(value="/adminlogout")
	public String adminLogout()
	{
		
		return "error";
		
	}
	
	
	
	
}
