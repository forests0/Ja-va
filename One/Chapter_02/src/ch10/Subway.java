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
		System.out.println(number + "번 지하철의 승객수는 " + people + "명 이고, 남은 돈은 " + money + "원 입니다.");
	}
}
