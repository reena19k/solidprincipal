package com.aurionpro.model;

public class Robot implements Iworker {

	@Override
	public void startWork() {
		System.out.println("robot is startworking");
	}

	@Override
	public void stopWork() {
		System.out.println("robot is stopworking");
	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robots cannot eat");	}

	@Override
	public void stopEat() {
		throw new RuntimeException("Robots cannot eat");	
	}

}
