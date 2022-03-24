package ch10;

public class Car {
	private String name;
	
	public Car (String name) {
		this.name = name;
	}
	public int take(GasStation gasstation) {
		return gasstation.oiling(3);
	}
}
