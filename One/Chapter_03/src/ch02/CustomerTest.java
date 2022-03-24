package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer choi = new Customer("choi");
		VIPCustomer kim = new VIPCustomer("kim");
		
		System.out.println("1000원 물건 구입 후 일반 등급은 " + choi.calcPrice(1000) + "원 지불");
		System.out.println("1000원 물건 구입 후 VIP는 " + kim.calcPrice(1000) + "원 지불");
		
		choi.showInfo();
		kim.showInfo();
	}

}
