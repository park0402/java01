package Day07;

public class Day07_4 {
	
	// p.229 : 외부 호출
	
	public static void main(String[] args) {
		
		
		// 1. ****객체 선언 ****
		
		Car2 myCar = new Car2();
		
		// 2. 자동차 시동 걸리 
		myCar.keyTurnOn(); //인수 반환x
		
		// 3. 자동차 전진 메소드 호출
		
		myCar.run();
		
		// 4. 스피드 증가 메소드 호출 
		
		int speed= myCar.getSpeed();
		System.out.println("현재속도: " + speed + "km/h");
	}
}
