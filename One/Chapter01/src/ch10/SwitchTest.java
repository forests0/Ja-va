package ch10;

public class SwitchTest {

	public static void main(String[] args) {
		int month = 9;
		int day = 0;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4: case 6: case 9: case 11:
			day = 3;
			break;
		default:
			System.out.println("입력하신 월은 잘못된 월입니다.");
		}
		System.out.println(month + "월의 총 일수는" + day + "입니다.");
	}

}
