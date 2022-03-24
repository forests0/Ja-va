package ch01;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person choi = new Person("choi", "gangseogu");
		Tiger bat = new Tiger("bat", "gangseogu");
		
		choi.walk("두 발");
		choi.showInfo();
		choi.drive();
		
		bat.walk("네 발");
		bat.showInfo();
		bat.hunt();
		
	}

}
