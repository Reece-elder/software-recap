package com.qa.project.persistence.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cake {
	
	// CTRL SHIFT O Imports everything

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Sets ID Field to auto increment
	private Long id;
	
	private String flavour;
	private int size;
	private boolean icing;
	
	// Auto generate Controllers + getters and setters, not including ID
	
	public Cake() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cake(Long id, String flavour, int size, boolean icing) {
		super();
		this.id = id;
		this.flavour = flavour;
		this.size = size;
		this.icing = icing;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean getIcing() {
		return icing;
	}

	public void setIcing(boolean icing) {
		this.icing = icing;
	}
	
}
