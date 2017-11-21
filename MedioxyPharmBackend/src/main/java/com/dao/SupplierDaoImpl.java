package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Supplier;


@Repository("supplierDao")
public class SupplierDaoImpl implements SupplierDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean addSupplier(Supplier supplier) {
		try
		{
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
		
	}

	@Transactional
	@Override
	public boolean updateSupplier(Supplier supplier) {
		try
		{
			Supplier supplierToUpdate=getSupplier(supplier.getSuppId());
			supplierToUpdate.setSuppName(supplier.getSuppName());
			supplierToUpdate.setSuppDesp(supplier.getSuppDesp());
			sessionFactory.getCurrentSession().update(supplierToUpdate);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

	@Transactional
	@Override
	public boolean deleteSupplier(Supplier supplier) {
		try
		{
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
		
	}

	@Transactional
	@Override
	public List<Supplier> retrieveSupplier() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Supplier");
		List<Supplier>listSupplier=query.list();
		session.close();
		return listSupplier;
	}

	@Transactional
	@Override
	public Supplier getSupplier(int suppId) {

		Session session=sessionFactory.openSession();
        Supplier supplier=(Supplier)session.get(Supplier.class, suppId);
        session.close();
		return supplier;
	}

}
