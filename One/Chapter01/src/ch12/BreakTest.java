package ch12;

public class BreakTest {
	public static void main(String[] args) {
		int sum = 0;
		int count = 1;
		for(; ; count++) {
			sum += count;
			if(sum >= 100) break;
			
		}
		System.out.println(sum);
		System.out.println(count);
	}
}
