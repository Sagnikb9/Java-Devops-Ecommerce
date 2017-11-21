package com.AdminPanelController;





import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.dao.CategoryDao;
import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.dao.SupplierDao;
import com.model.Category;
import com.model.Product;
import com.model.Supplier;

@Controller
public class ProductController {
	
	@Autowired
	ProductDao productDao;
	@Autowired
	CategoryDao categoryDao;
	@Autowired
	SupplierDao supplierDao;

	@RequestMapping(value="/adminAddProduct")
	public String adminAddProduct(Model m)
	{
		List<Category>listCategory=categoryDao.retrieveCategory();
		m.addAttribute("categoryList",listCategory);
		
		List<Supplier>listSupplier=supplierDao.retrieveSupplier();
		m.addAttribute("supplierList",listSupplier);
		
		return "adminAddProduct";
		
	}
	
	
	
	@RequestMapping(value="/adminAddProduct",method=RequestMethod.POST)
	@ResponseBody
	public String adminAddProduct(
			                        @RequestParam("proId")int proId,
			                        @RequestParam("proName")String proName,
			                        @RequestParam("proCatg")String proCatg,
			                        @RequestParam("proSupp")String proSupp,
			                        @RequestParam("proDesp")String proDesp,
			                        @RequestParam("proStock")int proStock,
			                        @RequestParam("proPrice")int proPrice,
			                        
			                        @RequestPart("file")MultipartFile file,Model m)
	{
		Product product=new Product();
		product.setProId(proId);
		product.setProName(proName);
		product.setProCatg(proCatg);
		product.setProSupp(proSupp);
		product.setProDesp(proDesp);
		product.setProStock(proStock);
		product.setProPrice(proPrice);
		
		/*String filePath="E:\\EclipseOxygen\\eclipse-workspace\\MedioxyPharm\\src\\main\\webapp\\resources\\images\\";
		String fileName=filePath+file.getOriginalFilename(); //proImage
*/		
		
	    

	    
	    
	    
       
       if (file!=null && !file.isEmpty())
       {
       
    	   try 
           {
        	   byte[] bytes=file.getBytes();
        	   String filePath="E:\\EclipseOxygenNew\\eclipse-workspace\\MedioxyPharm\\src\\main\\webapp\\assets\\img\\";
        	   String fileName=filePath+String.valueOf(product.getProId())+".jpg";
        	   File serverFile=new File(fileName);
        	   FileOutputStream fos=new FileOutputStream(serverFile);
        	   BufferedOutputStream bos=new BufferedOutputStream(fos);
        	   bos.write(bytes);
        	   product.setFile(file);
        	   productDao.addProduct(product);
        	   
           }
           catch(Exception e)
           {
        	   return "Image Upload Failed"+""+e.getMessage();
           }
       } 
       else
       {
    	   return "File is empty";
       }
       
       return "adminAddProduct";
 		
    }
	
	@RequestMapping(value="/adminDisplayProduct")
	public String adminDisplayCategory()
	{
		
		return "adminDisplayProduct";
		
	}
	
	@RequestMapping(value="/adminDisplayProduct",method=RequestMethod.GET)
	public String adminDisplayProduct(Model m)
	{
		Product product=new Product();
		m.addAttribute(product);
		
		List<Product>listProduct=productDao.retrieveProduct();
		m.addAttribute("productList",listProduct);
		
		return "adminDisplayProduct";
		
	}
		

	@RequestMapping(value="/adminUpdateProduct/{proId}",method=RequestMethod.GET)
    public String adminDisplayProduct(@PathVariable("proId") int proId,Model m)
    {
        
        
		Product product=productDao.getProduct(proId);
        m.addAttribute(product);                                       //To fetch the data and display it.
        
        List<Product>listProduct=productDao.retrieveProduct();
		m.addAttribute("productList",listProduct);
        return "adminUpdateProduct";
    }
	
	@RequestMapping(value="/adminUpdateProduct/{proId}",method=RequestMethod.POST)
    public String adminUpdateProduct(@ModelAttribute Product product,@PathVariable("proId")int proId, @RequestPart("file")MultipartFile file)
    {
		try 
        {
     	   byte[] bytes=file.getBytes();
     	   String filePath="E:\\EclipseOxygenNew\\eclipse-workspace\\MedioxyPharm\\src\\main\\webapp\\assets\\img\\";
     	   String fileName=filePath+String.valueOf(product.getProId())+".jpg";
     	   File serverFile=new File(fileName);
     	   FileOutputStream fos=new FileOutputStream(serverFile);
     	   BufferedOutputStream bos=new BufferedOutputStream(fos);
     	   bos.write(bytes);
     	   product.setFile(file);
     	   
     	   productDao.updateProduct(product);
     	   
        }
        catch(Exception e)
        {
     	   return "Image Upload Failed"+""+e.getMessage();
        }
		
		return "adminUpdateProduct";
		
    }
	
	@RequestMapping(value="deleteProduct/{proId}",method=RequestMethod.GET)
    public String deleteProduct(@PathVariable("proId")int proId,Model m)
    {
		Product product=productDao.getProduct(proId);
        productDao.deleteProduct(product);
        List<Product>listProduct=productDao.retrieveProduct();
		m.addAttribute("productList",listProduct);
        return "redirect:/adminDisplayProduct";
    }
	
	
		
		
		
}
	
	
	
	
	

