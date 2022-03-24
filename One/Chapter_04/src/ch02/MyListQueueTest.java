package ch02;

public class MyListQueueTest {

	public static void main(String[] args) {
		MyListQueue qList = new MyListQueue();
		
		qList.enQueue("A");
		qList.enQueue("B");
		qList.enQueue("C");
		qList.enQueue("D");
		qList.enQueue("E");
		
		qList.printAll();
		System.out.println(qList.deQueue() + " 가 삭제되었습니다.");
		qList.printAll();

	}

}
