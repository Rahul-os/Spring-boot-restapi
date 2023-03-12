package com.restapi.service;
import java.util.Optional;

import com.restapi.entity.Student;

public interface StudentService {
	
	//implementing the basic CRUD operations for the Student Entity.
	
	 int addStudentDetails(Student student); 
	 
	 Optional<Student> getStudentByNumber(int stdnum);

}
