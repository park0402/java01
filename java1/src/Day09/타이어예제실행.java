package Day09;

public class 타이어예제실행 {
	public static void main(String[] args) {
	
		
	Car mycar = new Car();
	//클래스 내 타이어 객체가 4개 -> mycar 포함
	
	for (int i = 1 ;i<=5;i++) {
		int problemLocation =  mycar.run();  
			
		switch(problemLocation) {
				case 1 :
					System.out.println("앞왼쪽 한국타이어 교체");
					mycar.frontLeftTire = new 한국타이어("앞왼쪽", 15);
						break;
						// 슈퍼 클래스 객체명 = new 서브클래스();
						// 상속을 받으면 가능!!
						//break; swich 탈출
						
				case 2 :
					System.out.println("앞 오른쪽 금호타이어 교체 ");
					mycar.frontRightTire = new 금호타이어("앞오른쪽",13);
					break;
				case 3 :
					System.out.println("뒤왼쪽 한국타이어 교체");
					mycar.backLeftTire = new 한국타이어("뒤 왼쪽", 14);
					break;
				case 4 :
					System.out.println("뒤 오른쪽 금호타이어 교체");
					mycar.backRightTire = new 금호타이어 ("뒤 오른쪽",17);
					break;
			
		}
		
		System.out.println("-------------------------------");
	}
		
		
	}
}
