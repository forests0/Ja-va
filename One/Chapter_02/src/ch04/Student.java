package ch04;

public class Student {
	int number;
	int grade;
	String name;
	
	public Student() {
		
	}
	
	public Student(int grade, String name, int number) {
		this.grade = grade;
		this.name = name;
		this.number = number;
	}
	
	public void showStudentInfo() {
		System.out.println("�й��� " + number + "�̰�, �̸��� " + name + "�̰�, �г��� " + grade + "�Դϴ�.");
	}
	
}
