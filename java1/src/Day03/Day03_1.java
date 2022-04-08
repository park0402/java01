package Day03;

public class Day03_1 { // c s
	public static void main(String[] args) { // m s
		
	
		
		// 1일차 : 출력, 입력
		// 2일차 : 저장, 계산(연산)
		// 제어문
			// 컴퓨터의 판단력을 설정
			// 형태 
				// if(조건) 실행문; *조건문이 true이면 실행
		// if-else 경우의수 2가지 이상 갈래가 있을 때 사용 흐름도를 작성하기. 
		// 1-1. 흐름도 작성 1000원주고 편의점 콜라사오기 시켰다 상황 설정 
		// 1-2. A편의점 콜라X, B편의점 콜라 1200원 , C편의점 콜라 1000원
		
		
		// if( A편의점 == 콜라 && 콜라가격 <= 1000 ) { 구매 }
		// else if( B편의점 == 콜라 && 콜라가격 <= 1000 ) { 구매 }
		// else if( C편의점 == 콜라 && 콜라가격 <= 1000 ) { 구매 }
		// else { 복귀 }
		
	// 예제 1
		if(3>1) System.out.println("예) 3이 1보다 크다. ");
		// 만약에 3이 1보다 크면 출력 아니면 출력x
		if(3>5) System.out.println("예) 3이 5보다 크다. ");
		//만약에 3이 5보다 크면 출력o 아니면 출력x
		
	// 예제 2 
		if(3>1) System.out.println("예2_1) 3이 1보다 크다.");
		else System.out.println("예2_2) 3이 1보다 작다. ");
			//3이 1보다 크면(if) 예3_1 출력 아니면(else) 3_2 출력
	// 예제 3
		if(3>2) {//if s 
			System.out.println("true이면 실행되는자리");
			System.out.println("3이 2보다크다.");}// if e
		// 실행문이 2개이상일때 표시해두자.
		else { //ifs
	// 예제 4
		if(3>5) System.out.println("예4) 3이 5보다 크다.");
		else if(3>4) System.out.println("예4) 3이 4보다크다.");
		else if(3>3) System.out.println("예4) 3이 3보다크다.");
		else if(3>2) System.out.println("예4) 3이 2보다크다.");
		else System.out.println("true 없다.");
		
		if(3>5) System.out.println("예4) 3이 5보다 크다.");
		if(3>4) System.out.println("예4) 3이 4보다크다.");
		if(3>3) System.out.println("예4) 3이 3보다크다.");
		if(3>2) System.out.println("예4) 3이 2보다크다.");
		if(3<2) System.out.println("true 없다.");
		/* if코드보다 else 코드가 더 효율성있다 : else 코드는 상위 if코드와
		하나로 취급하지만 if코드는 전부 검사해보기 떄문에 데이터를 더 잡아먹는다.
		*/
		} //if e 
		
		
		// 형태 
		// 1.  IF( 조건식[true/false] ) 실행문;
		// 2.  IF( 조건식 ) 실행문[참];
		//     ELSE 실행문[거짓];
		// 3.  실행문이 2줄 이상( ; 2개 이상이면 )  {   } 묶음처리 
		// 4.  경우의수 다수일때 [ 조건이 다수일때 ]
		//	   IF( 조건1 ) { 실행문[참1]; }
		//	   ELSE IF( 조건2 ) { 실행문[참2]; }
		//	   ELSE IF( 조건3 ) { 실행문[참3]; }
		//	   ELSE IF( 조건4 ) { 실행문[참4]; }
		//	   ELSE IF( 조건5 ) { 실행문[참5]; }
		//     ELSE { 실행문[거짓]; }
		// 5. if 중첩
		//		IF( 조건식 ) { 
		//			IF( 조건식 ){ 실행문; }
		//			ELSE { 실행문; } 
		//		}ELSE{
		//			IF( 조건식 ){ 실행문; }
		//			ELSE { 실행문; }
		//		}
			
		
		
	}// m d 

} // c d
