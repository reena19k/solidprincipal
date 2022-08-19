package com.aurionpro.test;

import com.aurionpro.model.DBLogger;
import com.aurionpro.model.FileLogger;
import com.aurionpro.model.TaxCalculator;

public class LoggerTest {
	public static void main(String[] args) {
		TaxCalculator taxcalculate = new TaxCalculator(new FileLogger());
		taxcalculate.calculateTax(10000, 0);
	}
}
