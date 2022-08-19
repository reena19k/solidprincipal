package com.aurionpro.model;

public class Rectangle implements IShape {
	private double lenght;
	private double breath;


	public Rectangle(double lenght, double breath) {
		super();
		this.lenght = lenght;
		this.breath = breath;
	}


	@Override
	public double CalculateArea() {
		
		return lenght*breath ;
	}

}
