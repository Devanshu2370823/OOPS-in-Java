package com.cts.learning.oops;

public class Car {
	public String getModel() {
		return model;
	}

	public void setMake(String make) {
		if(make == null) {
			make = "Unknown";
		}
		String lowercaseMake = make.toLowerCase();
		switch(lowercaseMake) {
			case "holden", "porsche", "tesla" -> this.make = make;
			default -> {
				this.make = "Unsupported";
			}
		}
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}

	public String getColor() {
		return color;
	}

	public int getDoors() {
		return doors;
	}

	public boolean isConvertible() {
		return convertible;
	}

	private String make = "Tesla";
	private String model = "ModelX";
	private String color = "Gray";
	private int doors = 2;
	private boolean convertible = true;
	
	public String getMake() {
		return make;
	}
	
	public void describeCar() {
		System.out.print(doors + "-Door " + color + " " + make + " " + model + " " + (convertible ? "Convertible" :" "));
	}
}
