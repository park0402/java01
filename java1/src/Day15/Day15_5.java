package Day15;

public class Day15_5 {
	public static void main(String[] args) {
		// p591 동기화 
		
		
		// 1. 계산기 객체생성
		 Calculator 계산기 = new Calculator();
		 
		 //사람두명이 동일한 계산기를 쓰는 상황설정
		// 2.  use1 객체생성
		 User1 user1 = new User1();
		// 계산기 객체를 user1 설정[대입]
		 user1.setCalculator(계산기);
		 user1.start();
		 
		// 3.  use2 객체생성
		 User2 user2 = new User2();
		 // 계산기 객체를 user2 설정[대입]
		 user2.setCalculator(계산기);
		 user2.start();
	}

}
