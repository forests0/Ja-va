package ch06;

public class ComputerCalc extends Calculator{

	@Override
	public int times(int n1, int n2) {
		return n1 * n2;
	}

	@Override
	public int divide(int n1, int n2) {
		return n1 / n2;
	}

}
