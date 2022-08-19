package com.aurionpro.model;

public class Manager implements Iworker {

	@Override
	public void startWork() {
		System.out.println("Manager is startworking");
	}

	@Override
	public void stopWork() {
		System.out.println("manager is stopworking");
	}

	@Override
	public void startEat() {
		System.out.println("manager is start eating");
	}

	@Override
	public void stopEat() {
		System.out.println("manager is stop eating");
	}

}
