package com.company.example.ch15.oop2;

interface Predators {
    String bark();
}

abstract class Animals {
    public String hello() {
        return "hello";
    }
}

class Dogs extends Animal {
}

class Lion extends Animals implements Predators {
    public String bark() {
        return "Bark bark!!";
    }
}

public class AnimalT2 {
    public static void main(String[] args) {
        Animals a =new Lion();
        Lion b =new Lion();
        Predators c =new Lion();

        System.out.println(a.hello());  // 1번
        //System.out.println(a.bark());   // 2번
        //
        System.out.println(b.hello());  // 3번
        System.out.println(b.bark());   // 4번
        //System.out.println(c.hello());  // 5번
        //
        System.out.println(c.bark());   // 6번
    }
}

