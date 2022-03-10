package Day07;

public class Day07_2 {
	
	public static void main(String[] args) {
		
		//p.223~22 
		
		
		// 1. 객체 선언 [빈생성자=기본생성자]
		Car mycar = new Car();
		
		// 2. 메소드 호출 [인수1개=5]
/*1번방법*/ mycar.setGas(5); /*2번 방법 mycar.gas = 5;*/ 
        // 똑같음 1번 2번방법 다사용가능 한바퀴 메소드 통해서 저장하는 이유는 보안때문
		

		// 3. 메소드 호출 [ 인수x바환=true 혹은 false]
		if(mycar.isLeftGas() ) {
			
			System.out.println("출발 합니다. ");
		// 4. 메소드 호출
			mycar.run();
		}
		
		//5. 메소드 호출
		
		if(mycar.isLeftGas()) { //Car isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다. ");
		} else {
			System.out.println("gas를 주입하세요. ");
		}





	}

}
