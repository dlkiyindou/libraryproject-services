package com.scholanova.groupe2.libraryproject.services;

import org.hibernate.Session;

import com.scholanova.groupe2.libraryproject.services.utils.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateUtil.getSession();
    	System.out.println(session.getProperties());
    }
}
