package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Role;
import com.example.demo.repository.RoleRepository;


@Service
public class RoleService {
	
    @Autowired
    private RoleRepository rolerepository;
    
    
    public List<Role> getAllRoles(){
    	return rolerepository.findAll(); 
    }
    
    public Role insertRole(Role role ) {
    	return rolerepository.save(role);
    }
    public void deleteRole(Long id) {
    	 rolerepository.deleteById(id);
    }
    
    
    
    

}
