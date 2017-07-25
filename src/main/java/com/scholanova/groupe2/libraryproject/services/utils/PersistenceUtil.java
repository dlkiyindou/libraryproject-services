package com.scholanova.groupe2.libraryproject.services.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.spi.PersistenceProvider;

public class PersistenceUtil {
	private static EntityManagerFactory entityManagerFactory;
	
    private static EntityManagerFactory buildEntityManagerFactory () {
    	return Persistence.createEntityManagerFactory( "com.scholanova.groupe2.libraryproject" );
    }
    
    public static EntityManagerFactory getEntityManagerFactory() {
    	if (entityManagerFactory == null) {
    		entityManagerFactory = buildEntityManagerFactory();
    	}
    	
    	return entityManagerFactory;
    }
    
    public static EntityManager getEntityManager() {
    	return getEntityManagerFactory().createEntityManager();
    }
}