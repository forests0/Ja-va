package com.company.example.ch01_class;

class Student {
    static String school = "BSSM";
    private String name;
    private int grade;

}

public class StudentTest {
    public static void main(String[] args) {
        Student choi = new Student();
        Student kim = new Student();
        Student lee = new Student();

        System.out.println(choi.school);
        System.out.println(kim.school);
        System.out.println(lee.school);

        System.out.println(Student.school);
    }

}
