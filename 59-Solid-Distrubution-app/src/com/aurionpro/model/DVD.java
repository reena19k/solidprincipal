package com.aurionpro.model;

public class DVD implements Iproduct {

	  @Override
	    public void seeReviews() {
	        System.out.println("DVD is reviewed");
	    }

	    @Override
	    public void getSample() {
	        System.out.println("Sample is played");
	    }
}
