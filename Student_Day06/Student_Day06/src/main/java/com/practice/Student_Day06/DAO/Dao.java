package com.practice.Student_Day06.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.practice.Student_Day06.model.Student;

@Repository
public class Dao {

	List<Student> list = new ArrayList<Student>();
	
	public List<Student> getStudentData() {
		
		list.add(new Student(101,"Ankit"));
		list.add(new Student(102,"Aishwaraya"));
		
		return list;
	}
}
