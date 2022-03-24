package ch14;

public class StudentTest {

	public static void main(String[] args) {
		Student choi = new Student(1107, "choi");
		Student kim = new Student(1217, "Kim");
		
		choi.addSubject("OS",100);
		choi.addSubject("Math", 100);
		
		kim.addSubject("OS",90);
		kim.addSubject("Math", 95);
		kim.addSubject("English", 90);
		
		choi.showInfo();
		kim.showInfo();
	}

}
