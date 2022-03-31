package com.company.example.ch06.gamelevel;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("정말 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("정말 높이 JUMP 합니다");
    }

    @Override
    public void turn() {
        System.out.println("TURN 합니다, 한바퀴를");
    }

    @Override
    public void showLevelMessage() {
        System.out.println(" +=+=+ 고급자 입니다 +=+=+");
    }
}
