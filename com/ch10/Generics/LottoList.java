package com.company.example.ch10.Generics;

import java.util.ArrayList;
import java.util.List;

public class LottoList {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            int m = ilist.get(i);
            System.out.println(m + "\t");
        }
        System.out.println();
    }
}
