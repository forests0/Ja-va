package ch07;

public class Shortestjob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�");
		
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("���� �ִ� ���� �Ǵ� ��⿭�� ���� �������� �����մϴ�");
		
	}

}
