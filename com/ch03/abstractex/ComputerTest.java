package com.company.example.ch03.abstractex;

public class ComputerTest {
    public static void main(String[] args) {
        //Computer c1 = new Computer();
        Computer c2 = new Desktop();
        //Computer c3 = new NoteBook();
        Computer c4 = new MynoteBook();

        c2.turnoff();
        c4.display();
    }
}
