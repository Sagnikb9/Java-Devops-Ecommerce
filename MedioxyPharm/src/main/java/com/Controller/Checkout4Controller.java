package com.Controller;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
import com.dao.Checkout4Dao;
import com.dao.DetailDao;
import com.model.Basket;
import com.model.Checkout3;
import com.model.Checkout4;
import com.model.Details;
@Controller
public class Checkout4Controller {

	@Autowired
	Checkout4Dao checkout4Dao;
	@Autowired
	DetailDao detailDao;
	@Autowired
	BasketDao basketDao;

	@RequestMapping(value="/checkout4/{username}",method=RequestMethod.POST)
	public String payment(@PathVariable("username")String username,
            @RequestParam("proId")String proId,
            @RequestParam("proName")String proName,
            @RequestParam("quantity")String quantity,
            @RequestParam("proPrice")String proPrice,
            @RequestParam("total")String total,Model m,HttpSession session)
	{
		Basket basket=new Basket();
		Checkout4 checkout4=new Checkout4();
		checkout4.setProId(proId);
		checkout4.setProName(proName);
		checkout4.setQuantity(quantity);
		checkout4.setProPrice(proPrice);
	
		try
		{
			Class.forName("org.h2.Driver");
	        Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/medioxy1","sa","");       
	        Statement statement = con.createStatement();
	        ResultSet resultset = statement.executeQuery("select * from Basket order by id desc limit 1 ");
	        while(resultset.next())
	        {
	        	String qtyStr = resultset.getString("quantity");
		         String priceStr = resultset.getString("proPrice");

		         String[] qtyArr = qtyStr.split(",");
		         String[] priceArr = priceStr.split(",");

		         String[] tempArr = new String[qtyArr.length];

		         @SuppressWarnings("unused")
				 String total1=null;
		         int sum=0;
		         for(int i = 0; i < qtyArr.length; i++){
		         	tempArr[i] = String.valueOf(Integer.parseInt(qtyArr[i]) * Integer.parseInt(priceArr[i]));
		         	sum+=Integer.parseInt(tempArr[i]);
		         	total1=String.valueOf(sum);	
		         	checkout4.setTotal(total1);
		         }
	        }
			 
		}     
		catch(Exception e)
		{
			e.printStackTrace();
		}
         
         
         
		
		checkout4.setUsername((String) session.getAttribute("username"));
		username=(String) session.getAttribute("username");
		checkout4Dao.addCheckout4(checkout4);
		return "orderSummary";
		
	}
	
	
	
	
}
