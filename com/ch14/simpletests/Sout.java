package com.company.example.ch14.simpletests;
import java.util.*;

public class Sout {
    public static void main(String[] args) {
        //문제1
        int[] grade = {80,75,55};
        int sum = 0;
        for(int i = 0; i < 3; i++) {
            sum += grade[i];
        }
        sum /= grade.length;
        System.out.println(sum);

        //문제 2
        int hey = 13;
        if(hey % 2 == 1) {
            System.out.println("odd");
        }
        else {
            System.out.println("even");
        }
    }
}
