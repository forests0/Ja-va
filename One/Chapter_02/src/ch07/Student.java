package ch07;

public class Student {
	String num;
	String name;
	Subject kor;
	Subject math;

	public Student(String num, String name) {
		this.num = num;
		this.name = name;
		math = new Subject();
		kor = new Subject();
	}
	public void showStudentScore() {
		int sum = kor.Score + math.Score;
		System.out.println(num + name + " รัมก : " + sum);
	}
	public void setKScore(String name,int score) {
		kor.Sname = name;
		kor.Score = score;
	}
	
	public void setMScore(String name, int score) {
		math.Sname = name;
		math.Score = score;
	}
}

