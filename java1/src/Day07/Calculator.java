package Day07;

public class Calculator {
	
	// 1. 필드
	
	
	// 2. 생성자
	
	
	// 3. 메소드
	void powerOn() { //1. 인수x 반환x
		System.out.println("전원을 켭니다.");
		//  return; 함수종료
		// System.out.println("전원을 켭니다.");
	} 
	//1. void : 리턴타입 
		//void : 결과값을 제공하지 않는 함수 void 뜻 : 무효의 
			//return ; 생략가능 why? void는 결과값이없어서 [ 단, 실행부 중간에 사용시 함수종료]
	//2. powerOn : 메소드이름[아무거나]
	//3. (매개변수[인수]) : 함수로 들어오는 데이터
	//4. {실행코드} : 함수 실행부
	
	int plus( int x, int y) {
		
		int result = x+y;
		return result;
		
	// 1. int : 리턴타입 // 함수가 종료되면서 int형 데이터가 반환
		// 5. return 반환값;
			//리턴타입이 int 이기때문에 return 에는 무조건 int형 데이터
		
	// 2. plus : 메소드이름 [아무거나]
	// 3. (int x , int y) : int형 2개 매개변수 받기
		// 함수호출시 함수로 들어오는 x와 y는 int 형으로 받기
	// 4. {실행부}
	}
	
	double divide ( int x , int y) { // 인수 o 반환 x 
// 리턴타입   메소드명 ( 인수1번 ,  인수2번) { 실행코드 ; return 실수데이터		
		
		double result = (double)x / (double)y;
			//(자료형) 변수명) : 강제형변환
				// int형변수 -> double 변경나누기시 소수점이 있을 수 있기 때문에
		return result; //결과값 ------> 메소드 호출했던 곳으로 이동
		
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
}
