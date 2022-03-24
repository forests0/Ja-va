package ch14;

import java.util.ArrayList;

public class Student {
	private int num;
	private String name;
	private ArrayList<Subject> subjects;
	
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
		
		subjects = new ArrayList();
	}
	
	public void addSubject(String subname, int subscore) {
		Subject subject = new Subject(subname, subscore);
		subjects.add(subject);
	}
	public void showInfo() {
		int sum = 0;
		for(Subject s : subjects) {
			sum += s.getSubscore();
			System.out.println(name + " �л��� " + s.getSubname() + " ������ ������ " + s.getSubscore() + " �� �Դϴ�.");
		}
		System.out.println("�� ���� " + sum + " �� �Դϴ�.");
	}
}
