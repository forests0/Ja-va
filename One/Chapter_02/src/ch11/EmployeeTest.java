package ch11;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee choi = new Employee("choi");
		Employee Kim = new Employee("kim");
		
		
		choi.setEmnum();
		Kim.setEmnum();
		
		choi.showinfo();
		Kim.showinfo();
		
		
	}

}
