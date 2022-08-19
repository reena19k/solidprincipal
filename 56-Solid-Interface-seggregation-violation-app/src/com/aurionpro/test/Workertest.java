package com.aurionpro.test;

import com.aurionpro.model.Iworker;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Robot;

public class Workertest {
	public static void main(String[] args) {
		Iworker manager = new Manager();

		atWorkStation(manager);
		atThecanteen(manager);
		System.out.println("_____________");
		Iworker robot = new Robot();
		atWorkStation(robot);
		atThecanteen(robot);
		System.out.println("______________");
	}

	private static void atThecanteen(Iworker worker) {
		   worker.startEat();
           worker.stopEat();
	}

	private static void atWorkStation(Iworker worker) {
		  worker.startWork();
          worker.stopWork();
	}
}