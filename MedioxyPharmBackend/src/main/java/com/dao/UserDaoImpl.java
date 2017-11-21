package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	@Override
	public boolean addUser(User user) {
		
		
		try
		{
			sessionFactory.getCurrentSession().save(user);
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Transactional
	@Override
	public boolean deleteUser(User user) {
		try
		{
			sessionFactory.getCurrentSession().delete(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Transactional
	@Override
	public boolean updateUser(User user) {
		try
		{
			User userToUpdate=getUser(user.getId());
			userToUpdate.setUsername(user.getUsername());
			userToUpdate.setPassword(user.getPassword());
			userToUpdate.setEnabled(user.isEnabled());
			userToUpdate.setRole(user.getRole());
			
			
			sessionFactory.getCurrentSession().update(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Transactional
	@Override
	public List<User> retrieveUser() {
		
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from User");
		List<User>listUser=query.list();
		session.close();
		return listUser;
	}

	@Transactional
	@Override
	public User getUser(int id) {
		
		Session session=sessionFactory.openSession();
		User user=(User)session.get(User.class, id);
		session.close();
		return user;
	}

}
