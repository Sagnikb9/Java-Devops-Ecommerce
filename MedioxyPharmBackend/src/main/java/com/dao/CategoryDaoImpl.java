package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean addCategory(Category category) {
		
		try
		{
			sessionFactory.getCurrentSession().save(category);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e);
			return false;
		}
	}

	@Transactional
	@Override
	public List<Category> retrieveCategory() {
		
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Category");
		List<Category>listCategory=query.list();
		session.close();
		return listCategory;
	}

	@Transactional
	@Override
	public boolean deleteCategory(Category category) {

		try
		{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e);
			return false;
		}
	}

	@Transactional
	@Override
	public Category getCategory(int catgId) {
		
		Session session=sessionFactory.openSession();
		Category category=(Category)session.get(Category.class, catgId);
		session.close();
		return category;
	}

	@Transactional
	@Override
	public boolean updateCategory(Category category) {
		try
		{
			Category categoryToUpdate=getCategory(category.getCatgId());
			categoryToUpdate.setCatgName(category.getCatgName());
			categoryToUpdate.setCatgDesp(category.getCatgDesp());
			sessionFactory.getCurrentSession().update(categoryToUpdate);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e);
			return false;
		}
	}

}
