package com.company.example.ch01_class;

class Student2 {
    private String name;
    private int grade;

    public Student2(String name) {
        this.name = name;

    }
    public Student2(String name, int grade) {
//        this.name = name;
        this(name);
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }
}

public class StudentExam {
    public static void main(String[] args) {
        Student2 choi = new Student2("choi");
        choi.setGrade(2);
        Student2 kim = new Student2("kim", 1);

        System.out.println("학생의 이름은 " + choi.getName()+ "이고, 학년은 " + choi.getGrade() + "학년 입니다.");
        System.out.println("학생의 이름은 " + kim.getName()+ "이고, 학년은 " + kim.getGrade() + "학년 입니다.");
    }
}
