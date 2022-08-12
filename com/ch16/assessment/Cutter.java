package com.company.example.ch16.assessment;

public class Cutter extends Kirby{
    public Cutter() {
        super.hp = 100;
    }
    public void ChargingAttack() {
        System.out.println("공격을 차징해 강한 공격을 날립니다");
    }
}


class ChakramCutter extends  Cutter {
    public ChakramCutter() {
        super.hp = 100;
    }

    public void ContinuousAttack() {
        System.out.println("연속공격을 빠르게 날립니다");
    }
}