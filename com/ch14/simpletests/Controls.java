package com.company.example.ch14.simpletests;

public class Controls {
        public static void main(String[] args) {
            String a = "write once, run anywhere";
            if (a.contains("wife")) {
                System.out.println("wife");
            }else if (a.contains("once") && !a.contains("run")) {
                System.out.println("once");
            }else if (!a.contains("everywhere")) {
                System.out.println("everywhere");
            }else if (a.contains("anywhere")) {
                System.out.println("anywhere");
            }else {
                System.out.println("none");
            }
            int i = 0;
            int sum = 0;
            while(i <= 1000) {
                if(i % 3 == 0) {
                   sum += i;
                }
                i++;
            }
            System.out.println(sum);

        }

}
