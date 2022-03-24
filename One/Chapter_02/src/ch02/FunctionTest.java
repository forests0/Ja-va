package ch02;

public class FunctionTest {

	public static int addNum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void sayHello (String name) {
		System.out.println(name + "님, 안녕하세요!");
	}
	
	public static int calcSum() {
		int res = 0;
		for(int i = 1; i <= 100; i++) {
			res += i;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int sum = 0;
		int num1 = 10;
		int num2 = 20;
		sum = addNum(num1, num2);
		System.out.println(sum);
		
		
		//이름 + 님. 안녕하세요 를 출력하는 함수
		sayHello("mrchoi");
		
		//1 ~ 100의 총합을 반환
		sum = calcSum();
		System.out.println(sum);
	}

}
