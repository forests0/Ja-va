package com.company.example.ch05.finalex;

public class Constant {
    int num = 30;
    final int NUM = 100;

    public static void main(String[] args) {
        Constant cons = new Constant();
        cons.num = 20;
        //cons.NUM = 2200;

        System.out.println(cons.num);
        System.out.println(cons.NUM);
    }
}
