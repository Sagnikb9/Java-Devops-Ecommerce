package com.Controller;



import java.util.Collection;
import java.util.List;


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
import com.dao.CategoryDao;
import com.dao.DetailDao;
import com.dao.ProductDao;
import com.dao.UserDao;
import com.model.Basket;

import com.model.Category;
import com.model.Checkout1;
import com.model.Checkout2;
import com.model.Checkout3;
import com.model.Checkout4;
import com.model.Details;
import com.model.OrderSummary;
import com.model.Product;
import com.model.User;
import com.*;


@Controller
public class IndexController {
	
	@Autowired
	CategoryDao categoryDao;
	
    @Autowired
    ProductDao productDao;
    
    @Autowired
    UserDao userDao;
    
    @Autowired
    DetailDao detailDao;
    
    @Autowired
    BasketDao basketDao;
  	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "index";
		
	}
	
	@RequestMapping(value="/contact")
	public String contact()
	{
		
		return "contact";
		
	}
	
	@RequestMapping(value="/account")
	public String account()
	{
		
		return "account";
		
	}
	
	@RequestMapping(value="/pleaselogin")
	public String pleaseLogin()
	{
		
		return "pleaselogin";
		
	}
	
	@RequestMapping(value="/product")
	public String product(Model m)
	{
		
		Product product=new Product();
	    
	    m.addAttribute(product);
	    			
	    List<Product>listProduct=productDao.retrieveProduct();
	    m.addAttribute("productList",listProduct);
		
		return "product";
		
	}
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index(Model m)
	{
		
		
		Category category=new Category();
		m.addAttribute(category);
		
		List<Category>listCategory=categoryDao.retrieveCategory();
		m.addAttribute("categoryList",listCategory);
		
		Product product=new Product();
		m.addAttribute(product);
		
		List<Product>listProduct=productDao.retrieveProduct();
		m.addAttribute("productList",listProduct);
		
		return "index";
		
	}
	
	
	@RequestMapping(value="/login_success")
	public String success(Model m, HttpSession session)
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
	    	if(role.getAuthority().equals("ROLE_ADMIN"))
	    	{
	    		    loggedIn=true;
	    		
	    			role_name="ROLE_ADMIN";
	    			
	    			page_url="adminDashboard";
	    			
	    			
	    			  		
	    	}
	    		    	
	    	
	    	else
	    	{
	    		
	    		loggedIn=true;
	    		
    			role_name="ROLE_USER";
    			
    			Category category=new Category();
    			m.addAttribute(category);
    			
    			List<Category>listCategory=categoryDao.retrieveCategory();
    			m.addAttribute("categoryList",listCategory);
    			
    			Product product=new Product();
    			m.addAttribute(product);
    			
    			List<Product>listProduct=productDao.retrieveProduct();
    			m.addAttribute("productList",listProduct);
    			
    			
    			
    			Details detail=new Details();
		        m.addAttribute(detail);
		
		        List<Details>listDetail=detailDao.retrieveDetail();
		        m.addAttribute("detailList",listDetail);
    			
    			Basket basket=new Basket();
    			m.addAttribute(basket);
    			
    			
    			
    			Checkout1 checkout1=new Checkout1();
    			m.addAttribute(checkout1);
    			
    			Checkout2 checkout2=new Checkout2();
    			m.addAttribute(checkout2);
    			
    			Checkout3 checkout3=new Checkout3();
    			m.addAttribute(checkout3);
    			
    			Checkout4 checkout4=new Checkout4();
    			m.addAttribute(checkout4);
    			
    			OrderSummary orderSummary=new OrderSummary();
    			m.addAttribute(orderSummary);
    			
    			page_url="index";
    			
    			
    			
    			
    			
    	        
	    	}
	    	
	    	
	    }
	    
	    session.setAttribute("loggedIn", loggedIn);
	    session.setAttribute("role", role_name);
	    
	    
	    
		return page_url;
		
	}
	
	
		
	@RequestMapping(value="/details/{proId}",method=RequestMethod.GET)
    public String details(@PathVariable("proId")int proId,Model m)
    {
		
		
	    
	    Product product=new Product();
	    product=productDao.getProduct(proId);
	    m.addAttribute(product);
	    			
	    List<Product>listProduct=productDao.retrieveProduct();
	    m.addAttribute("productList",listProduct);
	    
	    	
	    			
		return "details";

      
    }
	
	/*@RequestMapping(value="/basket",method=RequestMethod.GET)
    public String basket(@PathVariable("proId")int proId,Model m,HttpSession session)
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
	    	  loggedIn=true;	
	          Product product=new Product();
	          product=productDao.getProduct(proId);
	          m.addAttribute(product);
	    			
	          List<Product>listProduct=productDao.retrieveProduct();
	          m.addAttribute("productList",listProduct);
	    
	          role_name="ROLE_USER";
	    	  page_url="basket";
	    			
		     
	    	}
	    	else
	    	{
	    		page_url="pleaselogin";
	    	}
	    } 
	    
	    session.setAttribute("loggedIn", loggedIn);
	    session.setAttribute("role", role_name);  
        return page_url;
    }*/
	
	/*@RequestMapping(value="/cart/{proId}")
    public String cart(@PathVariable("proId")int proId,Model m,HttpSession session)
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
	    		    loggedIn=true;
	    		
	    			role_name="ROLE_USER";
	    			
	    			Product product=new Product();
	    			m.addAttribute(product);
	    			product=productDao.getProduct(proId);
	    			
	    			List<Product>listProduct=productDao.retrieveProduct();
	    			m.addAttribute("productList",listProduct);
	    			
	    			Cart cart=new Cart();
	    			m.addAttribute(cart);
	    			
	    		    List<Cart>listCart=cartDao.retrieveCart();
	    		    m.addAttribute("cartList",listCart);
	    		    
	    		    page_url="cart";
	    			  		
	    	}
	    		    	
	    	
	    	else
	    	{
	    		
	    		loggedIn=false;
	    		role_name="";
    			
    			page_url="cart";
    			
    			
    			
    	        
	    	}
	    	
	    	
	    }
	    
	    session.setAttribute("loggedIn", loggedIn);
	    session.setAttribute("role", role_name);
	    
	    
	    
		return page_url;
		
	}*/

      
	/*@RequestMapping(value="/cart/{proId}",method=RequestMethod.GET)
    public String cart(@PathVariable("proId")int proId,Model m)
    {
		
		
	    Cart cart=new Cart();
	    cart=cartDao.getCart(proId);
	    
	    			
	    List<Cart>listCart=cartDao.retrieveCart();
	    m.addAttribute("cartList",listCart);
	    
	    	
	    			
		return "cart";

      
    }*/
	

	
	
	
}
