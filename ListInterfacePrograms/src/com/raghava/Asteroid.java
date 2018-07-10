package com.raghava;

public class Asteroid {

	private String name;
	private double diameter;
	
	
	
	public Asteroid(String name, double diameter) {
		
		this.name = name;
		this.diameter = diameter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	@Override
	public String toString() {
		return String.format("%s [%.2f]", getName(), getDiameter());
	}
	
	
}
