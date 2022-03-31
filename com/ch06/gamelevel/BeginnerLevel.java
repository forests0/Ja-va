package com.company.example.ch06.gamelevel;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("JUMP 할 줄 몰루요");
    }

    @Override
    public void turn() {
        System.out.println("TURN 할 줄 몰루요");
    }

    @Override
    public void showLevelMessage() {
        System.out.println(" +=+=+ 초보차 입니다 +=+=+");
    }
}
