package com.aurionpro.model;

public class TaxCalculator {
	ILogger logger;

	public TaxCalculator(ILogger logger) {
		super();
		this.logger = logger;
	}
	public double calculateTax(int amount, int rate) {
		double tax = 0;
		try {
			tax = amount/rate;
		}
		catch(Exception e) {
			logger.logger();
			
		}
		return tax;
	}
}

