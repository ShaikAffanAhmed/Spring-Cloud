package com.app.affan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.affan.entity.User;
import com.app.affan.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/v1/user")
public class UserController {

	@Autowired
	private UserServiceImpl service;
	
	    @PostMapping("/create")
		public String saveUser(@RequestBody User user) {
			return service.saveUser(user);
		}
		
		@GetMapping("/fetchAll")
		public List<User> getAll() {
			return service.getAll();
		}
		
		@GetMapping("/getby/{name}")
		public List<User> getCompany(@PathVariable String name) {
			return service.getbyCompany(name);
		}
}
