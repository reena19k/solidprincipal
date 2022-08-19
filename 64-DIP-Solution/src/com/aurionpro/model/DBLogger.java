package com.aurionpro.model;

public class DBLogger implements ILogger {

	@Override
	public void logger() {
		System.out.println("log to database");
	}

}
