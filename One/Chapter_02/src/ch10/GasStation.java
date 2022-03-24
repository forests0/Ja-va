package ch10;

public class GasStation {
	private int money;
	private String address;
	private int gasA;
	
	public GasStation(String address) {
		this.address = address;
		gasA = 10;
	}
	public int oiling (int liter) {
		this.gasA -= liter;
		this.money += liter * 6000;
		return liter * 6000;
	}
	public void showinfo() {
		System.out.println(address + "지역 주유소의 남은 기름은 " + gasA + "리터 이고, 남은 돈은 " + money + "원 입니다.");
	}
}
