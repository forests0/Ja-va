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
		System.out.println("Ű�� " + height + "�̰� �����԰� " + weight + "kg�� " + gender + "�� �ֽ��ϴ�. �̸��� " + name + "�̰� ���̴� " + age + "���Դϴ�.");
	}
}
