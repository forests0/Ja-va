package ch04;

public class StudentTest {

	public static void main(String[] args) {
		Student mrchoi = new Student(1, "mrchoi", 100);
		Student Kim = new Student();
		
		Kim.grade = 2;
		Kim.name = "Hey";
		Kim.number = 20;
		/*
		mrchoi.grade = 1;
		mrchoi.name = "mrchoi";
		mrchoi.number = 30;
		*/
		mrchoi.showStudentInfo();
		Kim.showStudentInfo();
	}

}
