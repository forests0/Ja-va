package com.company.example.ch10.Generics;

public class FinallyTryCatch {
    public static void main(String[] args) {
        try {
            int x= 5;
            int y = 20 / (5 - x);
            System.out.println(y);
        } catch (ArithmeticException e) {
            System.out.println("===> 0으로 나눔");
        }finally {
            System.out.println("수행되어야만 합니다");
        }
    }
}
