package com.hibernate.crud.client;

import com.hibernate.crud.model.Teacher;
import com.hibernate.crud.service.TeacherService;

public class TeacherClient {
	
	private static TeacherService teacherService = new TeacherService();
	
	
	public static void main(String [] args) {
		
		Teacher teacher = new Teacher ("Bhuvan", 150000, "bhuvan@gmail.com");
		teacherService.insertTeacherRecords(teacher);
	}

}
