package ch06;

public class OrderTest {

	public static void main(String[] args) {
		Order order1 = new Order("202109150003", "01012345678", "부산광역시 강서구 어디어디 123", "20210915", "130258", 18000, "알싸한 마늘치킨", "0003");
		
		order1.showOrderInfo();
	}

}
