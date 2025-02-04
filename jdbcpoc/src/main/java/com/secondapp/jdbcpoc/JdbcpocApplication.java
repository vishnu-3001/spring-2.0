package com.secondapp.jdbcpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.*;

@SpringBootApplication
public class JdbcpocApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(JdbcpocApplication.class, args);
		System.out.println("hrllo from jdbc");
		student s=context.getBean(student.class);
		s.setMarks(95);
		s.setName("vishnu");
		s.setRollNo(4);
		StudentService ser=context.getBean(StudentService.class);
		ser.addStudent(s);
		List<student> students=ser.getStudents();
		System.out.println(students);
	}

}
