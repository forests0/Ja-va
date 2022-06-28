package com.company.example.ch15.oop2;

public class IsoddCalculator{
    int value;

    IsoddCalculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    boolean isodd() {
        if(this.value % 2 == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}
