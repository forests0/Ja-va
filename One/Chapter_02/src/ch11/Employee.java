package ch11;

public class Employee {
	
	static int number = 1000;
	private String name;
	private int emnum;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmnum() {
		return emnum;
	}

	public void setEmnum() {
		emnum = number;
		number++;
	}

	public Employee(String name) {
		this.name = name;

	}
	public void showinfo() {
		System.out.println(name + "님의 사번은 " + emnum + "번 입니다.");
	}
}
