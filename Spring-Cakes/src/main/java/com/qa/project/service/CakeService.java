package com.qa.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.project.exception.CakeNotFoundException;
import com.qa.project.persistence.model.Cake;
import com.qa.project.persistence.repo.CakeRepo;

@Service
public class CakeService {
	
	// Takes in the repo class and calls it repo
	private CakeRepo repo;

	// Constructor to create our service
	public CakeService(CakeRepo repo) {
		super();
		this.repo = repo;
	}
	
	// Method to createCake will return a CakeClass object, takes in an object of CakeClass
	public Cake createCake(Cake cake) {
		
		// Returns the function of the repo saving the object passed in
		// Ctrl and click on Save to open declaration
		return this.repo.save(cake);
	}
	
	public List<Cake> getAllCake() {
		return this.repo.findAll();
	}
	
	
	public boolean deleteCake(Long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}
	
	public Cake updateCake(Cake newCake, Long id) {
		Optional<Cake> optCake = this.repo.findById(id);
		Cake oldCake = optCake.orElseThrow(() -> new CakeNotFoundException());
		
		oldCake.setFlavour(newCake.getFlavour());
		oldCake.setIcing(newCake.getIcing());
		oldCake.setSize(newCake.getSize());
		
		Cake updatedCake = this.repo.save(oldCake);
		return updatedCake;
	}
	
	

}
