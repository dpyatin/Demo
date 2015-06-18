package main;

import java.io.Serializable;

public class Vehicle implements Serializable {
	
	String brand;
	String model;
	String color;
	
	public Vehicle (String brand, String model, String color ) {
		this.brand = brand;
		this.model = model;
		this.color = color;
	}
	
	public Vehicle() {}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
