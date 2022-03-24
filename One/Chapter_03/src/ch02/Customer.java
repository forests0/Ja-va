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
		System.out.println("고객님의 성함은 " + name + "이고, ID는 " + ID + "이며, 등급은 " + grade +"이고, 할인률은 " + bonuspoint + "이고, 적립률은 " + bonusratio +"입니다.");
	}
}
