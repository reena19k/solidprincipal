package com.aurionpro.model;

public class Shelf {
	 Iproduct product;
	    public void addProduct(Iproduct product){
	        product.getSample();
	        product.seeReviews();
	    }

	    void customizedShelf(){
	        System.out.println("Shelf is properly arranged");
	    }

}
