package com.scholanova.groupe2.libraryproject.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.scholanova.groupe2.libraryproject.entities.User;
import com.scholanova.groupe2.libraryproject.services.utils.HibernateUtil;
import com.scholanova.groupe2.libraryproject.services.utils.PersistenceUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateUtil.getSession();
    	//Query query = session.createQuery("FROM " + User.class.getName(), User.class);
    	//List<User> l = query.getResultList();
    	
    	//User user = session.get(User.class, 1);
    	
    	EntityManager entityManager = PersistenceUtil.getEntityManager();
    	System.out.println("FROM " + User.class.getName());
    	TypedQuery<User> typedQuery = entityManager.createQuery("FROM " + User.class.getName(), User.class);
    	List<User> l = typedQuery.getResultList();
    	
    	
    	System.out.println(l);
    }
}
