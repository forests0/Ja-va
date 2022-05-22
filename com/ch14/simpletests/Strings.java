package com.company.example.ch14.simpletests;
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        //문제3
        String num = "881120-1068234";
        System.out.println(num.substring(0,6));

        //문제4
        String pin = "881120-1068234";
        System.out.println(pin.charAt(7));

        //문제5
        String a = "a:b:c:d";
        System.out.println(a.replace(":", "#"));
    }
}
