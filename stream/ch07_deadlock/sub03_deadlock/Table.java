package stream.ch07_deadlock.sub03_deadlock;

import java.util.ArrayList;

public class Table {
    public static ArrayList<Fork> forks = new ArrayList<>();

    static {
        forks.add(new Fork());
        forks.add(new Fork());
        forks.add(new Fork());
        forks.add(new Fork());
    }
}
