package com.springtelusko.springjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springtelusko.springjpa.model.Student;

@SpringBootApplication
public class SpringjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringjpaApplication.class, args);

		StudentRepo repo=context.getBean(StudentRepo.class);

		Student s1=context.getBean(Student.class);
		Student s2=context.getBean(Student.class);
		Student s3=context.getBean(Student.class);

		s1.setRollNo(101);;
		s1.setMarks(89);
		s1.setName("first");
		s2.setRollNo(102);;
		s2.setMarks(89);
		s2.setName("first1");
		s3.setRollNo(103);;
		s3.setMarks(89);
		s3.setName("first2");

		// repo.save(s2);
		// repo.save(s3);
		repo.findByName("first");

	}

}
