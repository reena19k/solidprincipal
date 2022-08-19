package com.aurionpro.model;
public class Manager implements Ieatable{

    public void startEat() {
        System.out.println("Manager is eating");
    }


    public void stopEat() {
        System.out.println("Manager is not eating");
    }


    public void startWork() {
        System.out.println("Manager is working");
    }


    public void stopWork() {
        System.out.println("Manager is not working");
    }
}