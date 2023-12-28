package com.app.affan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.affan.entity.User;
import com.app.affan.repo.UserRepository;
import com.app.affan.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserRepository repo;
	
	public String saveUser(User user) {
        user = repo.save(user);
        if(user.getUserId()!=null) {
        	return "Save Successfully" + user.getUserId();
        }
        else 
        	return "Failed to create";
		}

	public List<User> getAll() {
		return repo.findAll();
	}

	public List<User> getbyCompany(String name) {
         return repo.getByCompanyName(name);		
	}
	
}
