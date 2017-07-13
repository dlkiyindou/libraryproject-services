package com.scholanova.groupe2.libraryproject.services.dao.impl;

import java.util.Collection;

import org.hibernate.Session;

import com.scholanova.groupe2.libraryproject.entities.User;
import com.scholanova.groupe2.libraryproject.services.UserSrv;
import com.scholanova.groupe2.libraryproject.services.utils.HibernateUtil;

public class UserSrvImpl implements UserSrv{

	private Session session = HibernateUtil.getSession();
	
	public User get(Long id) {
		return session.load(User.class, id);
	}

	public Collection<User> getByFields(String KeyName, Object... values) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<User> getAll() {
		return session.createQuery("FROM User",User.class).getResultList();
	}

}
