package ch10;

public class IfElse {
	public static void main(String[] args) {
		int age = 17;
		int charge;
		
		if(age < 8) {
			System.out.println("������ �Ƶ��Դϴ�");
			charge = 200;
		}
		else if(age < 14) {
			System.out.println("�ʵ��Դϴ�.");
			charge = 400;
		}
		else if(age < 20) {
			System.out.println("�߰���Դϴ�");
			charge = 900;
		}
		else {
			System.out.println("�����Դϴ�");
			charge = 1300;
		}
		System.out.println("����� " + charge + "�� �Դϴ�.");
	}
}
