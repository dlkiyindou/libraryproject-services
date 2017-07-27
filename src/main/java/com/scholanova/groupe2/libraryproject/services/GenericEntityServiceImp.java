package com.scholanova.groupe2.libraryproject.services;

import java.util.Collection;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import com.scholanova.groupe2.libraryproject.entities.AbstractEntity;
import com.scholanova.groupe2.libraryproject.services.utils.HibernateUtil;
import com.scholanova.groupe2.libraryproject.services.utils.PersistenceUtil;

public abstract class GenericEntityServiceImp<T extends AbstractEntity> {
	private Session session = HibernateUtil.getSession();
	private EntityManager entityManager = PersistenceUtil.getEntityManager();

	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * 
	 * @param Long id 
	 * @param Class clazz
	 * @return T
	 */
	protected T get(Long id, Class<T> clazz) {
		return entityManager.find(clazz, id);
	}

	/**
	 * 
	 * @param Class clazz
	 * @return
	 */
	protected Collection<T> getAll(Class<T> clazz) {
		return entityManager.createQuery("FROM "+ clazz.getName(), clazz).getResultList();
	}
	
	/**
	 * 
	 * @return
	 */
	protected Session getSession() {
		return session;
	}
}