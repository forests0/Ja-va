package com.company.example.ch15.oop2;

public class AverageCalculator {
    int value;

        AverageCalculator() {
            this.value = 0;
        }
        void add(int val) {
            this.value += val;
        }
        int getValue() {
            return this.value;
        }
        int avg(int[] data) {
            int a = 0;
            for(int i = 0; i < data.length; i++) {
                a += data[i];
            }
            return a / data.length;
        }

    }

