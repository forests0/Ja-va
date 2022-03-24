package ch04;

public class Student {
	private String name;
	private int number;
	
	public Student(int number, String name) {
		this.name = name;
		this.number = number;
	}
	
	public void showInfo() {
		System.out.println("학번 :" + number + ", 이름 : " + name);
	}
	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
}
