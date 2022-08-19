package com.aurionpro.test;

import com.aurionpro.model.LogType;
import com.aurionpro.model.TaxCalculator;

public class TaxCalulatorTest {

	public static void main(String[] args) {
		TaxCalculator taxcalci = new TaxCalculator(LogType.DB);
		System.out.println(taxcalci.calculateTax(2335, 34));	
	}

}