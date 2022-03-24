package ch07;

import java.io.IOException;

public class Schedulertest {

	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 할당 방식을 선택하세요");
		System.out.println("R : 한명씩 차례대로 할당");
		System.out.println("S : 쉬고 있거나 대기가 적은 상담원에게 할당");
		System.out.println("P : VIP 전용");
	
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
