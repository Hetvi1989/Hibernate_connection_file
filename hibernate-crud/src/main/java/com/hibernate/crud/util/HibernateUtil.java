package com.hibernate.crud.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.crud.model.Teacher;

/**
 * This class load configuration file and create sessionFactory
 * @author hetvi
 *
 */
public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	//create session factory  from the configuration and return session factory

	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			sessionFactory = new Configuration()
										.configure("hibernate-crud.xml")
										.addAnnotatedClass(Teacher.class)
										.buildSessionFactory();
		}
			return sessionFactory;
	}
}
