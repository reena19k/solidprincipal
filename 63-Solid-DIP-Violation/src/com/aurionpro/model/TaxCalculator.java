package com.aurionpro.model;

public class TaxCalculator {
	LogType logger;

	public TaxCalculator(LogType logger) {
		super();
		this.logger = logger;
	}
	public double calculateTax(int amount, int rate) {
		double tax = 0;
		try {
			tax = amount/rate;
		}
		catch(Exception e) {
			if(logger == LogType.DB) {
				new DBLogger().log("an error occured");
			}
			if(logger == LogType.FILE) {
				new FileLogger().log("an error occured");
			}
		}
		return tax;
	}
}


