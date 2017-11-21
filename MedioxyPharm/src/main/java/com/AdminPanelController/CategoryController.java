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


import com.dao.CategoryDao;
import com.model.Category;

@Controller
public class CategoryController {
	
	@Autowired
	CategoryDao categoryDao;

	@RequestMapping(value="/adminAddCategory")
	public String adminAddCategory()
	{
		
		return "adminAddCategory";
		
	}
	
	
	
	@RequestMapping(value="/adminAddCategory",method=RequestMethod.POST)
	public String adminAddCategory(@RequestParam("catgId")int catgId,
			                        @RequestParam("catgName")String catgName,
			                        @RequestParam("catgDesp")String catgDesp,Model m)
	{
		Category category=new Category();
		category.setCatgId(catgId);
		category.setCatgName(catgName);
		category.setCatgDesp(catgDesp);
		
		categoryDao.addCategory(category);
		List<Category>listCategory=categoryDao.retrieveCategory();
		m.addAttribute("categoryList",listCategory);
		
		return "adminAddCategory";
		
		
	}
	
	@RequestMapping(value="/adminDisplayCategory")
	public String adminDisplayCategory()
	{
		
		return "adminDisplayCategory";
		
	}
	
	@RequestMapping(value="/adminDisplayCategory",method=RequestMethod.GET)
	public String adminDisplayCategory(Model m)
	{
		Category category=new Category();
		m.addAttribute(category);
		
		List<Category>listCategory=categoryDao.retrieveCategory();
		m.addAttribute("categoryList",listCategory);
		
		return "adminDisplayCategory";
		
	}
	
	
	
	
	
	@RequestMapping(value="/adminUpdateCategory/{catgId}",method=RequestMethod.GET)
    public String adminDisplayCategory(@PathVariable("catgId") int catgId,Model m)
    {
        
        
		Category category=categoryDao.getCategory(catgId);
        m.addAttribute(category);                                       //To fetch the data and display it.
        
        List<Category> listCategory=categoryDao.retrieveCategory();
        m.addAttribute("categoryList",listCategory);
        
        return "adminUpdateCategory";
    }
	
	@RequestMapping(value="/adminUpdateCategory/{catgId}",method=RequestMethod.POST)
    public String adminUpdateCategory(@ModelAttribute Category category,@PathVariable("catgId")int catgId)
    {
		
		categoryDao.updateCategory(category);
		
		return "adminUpdateCategory";
		
    }
	
	
	@RequestMapping(value="/deleteCategory/{catgId}",method=RequestMethod.GET)
    public String deleteCategory(@PathVariable("catgId")int catgId,Model m)
    {
        Category category=categoryDao.getCategory(catgId);
        categoryDao.deleteCategory(category);
        
        List<Category> listCategory=categoryDao.retrieveCategory();
        m.addAttribute("categoryList",listCategory);
        
        return "redirect:/adminDisplayCategory";
    }
	
	
	
}
