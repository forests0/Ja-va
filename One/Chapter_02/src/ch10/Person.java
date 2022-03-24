package ch10;

public class Person {
	private String name;
	private int money;
	
	public Person(String name,  int money) {
		this.name = name;
		this.money = money;
	}
	public void takebus(Bus bus) {
		bus.take(200);
		money -= 200;
	}
	
	public void takesub(Subway subway) {
		subway.take(1300);
		money -= 1300;
	}
	
	public void takecar(Car car, GasStation gasstation) {
		money -= car.take(gasstation);
	}
	
	public void showinfo() {
		System.out.println(name + "���� ���� �ܾ��� " + money + "�� �Դϴ�");
	}
}
