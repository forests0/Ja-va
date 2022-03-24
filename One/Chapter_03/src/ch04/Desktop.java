package ch04;

public class Desktop extends Computer{

	@Override
	protected void display() {
		System.out.println("Desktop display");
		
	}

	@Override
	protected void typing() {
		System.out.println("Desktop typing");
	}
	
}
