package com.AdminPanelController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.dao.SupplierDao;

import com.model.Supplier;

@Controller
public class SupplierController {

	@Autowired
	SupplierDao supplierDao;

	/*@RequestMapping(value="/adminDashboard")
	public String adminDashboard()
	{
		
		return "adminDashboard";
		
	}*/
	
	@RequestMapping(value="/adminAddSupplier")
	public String adminAddSupplier()
	{
		
		return "adminAddSupplier";
		
	}
	
	@RequestMapping(value="/adminAddSupplier",method=RequestMethod.POST)
	public String adminAddSupplier(@RequestParam("suppId")int suppId,
			                        @RequestParam("suppName")String suppName,
			                        @RequestParam("suppDesp")String suppDesp,Model m)
	{
		Supplier supplier=new Supplier();
		supplier.setSuppId(suppId);
		supplier.setSuppName(suppName);
		supplier.setSuppDesp(suppDesp);
		
		supplierDao.addSupplier(supplier);
		List<Supplier>listSupplier=supplierDao.retrieveSupplier();
		m.addAttribute("supplierList",listSupplier);
		
		return "adminAddSupplier";
		
		
	}
	
	@RequestMapping(value="/adminDisplaySupplier")
	public String adminDisplaySupplier()
	{
		
		return "adminDisplaySupplier";
		
	}
	
	@RequestMapping(value="/adminDisplaySupplier",method=RequestMethod.GET)
	public String adminDisplaySupplier(Model m)
	{
		Supplier supplier=new Supplier();
		m.addAttribute(supplier);
		
		List<Supplier>listSupplier=supplierDao.retrieveSupplier();
		m.addAttribute("supplierList",listSupplier);
		
		return "adminDisplaySupplier";
		
	}
	
	
	
	
	
	@RequestMapping(value="/adminUpdateSupplier/{suppId}",method=RequestMethod.GET)
    public String adminDisplaySupplier(@PathVariable("suppId") int suppId,Model m)
    {
        
        
		Supplier supplier=supplierDao.getSupplier(suppId);
        m.addAttribute(supplier);                                       //To fetch the data and display it.
        
        List<Supplier>listSupplier=supplierDao.retrieveSupplier();
		m.addAttribute("supplierList",listSupplier);
        return "adminUpdateSupplier";
    }
	
	@RequestMapping(value="/adminUpdateSupplier/{suppId}",method=RequestMethod.POST)
    public String adminUpdateSupplier(@ModelAttribute Supplier supplier,@PathVariable("suppId")int suppId)
    {
		
		supplierDao.updateSupplier(supplier);
		
		return "adminUpdateSupplier";
		
    }
	
	
	@RequestMapping(value="deleteSupplier/{suppId}",method=RequestMethod.GET)
    public String deleteSupplier(@PathVariable("suppId")int suppId,Model m)
    {
		Supplier supplier=supplierDao.getSupplier(suppId);
        supplierDao.deleteSupplier(supplier);
        List<Supplier>listSupplier=supplierDao.retrieveSupplier();
		m.addAttribute("supplierList",listSupplier);
        return "redirect:/adminDisplaySupplier";
    }
}
