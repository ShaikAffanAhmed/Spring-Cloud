package com.app.affan.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.app.affan.entity.Student;

public interface StudentRepository extends ReactiveMongoRepository<Student, String>{

}
