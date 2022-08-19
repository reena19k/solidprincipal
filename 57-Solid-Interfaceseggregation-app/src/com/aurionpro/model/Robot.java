package com.aurionpro.model;

public class Robot implements Iworkable {
	 @Override
	    public void startWork() {
	        System.out.println("Robot has started working");
	    }

	    @Override
	    public void stopWork() {
	        System.out.println("Robot is not working");
	    }
}
