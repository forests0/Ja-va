package ch10;

public class Subway {
	private int number;
	private int people;
	private int money;
	
	public Subway(int number) {
		this.number = number;
	}
	
	public void take(int money) {
		this.money += money;
		this.people++;
	}
	public void showinfo() {
		System.out.println(number + "�� ����ö�� �°����� " + people + "�� �̰�, ���� ���� " + money + "�� �Դϴ�.");
	}
}
