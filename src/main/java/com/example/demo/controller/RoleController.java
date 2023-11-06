package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Role;
import com.example.demo.service.RoleService;

@RestController
@RequestMapping("/role")
@CrossOrigin
public class RoleController {
	
	@Autowired
    private  RoleService roleService;
    
	  @GetMapping(path="/all")
	  public @ResponseBody List<Role> getAllUsers() {
		    return roleService.getAllRoles();
		  } 
	  @PostMapping(path="/insert")
	    public Role createRole(@RequestBody Role role) {
	        return roleService.insertRole(role);
	    }
	  @DeleteMapping("/delete/{id}")
	  public void deleteRole(@PathVariable Long id) {
		  roleService.deleteRole(id);
	  }
}

