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
		System.out.println(address + "���� �������� ���� �⸧�� " + gasA + "���� �̰�, ���� ���� " + money + "�� �Դϴ�.");
	}
}
