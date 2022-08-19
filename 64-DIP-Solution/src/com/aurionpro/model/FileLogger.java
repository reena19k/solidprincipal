package com.aurionpro.model;

public class FileLogger implements ILogger {

	@Override
	public void logger() {
		System.out.println("Log to file");
	}

}
