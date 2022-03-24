package ch05;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행을 시작합니다");
		System.out.println("자동차가 스스로 동작을 바꿉니다");
	}

	@Override
	public void stop() {
		System.out.println("자율적으로 주행을 멈춥니다");
		
	}
	
}
