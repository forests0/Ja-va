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
		System.out.println("주문 접속 번호 : " + Onum);
		System.out.println("주문 핸드폰 번호 : " + Pnum);
		System.out.println("주문 집 주소: " + address);
		System.out.println("주문 날짜 : " + date);
		System.out.println("주문 시간 : " + time);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 이름 : " + name);
		System.out.println("메뉴 번호 : " + Mnum);
	}
}
