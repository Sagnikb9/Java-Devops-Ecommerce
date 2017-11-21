package com.hibernateConfig;



import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.model.Basket;

import com.model.Category;
import com.model.Checkout1;
import com.model.Checkout2;
import com.model.Checkout3;
import com.model.Checkout4;
import com.model.Details;
import com.model.OrderSummary;
import com.model.Product;
import com.model.Supplier;
import com.model.User;

@Configuration
@EnableTransactionManagement
@ComponentScan("com")
public class HibernateConfig {
	
	@Bean(name="dataSource")
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:h2:tcp://localhost/~/medioxy1");
		ds.setUsername("sa");
		ds.setPassword("");
		return ds;
	}
	
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		Properties p=new Properties();
		p.setProperty("hibernate.hbm2ddl.auto","update");
		p.setProperty("batch_size", "20");
		p.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		p.put("hibernate.show_sql", "true");
		p.put("mail.smtp.host", "localhost");
		
		
		LocalSessionFactoryBuilder sf=new LocalSessionFactoryBuilder(getH2DataSource());
		sf.addProperties(p);
		sf.addAnnotatedClasses(Category.class,Supplier.class,Product.class,User.class,Details.class,Basket.class,Checkout1.class,Checkout2.class,Checkout3.class,Checkout4.class,OrderSummary.class);
		SessionFactory sessionFactory=sf.buildSessionFactory();
		System.out.println("Session Factory Object Created");
		return sessionFactory;
		
	}
	
	
	@Bean
	HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager hm=new HibernateTransactionManager(sessionFactory);
		return hm;
		
	}
	
	

}
