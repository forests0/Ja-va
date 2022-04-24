package com.company.example.ch12.thread;

import java.util.ArrayList;
//조인(Join)
public class Sample3 extends Thread{
    int seq;
    public Sample3(int seq) {
        this.seq = seq;
    }
    public void run() {
        System.out.println(this.seq + " Thread Start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(this.seq + "Thread End.");
        }
    }
    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            Thread t = new Thread();
            t.start();
            threads.add(t);
        }
        for(int i = 0; i < 10; i++) {
            Thread t = threads.get(i);
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("main end");
    }
}
