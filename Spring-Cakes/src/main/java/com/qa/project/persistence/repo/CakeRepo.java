package com.qa.project.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.project.persistence.model.Cake;

// Cake repo extends JPARepository, that takes in the object/class and the type of ID
@Repository
public interface CakeRepo extends JpaRepository<Cake, Long> {
	
	// Save() and other methods being used are in the JpaRepository by default. No need to specify

}
