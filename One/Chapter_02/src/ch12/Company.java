package ch12;

public class Company {

	private static Company instance = new Company();
	
	public static Company getCompany() {
		return instance;
	}
}
