package ch07;

public class PriorityAll implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다");
		
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("업무스킬이 높은 상담원에게 우선적으로 배정됩니다");
		
	}

}
