package com.sarita.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.sarita.student.dal.entities.Student;
import com.sarita.student.dal.Repository.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {
	@Autowired
	private StudentRepository repo;

	@Test
	void testCreateStudent() {
		Student student = new Student();
		student.setName("jhon");
		student.setCourse("serverless using AWS Lambda");
		student.setFee(30d);
		repo.save(student);
	}

	@Test
	void testStudentFindByID() {
		Student student = repo.findById((long) 1).get();
		System.out.println(student);
	}

	@Test
	void testUpdateStudent() {
		Student student = repo.findById((long) 1).get();

		student.setFee(40d);
		repo.save(student);

	}
	@Test
	void testDeleteStudent() {
		Student student = repo.findById((long) 1).get();	
		
		repo.delete(student);
		
	}
	
}