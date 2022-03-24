package ch05;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("기어봉을 P -> D 로 바꿉니다");
		System.out.println("엑셀을 밟습니다");
		System.out.println("핸들을 조향합니다");
	}

	@Override
	public void stop() {
		System.out.println("브레이크를 밟습니다");
		System.out.println("기어봉을 D -> P 로 바꿉니다");
		System.out.println("사이드브레이크를 겁니다");
		System.out.println("시동을 끕니다");
	}	
	public void run() {
		drive();
		stop();
	};
	
}
