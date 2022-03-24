package ch01;

public class Person extends Mammalia{
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void drive() {
		System.out.println(name + "은 지금 운전중 입니다.");
	}
}
