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
		System.out.println("학번은 " + number + "이고, 이름은 " + name + "이고, 학년은 " + grade + "입니다.");
	}
	
}
