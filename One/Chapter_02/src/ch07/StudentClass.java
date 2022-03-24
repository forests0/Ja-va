package ch07;

public class StudentClass {

	public static void main(String[] args) {
		Student choi = new Student("1111", "choi");
		Student Kim = new Student("1234", "Kim");
		
		choi.setKScore("국어", 100);
		choi.setMScore("수학", 100);
		
		Kim.setKScore("국어", 90);
		Kim.setMScore("수학", 100);
		
		choi.showStudentScore();
		Kim.showStudentScore();
	}

}
