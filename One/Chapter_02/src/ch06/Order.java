package ch06;

public class Order {
	String Onum;
	String Pnum;
	String address;
	String date;
	String time;
	int price;
	String name;
	String Mnum;

	public Order(String Onum, String Pnum, String address, String date, String time, int price, String name, String Mnum) {
		this.Onum = Onum;
		this.Pnum = Pnum;
		this.address = address;
		this.date = date;
		this.time = time;
		this.price = price;
		this.name = name;
		this.Mnum = Mnum;
	}
	public void showOrderInfo() {
		System.out.println("�ֹ� ���� ��ȣ : " + Onum);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + Pnum);
		System.out.println("�ֹ� �� �ּ�: " + address);
		System.out.println("�ֹ� ��¥ : " + date);
		System.out.println("�ֹ� �ð� : " + time);
		System.out.println("�ֹ� ���� : " + price);
		System.out.println("�޴� �̸� : " + name);
		System.out.println("�޴� ��ȣ : " + Mnum);
	}
}
