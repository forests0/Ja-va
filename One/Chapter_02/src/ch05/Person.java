package ch05;

public class Person {
	int height;
	int weight;
	String gender;
	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(int height, int weight, String gender, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	public void ShowPerson() {
		System.out.println("키는 " + height + "이고 몸무게가 " + weight + "kg인 " + gender + "이 있습니다. 이름은 " + name + "이고 나이는 " + age + "세입니다.");
	}
}
