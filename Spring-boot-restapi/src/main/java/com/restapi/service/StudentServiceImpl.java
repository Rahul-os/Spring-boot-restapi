package com.restapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.entity.Student;
import com.restapi.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository stdrepo;
	
	@Override
	public int addStudentDetails(Student studentdetails) {
		// TODO Auto-generated method stub
		
		stdrepo.save(studentdetails);
		
		return studentdetails.getStdnumber();
		
	}

	@Override
	public Optional<Student> getStudentByNumber(int stdnum) {
		// TODO Auto-generated method stub 
		Optional<Student> std = stdrepo.findById(stdnum);
		if(std.isEmpty())
			System.out.println("student not found!!!");
		return std;
	}
	
	

}
