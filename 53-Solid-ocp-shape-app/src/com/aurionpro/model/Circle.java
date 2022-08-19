package com.aurionpro.model;

public class Circle implements IShape {
	private double radius;
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	


	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

}