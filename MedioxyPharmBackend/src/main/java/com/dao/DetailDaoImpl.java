package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Category;
import com.model.Details;
@Repository("detailDao")
public class DetailDaoImpl implements DetailDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean addDetail(Details detail) {
		try
		{
			
			
			sessionFactory.getCurrentSession().save(detail);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e);
			return false;
		}
	}

	@Override
	public boolean updateDetail(Details detail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	@Override
	public boolean deleteDetail(Details detail) {
		try
		{
			sessionFactory.getCurrentSession().delete(detail);
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
	public List<Details> retrieveDetail() {
		
		
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Details");
		
		List<Details>listDetail=query.list();
		session.close();
		return listDetail;
		
	}
	
	

	@Transactional
	@Override
	public Details getDetail(int id) {
		
		Session session=sessionFactory.openSession();
		Details detail=(Details)session.get(Details.class, id);
		session.close();
		return detail;
	}

}
