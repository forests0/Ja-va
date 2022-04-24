package com.company.example.ch12.thread;

import java.util.ArrayList;
//인터페이스
public class Sample4 extends Thread{
    int seq;
    public Sample4(int seq) {
        this.seq = seq;
    }
    public void run() {
        System.out.println(this.seq + " Thread Start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread End");
        }
    }
    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            Thread t = new Thread(new Sample4(i));
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
