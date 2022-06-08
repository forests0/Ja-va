package com.company.example.ch15.oop2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayT {
    public static void main(String[] args) {
        ArrayList<Integer> a =new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());

    }
}
