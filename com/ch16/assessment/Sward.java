package com.company.example.ch16.assessment;

public class Sward extends Kirby{
   public Sward() {
       super.hp = 100;
   }

    public void Rolling() {
        System.out.println("커비가 굴러서 공격을 회피합니다");
    }
}

class Gigantsward extends Sward {
    public Gigantsward() {
        super.hp = 200;
    }
    public void Attack() {
        System.out.println("강한 기본 공격 1회");
    }
}
