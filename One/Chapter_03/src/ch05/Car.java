package ch05;

public abstract class Car {
	public void startcar() {
		System.out.println("브레이크를 밟습니다");
		System.out.println("시동을 겁니다");
	}
	public void turnoff() {
		System.out.println("브레이크를 밟습니다");
		System.out.println("시동을 끕니다");
	}
	public abstract void drive();
	public abstract void stop();
	
	public void run() {
		startcar();
		drive();
		stop();
		turnoff();
	}
}
