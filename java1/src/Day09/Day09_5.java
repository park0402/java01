package Day09;

public class Day09_5 {
	
	public static void main(String[] args) {
		//1. 객체 생성 [자동차 1대 생성]
		Car mycar = new Car();
			//클래스 내 타이어객체가 4-> myCar포함
		
		//2. 메소드호출
		for(int i = 1 ; i<=5 ; i++) {
			mycar.run();
		}
	}

}
