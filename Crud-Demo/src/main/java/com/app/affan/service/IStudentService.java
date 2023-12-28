package com.app.affan.service;

import java.util.List;

import com.app.affan.entity.Student;

public interface IStudentService {

	//create 
	public String saveStudent(Student student);
	
	//get all 
	public List<Student> getAll();
	
	//get by id
	public Student getById(Integer id);
	
	//update
	public String updateStudent(Student std);
	
	//delete
	public String deleteById(Integer id);
}
