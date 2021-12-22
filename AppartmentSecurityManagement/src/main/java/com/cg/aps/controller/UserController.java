package com.cg.aps.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.cg.aps.entities.UserEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.service.UserServiceImpl;
import com.cg.aps.service.UserServiceInt;

@RestController 
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserServiceImpl user; 
	@PostMapping("/add")
	public long add(@RequestBody UserEntity bean) throws DuplicateRecordException {
		user.add(bean);
		return 0;
		
	}
	
	@PostMapping("/update")
	public void update(UserEntity bean) throws RecordNotFoundException {
		user.update(bean);
	}
	
	@DeleteMapping("/delete")
	public void delete(UserEntity bean) throws RecordNotFoundException {
		user.delete(bean);
	}
	
	@GetMapping("/findbylogin")
	public UserEntity findByLogin(String login) throws RecordNotFoundException {
		return user.findByLogin(login);
	}
	
	@GetMapping("/findbypk")
	public UserEntity findByPk(long id) throws RecordNotFoundException {
		return user.findByPk(id);
		
	}
	
	@GetMapping("/autheticate")
	public UserEntity authenticate(UserEntity bean) {
		return bean;
	}
}
