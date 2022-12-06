package com.hibernate.crud.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.crud.model.Teacher;
import com.hibernate.crud.util.HibernateUtil;

/** 
 * Has dependency on SessionFActory
 * @author hetvi
 *
 */

public class TeacherService {
	
	private final SessionFactory sessionFactory;
	private Session session;
	
	public TeacherService() {
		this.sessionFactory = HibernateUtil.getSessionFactory();
	}
	/**
	 * Template to work with Hibernate
	 * 	- Use the session factory to fatch the session;
	 * 	- From the session, begin transaction
	 * 	- Execute the hibernate
	 * 	- Commit the hibernate transaction
	 * 	- Close the transaction
	 * 	- Close the session 
	 */
	
	public Teacher insertTeacherRecords(Teacher teacher) {
		try{
			
		 session = sessionFactory.openSession();
			// from the session begin transaction
			Transaction transaction = session.beginTransaction();
			Long result = (Long) session.save(teacher);
			System.out.println("The primary key of the stored teacher instance :: "+result);
			transaction.commit();
			
		}catch(Exception exception){
			System.out.println(exception.getMessage());
			exception.printStackTrace();
		}finally {
			session.close();
		}
		return teacher;
	}
	
	public List<Teacher> findAllTeachers() {
		return null;
	}
	
	public Teacher findTeacherByTeacherID(long teacherId) {
		return null;
	}
	
	public void deleteTeacherRecordsByTeacherID(long teacherID) {
		
	}

}
