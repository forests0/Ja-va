package ch08;

public class StudentTest {

	public static void main(String[] args) {
		Student mrchoi = new Student(1, "mrchoi", 100);
		Student Kim = new Student();
		
		Kim.setNumber(100);
		Kim.setGrade(2);
		Kim.setName("Kim");
		
		System.out.println(Kim.getNumber());
		mrchoi.showStudentInfo();

	}

}