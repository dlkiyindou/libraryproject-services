package com.scholanova.groupe2.libraryproject.services.dao.impl;

import java.util.Collection;

import org.hibernate.Session;

import com.scholanova.groupe2.libraryproject.entities.Stock;
import com.scholanova.groupe2.libraryproject.services.StockSrv;
import com.scholanova.groupe2.libraryproject.services.utils.HibernateUtil;

public class StockSrvImpl implements StockSrv {
	
	private Session session = HibernateUtil.getSession();

	public Stock get(Long id) {
		return session.load(Stock.class, id);
	}

	public Collection<Stock> getByFields(String attributName, Object... values) {
		return null;
	}

	public Collection<Stock> getAll() {
		return session.createQuery("FROM Stock", Stock.class).getResultList();
	}

}
