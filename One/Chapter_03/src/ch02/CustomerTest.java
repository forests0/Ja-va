package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer choi = new Customer("choi");
		VIPCustomer kim = new VIPCustomer("kim");
		
		System.out.println("1000�� ���� ���� �� �Ϲ� ����� " + choi.calcPrice(1000) + "�� ����");
		System.out.println("1000�� ���� ���� �� VIP�� " + kim.calcPrice(1000) + "�� ����");
		
		choi.showInfo();
		kim.showInfo();
	}

}
