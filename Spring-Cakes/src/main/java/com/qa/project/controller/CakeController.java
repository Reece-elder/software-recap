package com.qa.project.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.project.persistence.model.Cake;
import com.qa.project.service.CakeService;

@RestController
@CrossOrigin // Stops CORS issues
public class CakeController {
	
	// Saves the CakeService class as an object called service
	private CakeService service;

	// Creates a constructor for controller incorporating the service
	public CakeController(CakeService service) {
		super();
		this.service = service;
	}
	
	// Web Endpoints
	
	// When sending a GET request to /hello
	@GetMapping("/hello")
	public String greeting() {
		return "Hello World!";
	}
	
	// Run app
	// Go to localhost:8080/hello
	// Exercise set up a Controller that returns a string when accessing it on localhost
	
	
	@PostMapping("/create")
	// Method will return a String 
	// Method is called createCake and takes in a response body called cake of type Cake
	public ResponseEntity<String> createCake(@RequestBody Cake cake){
		
		// The Service method createCake is ran which takes in cake (response body)
		// Method returns a ResponseEntity Which is a String saying object created AND a http status
		this.service.createCake(cake);
		return new ResponseEntity<String>("Cake of flavour: " + cake.getFlavour() + " created", HttpStatus.CREATED);

	}
	
	// Method returns a List of CakeClass objects
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Cake>> getAllCake(){
		
		// ResponseEntity returns the return of the service method getAllCake and gets HTTPStatus Ok
		return ResponseEntity.ok(this.service.getAllCake());
	}
	
	// Exercise Create a getAll Request and a Create request
	
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteCake(@PathVariable Long id){
		if(this.service.deleteCake(id)) {
			return new ResponseEntity<String>("Object Deleted!", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Object Can't be Deleted!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateCake(@RequestBody Cake cake, @PathVariable Long id){
		this.service.updateCake(cake, id);
		return new ResponseEntity<String>("Cake of flavour: " + cake.getFlavour() + " updated", HttpStatus.ACCEPTED);
	}
	
	

}
