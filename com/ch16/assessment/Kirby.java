package com.company.example.ch16.assessment;

public class Kirby {
    protected int hp = 100;
    public void Attack() {
        System.out.println("일반 공격 1회");
    }

    public void Defense() {
        System.out.println("공격을 방어합니다");
    }
    public void hovering() {
        System.out.println("10초 동안 날고 있습니다");
    }
    public void showInfo() {
        System.out.println("체력 : " + hp);
    }

    public static void main(String[] args) {
        Kirby k1 = new Kirby();
        Sward k2 = new Sward();
        Gigantsward k3 = new Gigantsward();
        Cutter k4 = new Cutter();
        ChakramCutter k5 = new ChakramCutter();

        k1.Attack();
        k2.Rolling();
        k3.showInfo();
        k5.ChargingAttack();
        k2.hovering();
        k3.Attack();
    }
}

