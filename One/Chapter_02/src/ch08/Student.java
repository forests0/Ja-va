package ch08;

public class Student {
	private int number;
	private int grade;
	private String name;
	
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
	
	public void setNumber(int number) {
		this.number = number;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}

	public int getGrade() {
		return grade;
	}

	public String getName() {
		return name;
	}
	
}
