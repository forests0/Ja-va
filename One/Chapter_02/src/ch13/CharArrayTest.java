package ch13;

public class CharArrayTest {
	
	public static void main(String[] args) {
		
		
		char [] alp = new char[26];
		for(int i = 0; i < alp.length; i++) {
			alp[i] = (char)(65 + i);
		}
		for(char a : alp) {
			System.out.print(a + " ");
		}
	}
	
}
