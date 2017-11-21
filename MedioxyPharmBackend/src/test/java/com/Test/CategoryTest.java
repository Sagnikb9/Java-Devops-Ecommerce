package com.Test;
 
import static org.junit.Assert.*;
 
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.CategoryDao;
import com.model.Category;
 

 
public class CategoryTest 
{
    static CategoryDao categoryDao;
     
    @SuppressWarnings("resource")
	@BeforeClass
    public static void initialize()
    {
        
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
        ac.scan("com");
        ac.refresh();
         
        //SessionFactory sessionFactory=(SessionFactory)configApplnContext.getBean("DBConfig.class");
         
        categoryDao=(CategoryDao)ac.getBean("categoryDao");
    }
     
    //@Ignore
    @Test
    public void AddCategoryTest()
    {
        Category category=new Category();
        category.setCatgId(12);
        category.setCatgName("JMShirt");
        category.setCatgDesp("John Miller Shirt");
         
        assertTrue(categoryDao.addCategory(category));
    }
     
    @Ignore
    //@Test
    public void updateCategoryTest()
    {
        Category category=new Category();
        category.setCatgId(1002);
        category.setCatgName("JMShirt");
        category.setCatgDesp("John Miller Shirt with Best Price");
         
        assertTrue(categoryDao.updateCategory(category));
    }
    @Ignore
   // @Test
    public void deleteCategoryTest()
    {
        Category category=new Category();
        category.setCatgId(1002);
        assertTrue(categoryDao.deleteCategory(category));
    }
     
    //@Test
    @Ignore
    public void retrieveCategoryTest()
    {
        List<Category> listCategory=categoryDao.retrieveCategory();
        assertNotNull("Problem in Retriving ",listCategory);
        this.show(listCategory);
    }
     
    public void show(List<Category> listCategory)
    {
        for(Category category:listCategory)
        {
            System.out.println("Category ID:"+category.getCatgId());
            System.out.println("Category Name:"+category.getCatgName());
            System.out.println("Category Description:"+category.getCatgDesp());
        }
    }
     
     
    //@Test
    @Ignore
    public void getCategoryTest()
    {
        Category category=categoryDao.getCategory(1001);
        assertNotNull("Problem in Getting:",category);
        System.out.println("Category ID:"+category.getCatgId());
        System.out.println("Category Name:"+category.getCatgName());
        System.out.println("Category Description:"+category.getCatgDesp());
    }
 
}