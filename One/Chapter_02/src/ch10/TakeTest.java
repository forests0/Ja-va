package ch10;

public class TakeTest {

	public static void main(String[] args) {
		Person p1 = new Person("yMrchoi", 5000);
		Person p2 = new Person("tMrchoi", 20000);
		
		Subway brown = new Subway(3);
		Bus bus72 = new Bus("7-2");
		Car mycar = new Car("mycar");
		GasStation suyeong = new GasStation("suyeong");
		p1.takesub(brown);
		p1.takebus(bus72);
		
		p2.takecar(mycar, suyeong);
		
		p1.showinfo();
		p2.showinfo();
		System.out.println("===================================================");
		brown.showinfo();
		bus72.showinfo();
		suyeong.showinfo();
	}

}
