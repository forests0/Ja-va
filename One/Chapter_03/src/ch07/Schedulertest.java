package ch07;

import java.io.IOException;

public class Schedulertest {

	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���");
		System.out.println("R : �Ѹ� ���ʴ�� �Ҵ�");
		System.out.println("S : ���� �ְų� ��Ⱑ ���� �������� �Ҵ�");
		System.out.println("P : VIP ����");
	
		int ch = System.in.read();
		Scheduler scheduler = null;
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'S' || ch == 's') {
			scheduler = new Shortestjob();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAll();
		}
		
		
		scheduler.getNextCall();
		scheduler.sendCalltoAgent();
	}
}
