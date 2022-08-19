package com.aurionpro.test;

import com.aurionpro.model.Book;
import com.aurionpro.model.Iproduct;
import com.aurionpro.model.Shelf;

public class Producttest {
public static void main(String[] args) {
	 Iproduct book = new Book();
     Shelf s1 = new Shelf();
     s1.addProduct(book);
}
}
