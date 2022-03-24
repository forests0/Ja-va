package ch02;

public class Customer {
	
	protected static int num = 100;
	protected String name;
	protected int ID;
	protected String grade;
	protected int bonuspoint;
	protected double bonusratio;
	
	
	public Customer (String name) {
		this.name = name;
		this.ID = num++;
		this.grade = "silver";
		this.bonusratio = 0.01;
	}
	
	public int calcPrice(int price) {
		return price - (price * bonuspoint);
	}
	
	public void showInfo() {
		System.out.println("������ ������ " + name + "�̰�, ID�� " + ID + "�̸�, ����� " + grade +"�̰�, ���η��� " + bonuspoint + "�̰�, �������� " + bonusratio +"�Դϴ�.");
	}
}
