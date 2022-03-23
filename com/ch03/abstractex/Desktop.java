package com.company.example.ch03.abstractex;

public class Desktop extends Computer{

    @Override
    public void display() {
        System.out.println("Desktop Display();");
    }

    @Override
    public void typing() {
        System.out.println("Desktop Typing();");
    }
}
