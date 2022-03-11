package Day07;

public class Calculator2 {
		//클래스 생성
	
	
	// 1. 필드
	
	
	// 2. 생성자
	
	
	
	// 3. 메소드

	
			//	1. 실행메소드 
	void execute() { 
		
		double result = avg( 7, 10);
				
				
				
				
	}
	
	
	
			//	2. 평균메소드 
	
	
	double avg(int x , int y) {
		double sum = plus( x,y );
		double result = sum/2 ; return result;
		
	}
	
	
	
		
			//	3. 더하기 메소드 
	
	int plus (int x , int y) {
		int result = x+y ; return result;
	}
	
	
	
			//	4. 결과출력메소드
	
	void println( String message ) {
		
		System.out.println(message);
	}
	
}
