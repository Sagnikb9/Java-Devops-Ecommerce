package com.Test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.dao.ProductDao;

import com.model.Product;

public class ProductTest {

	static ProductDao productDao;
	@BeforeClass
	public static void initialize()
    {
        
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
        ac.scan("com");
        ac.refresh();
         
        //SessionFactory sessionFactory=(SessionFactory)configApplnContext.getBean("DBConfig.class");
         
        productDao=(ProductDao)ac.getBean("productDao");
    }
	
	@Test
    public void AddProductTest()
    {
        Product product=new Product();
        
        product.setProId(1);
        product.setProName("Pro");
        product.setProCatg("Catg");
        product.setProSupp("Supp");
        product.setProDesp("dd");
        product.setProStock(1);
        
        
        
        
         
        assertTrue(productDao.addProduct(product));
    }
}
