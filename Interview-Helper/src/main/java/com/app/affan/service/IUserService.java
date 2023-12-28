package com.app.affan.service;

import java.util.List;

import com.app.affan.entity.User;

public interface IUserService {

	//create
	public String saveUser(User user);
	
	//fetchAll
	public List<User> getAll();

    //fetch By companyName
	public List<User> getbyCompany(String name);
	
}
