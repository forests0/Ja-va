package ch02;

public class VIPCustomer extends Customer{

	private double saleratio;
	public VIPCustomer(String name) {
		super(name);
		super.name = name;
		super.grade = "gold";
		super.bonusratio = 0.05;
		super.ID = super.num++;
		this.saleratio = 0.1;
	}
	@Override
	public int calcPrice(int price) {
		return (int) (price - (price * saleratio));
	}
	
}
