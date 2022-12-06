package com.hibernate.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class has representation in database
 * Hibernate mandates that the persistence class to have default no argument constructor
 * There should be no business logic in the entity class
 * This class is also referred as
 * 	-POJO Plain old Java Object
 * 	-DTO Data/domain transfer object
 * 
 * @author hetvi
 *
 */

@Entity
@Table(name = "teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	@Column(name="teacher_name", nullable=false)
	private String name;
	
	@Column(name="teacher_salary", nullable=false)
	private double salary;
	
	@Column(name="teacher_email", nullable=false)
	private String emailAddress;

	Teacher(){
		
	}

	public Teacher(String name, double salary, String emailAddress) {
		super();
		this.name = name;
		this.salary = salary;
		this.emailAddress = emailAddress;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Teacher [Id=" + Id + ", name=" + name + ", salary=" + salary + ", emailAddress=" + emailAddress + "]";
	}
	
}
