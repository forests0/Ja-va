package ch01;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person choi = new Person("choi", "gangseogu");
		Tiger bat = new Tiger("bat", "gangseogu");
		
		choi.walk("�� ��");
		choi.showInfo();
		choi.drive();
		
		bat.walk("�� ��");
		bat.showInfo();
		bat.hunt();
		
	}

}
