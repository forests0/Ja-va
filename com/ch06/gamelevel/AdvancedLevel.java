package com.company.example.ch06.gamelevel;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 JUMP 합니다");
    }

    @Override
    public void turn() {
        System.out.println("TURN 할 줄 몰루요");
    }

    @Override
    public void showLevelMessage() {
        System.out.println(" +=+=+ 중급자 입니다 +=+=+");
    }
}
