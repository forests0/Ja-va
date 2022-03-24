package ch12;

public class ContinueTest {

	public static void main(String[] args) {
		int count = 1;
		for(; count <= 100; count++) {
			if(count % 3 == 0) {
				System.out.println(count);
			}
		}

	}

}
