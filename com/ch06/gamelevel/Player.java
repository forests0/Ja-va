package com.company.example.ch06.gamelevel;

public class Player {
    private PlayerLevel level;
    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }
    public void UpgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();

    }
    public void play(int count) {
        level.go(count);
    }
}
