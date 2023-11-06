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
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Filiere;
import com.example.demo.service.FiliereService;

@RestController
@RequestMapping(path = "/filiere")
@CrossOrigin
public class FiliereController {
	
	@Autowired
	FiliereService filiereservice;
	
	@GetMapping(path="/all")
	public List<Filiere> getAllFilieres(){
		return filiereservice.getAllFiliere();
	}

	@PostMapping(path="/insert")
	public Filiere insertFiliere(@RequestBody Filiere filiere) {
		return filiereservice.insertFiliere(filiere);
	}
	@DeleteMapping(path="/delete/{id}")
	public void deleteFiliere(@PathVariable Long id) {
		filiereservice.deleteFiliere(id);
	}
	
	
}
