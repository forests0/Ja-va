package com.company.example.ch03.abstractex;

public abstract class Computer {
    public abstract void display();
    public abstract void typing();

    public void turnon() {
        System.out.println("turnOn");
    }
    public void turnoff() {
        System.out.println("turnOff");
    }
}
