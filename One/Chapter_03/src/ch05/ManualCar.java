package ch05;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("������ P -> D �� �ٲߴϴ�");
		System.out.println("������ ����ϴ�");
		System.out.println("�ڵ��� �����մϴ�");
	}

	@Override
	public void stop() {
		System.out.println("�극��ũ�� ����ϴ�");
		System.out.println("������ D -> P �� �ٲߴϴ�");
		System.out.println("���̵�극��ũ�� �̴ϴ�");
		System.out.println("�õ��� ���ϴ�");
	}	
	public void run() {
		drive();
		stop();
	};
	
}
