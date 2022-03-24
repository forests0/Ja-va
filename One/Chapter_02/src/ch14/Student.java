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
			System.out.println(name + " 학생의 " + s.getSubname() + " 과목의 점수는 " + s.getSubscore() + " 점 입니다.");
		}
		System.out.println("총 점은 " + sum + " 점 입니다.");
	}
}
