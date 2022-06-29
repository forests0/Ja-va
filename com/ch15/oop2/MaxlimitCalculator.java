package com.company.example.ch15.oop2;

public class MaxlimitCalculator extends Calculator{

    @Override
    int getValue() {
        if(super.getValue() > 100) {
            return 100;
        }
        else {
            return super.getValue();
        }
    }
}
