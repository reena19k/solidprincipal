package com.aurionpro.model;

public class Shelf {
	Book book;

	DVD dvd;
	void addBook(Book book) {
		System.out.println("Book is added into shelf");
	}

	void addDVD(DVD dvd) {
		System.out.println("DVD is added into shelf");
	}

	void customizedShelf() {
		System.out.println("Shelf is organized to add more ");
	}

}
