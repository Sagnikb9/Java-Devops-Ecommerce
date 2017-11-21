package com.AdminPanelController;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.dao.UserDao;
import com.model.Product;
import com.model.User;


@Controller
public class UserController {
	
	@Autowired
	UserDao userDao;

	@RequestMapping(value="/adminAddUser")
	public String adminAddUser()
	{
		
		return "adminAddUser";
		
	}
	
	@RequestMapping(value="/adminAddUser",method=RequestMethod.POST)
	public String adminAddSupplier(@RequestParam("username")String username,
			                        @RequestParam("password")String password,
			                        @RequestParam("enabled")Boolean enabled,
			                        @RequestParam("role")String role,Model m)
	{
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEnabled(enabled);
		user.setRole(role);
		userDao.addUser(user);
		List<User>listUser=userDao.retrieveUser();
		m.addAttribute("userList",listUser);
		
		return "adminAddUser";
		
		
	}
	
	
	
	@RequestMapping(value="/adminDisplayUser")
	public String adminDisplayUser()
	{
		
		return "adminDisplayUser";
		
	}
	
	@RequestMapping(value="/adminDisplayUser",method=RequestMethod.GET)
	public String adminDisplayUser(Model m)
	{
		User user=new User();
		m.addAttribute(user);
		
		List<User>listUser=userDao.retrieveUser();
		m.addAttribute("userList",listUser);
		
		return "adminDisplayUser";
		
	}
	
	@RequestMapping(value="/adminUpdateUser/{id}",method=RequestMethod.GET)
    public String adminDisplayUser(@PathVariable("id") int id,Model m)
    {
        
        
		User user=userDao.getUser(id);
        m.addAttribute(user);                                       //To fetch the data and display it.
        
        List<User>listUser=userDao.retrieveUser();
		m.addAttribute("userList",listUser);
        return "adminUpdateUser";
    }
	
	@RequestMapping(value="/adminUpdateUser/{id}",method=RequestMethod.POST)
    public String adminUpdateUser(@ModelAttribute User user,@PathVariable("id")int id)
    {
		
		userDao.updateUser(user);
		
		return "adminUpdateUser";
		
    }
	
	@RequestMapping(value="deleteUser/{id}",method=RequestMethod.GET)
    public String deleteUser(@PathVariable("id")int id,Model m)
    {
		User user=userDao.getUser(id);
        userDao.deleteUser(user);
        List<User>listUser=userDao.retrieveUser();
		m.addAttribute("userList",listUser);
        return "redirect:/adminDisplayUser";
    }
	
	
	
}
