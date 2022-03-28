package com.company.example.ch04.template;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("===자율주행하는 자동차====");
        Car mycar = new AICar();
        mycar.run();

        System.out.println("===그냥주행하는 자동차===");
        Car hiscar = new ManualCar();
        hiscar.run();
    }
}
