package ch03;

public class MyListStacktest {

	public static void main(String[] args) {
		MyListStack sList = new MyListStack();
		
		sList.push("A");
		sList.push("B");
		sList.push("C");
		
		sList.printAll();
		
		System.out.println(sList.pop() + " pop");
		
		sList.printAll();
	}

}
