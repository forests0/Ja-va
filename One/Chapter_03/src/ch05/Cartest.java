package ch05;

public class Cartest {

	public static void main(String[] args) {
		Car ai = new AICar();
		ai.run();
		
		Car manual = new ManualCar();
		manual.run();
	}

}
