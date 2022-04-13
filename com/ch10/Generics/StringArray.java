package com.company.example.ch10.Generics;

public class StringArray {
    public static void main(String[] args) {
        String[] mynum = new String[]{"2016-08-17","2016-09-17","2016-10-17"};
        String[] mynum2 = new String[]{"2016-08-17","2016-09-17","2016-10-17"};
        System.out.println(mynum2[0]);
        print(mynum);

        mynum = new String[] {"2016-08-17","2016-09-17","2016-10-17","2016-11-17"};
        String[] tos = new String[mynum.length];
        System.arraycopy(mynum,0,tos,0,mynum.length);
        print(tos);

    }
    public static void print(String[] a) {
        for(String ss : a) {
            System.out.println(ss + "\t");

        }
        System.out.println();
    }
}
