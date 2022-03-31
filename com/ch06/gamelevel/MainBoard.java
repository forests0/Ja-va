package com.company.example.ch06.gamelevel;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        AdvancedLevel alevel = new AdvancedLevel();
        player.UpgradeLevel(alevel);
        player.play(2);

        SuperLevel slevel = new SuperLevel();
        player.UpgradeLevel(slevel);
        player.play(3);
    }
}
