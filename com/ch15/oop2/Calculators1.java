package com.company.example.ch15.oop2;

public class Calculators1 {
    public static void main(String[] args) {
        Calculator cal =new Calculator();
        cal.add(10);
        System.out.println(cal.getValue());

        UpgradeCalculator cals =new UpgradeCalculator();
        cals.add(10);
        cals.minus(3);
        System.out.println(cals.getValue());  // 10에서 7을 뺀 3을 출력

        MaxlimitCalculator calr = new MaxlimitCalculator();
        calr.add(50);  // 50 더하기
        calr.add(60);  // 60 더하기
        System.out.println(calr.getValue());  // 100 출력

        IsoddCalculator iscal = new IsoddCalculator();
        iscal.add(15);
        System.out.println(iscal.isodd());

        int[] data = {1, 3, 5, 7, 9};
        AverageCalculator avcal = new AverageCalculator();
        int result = avcal.avg(data);
        System.out.println(result);


    }
}

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }


    int getValue() {
        return this.value;
    }

}


