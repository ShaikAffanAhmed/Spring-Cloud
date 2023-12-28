package com.app.affan.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.affan.entity.Student;
import com.app.affan.repo.StudentRepository;
import com.app.affan.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private StudentRepository repo;
	
	public String saveStudent(Student student) {
		student = repo.save(student);
		if(student.getStdId()!= null)
		return "Create Success...";
		else
			return "Failed to create";
	}

	public List<Student> getAll() {
		return repo.findAll();
	}

	public Student getById(Integer id) {
		Optional<Student> student = repo.findById(id);
		if(student.isPresent())
		return student.get();
		else
			return null;
	}

	public String updateStudent(Student std) {
	    if(repo.existsById(std.getStdId())) {
		 repo.save(std);
	    return "Update Successfully";
	    }
	    else
	    	return "Failed to update";
	}
	
	public String deleteById(Integer id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
		return "Deleted Successfully";
		}
		else
		return "Failed to Delete";
	}

	
}
