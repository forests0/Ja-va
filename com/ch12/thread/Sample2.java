package com.company.example.ch12.thread;

public class Sample2 extends Thread{
    int seq;
    public Sample2(int seq) {
        this.seq = seq;
    }
    public void run() {
        System.out.println(this.seq + " Thread Start.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(this.seq + " Thread End.");
        }
    }
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            Thread t = new Sample2(i);
            t.start();
        }
        System.out.println("Main End");
    }
}
