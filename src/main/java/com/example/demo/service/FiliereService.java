package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Filiere;
import com.example.demo.repository.FiliereRepository;

@Service
public class FiliereService {
	
	@Autowired
	FiliereRepository filiererepository;
	
	public List<Filiere> getAllFiliere(){
		return filiererepository.findAll();	}
	
	public Filiere insertFiliere(Filiere filiere) {
		return filiererepository.save(filiere)
;	}
	public void deleteFiliere(Long id) {
		filiererepository.deleteById(id);
	}

}
