package com.Controller;

import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.UserDao;
import com.model.User;

@Controller
public class RegisterController {

	
	@Autowired
	UserDao userDao;
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public String Register(@RequestParam("username")String username,
			                        @RequestParam("password")String password,
			                        @RequestParam("enabled")Boolean enabled,
			                        @RequestParam("role")String role,Model m)
	{
		
		
			
		
			
		 
		
		
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEnabled(true);
		user.setRole(role);
		userDao.addUser(user);
		
	    List<User>listUser=userDao.retrieveUser();
		m.addAttribute("userList",listUser);
			

			
		return "index";
	}
}
	
	
	

