package ch05;

public abstract class Car {
	public void startcar() {
		System.out.println("�극��ũ�� ����ϴ�");
		System.out.println("�õ��� �̴ϴ�");
	}
	public void turnoff() {
		System.out.println("�극��ũ�� ����ϴ�");
		System.out.println("�õ��� ���ϴ�");
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
