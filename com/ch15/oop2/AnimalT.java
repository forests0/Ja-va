package com.company.example.ch15.oop2;

interface Predator {
}

class Animal {
}

class Dog extends Animal {
}

class LionextendsAnimal implements Predator {
}

public class AnimalT {
    public static void main(String[] args) {
        Animal a =new Animal();  // 1번
        Animal b =new Dog();  // 2번
        //Animal c =new Lion();  // 3번
        //Lion은 없는데 선언하려고함
        //Dog d =new Animal(); // 4번
        //Dog는 Animal을 상속받는 입장이라서, 부모를 상속할 순 없음
        //Predator e =new Lion(); //5번
        //프레데터는 생성되지 않은 Lion
    }
}

