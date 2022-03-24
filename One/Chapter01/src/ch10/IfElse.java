package ch10;

public class IfElse {
	public static void main(String[] args) {
		int age = 17;
		int charge;
		
		if(age < 8) {
			System.out.println("미취학 아동입니다");
			charge = 200;
		}
		else if(age < 14) {
			System.out.println("초딩입니다.");
			charge = 400;
		}
		else if(age < 20) {
			System.out.println("중고딩입니다");
			charge = 900;
		}
		else {
			System.out.println("성인입니다");
			charge = 1300;
		}
		System.out.println("요금은 " + charge + "원 입니다.");
	}
}
