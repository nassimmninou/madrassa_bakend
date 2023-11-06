package com.example.demo.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@DiscriminatorValue("S")
public class Student extends User {
	
	private String firstname;
	private String lastname;
	private int telephone;
	
	@ManyToOne 
	@JoinColumn( name="idFiliere" )
    private Filiere filiere;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public Student() {
		super();
	}
	public Student(String firstname, String lastname, int telephone) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
	}
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	public Student(String firstname, String lastname, int telephone, Filiere filiere) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.filiere = filiere;
	}
	
	

}

