package com.aurionpro.test;

import com.aurionpro.model.Ieatable;
import com.aurionpro.model.Iworkable;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Robot;

public class Workoreattest {

	public static void main(String[] args) {
		Iworkable robot = new Robot();
		atWorkStation(robot);

		System.out.println("________");

		Ieatable manager = new Manager();
		atCanteen(manager);
		atWorkStation(manager);

	}

	public static void atWorkStation(Iworkable worker) {
		worker.startWork();
		worker.stopWork();
	}

	public static void atCanteen(Ieatable worker) {
		worker.startEat();
		worker.stopEat();
	}
}
