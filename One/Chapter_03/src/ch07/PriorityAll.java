package ch07;

public class PriorityAll implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�");
		
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("������ų�� ���� �������� �켱������ �����˴ϴ�");
		
	}

}
