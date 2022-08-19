package com.aurionpro.model;

public class Book implements Iproduct {
	@Override
    public void seeReviews() {
        System.out.println("Book is reviewed");
    }

    @Override
    public void getSample() {
        System.out.println("Sample is read");
    }
}
