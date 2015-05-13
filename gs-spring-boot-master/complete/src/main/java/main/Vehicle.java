package main;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle implements Serializable {
	
	@Id
	@GeneratedValue
	private long id;
	
	String brand;
	String model;
	String color;
	
	public Vehicle (String brand, String model, String color ) {
		this.brand = brand;
		this.model = model;
		this.color = color;
	}
	
	public Vehicle() {}
}
