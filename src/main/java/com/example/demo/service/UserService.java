package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userrepository;
	
	 public List<User> getAllUsers() {
		return userrepository.findAll();
		}
	 
	 public User createUser(User user) {
		 return userrepository.save(user);
	 }
	 public void deleteUser(Long id) {
		 userrepository.deleteById(id);
	 }
}
