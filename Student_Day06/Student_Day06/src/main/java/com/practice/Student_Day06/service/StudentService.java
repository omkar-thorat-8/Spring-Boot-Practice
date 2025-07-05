package com.practice.Student_Day06.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Student_Day06.DAO.Dao;
import com.practice.Student_Day06.model.Student;

@Service
public class StudentService {

	@Autowired
	Dao dao;
	
	public List<Student> getData() {
		
		List<Student> studentData = dao.getStudentData();
		
		return studentData;
	}
}
