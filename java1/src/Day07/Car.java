package Day07;

public class Car {
	//클래스 선언
	
	//1. 필드
	
	int gas; // 가스변수
	
	//2. 생성자
	
		// 생성자 없으면 기본 생성자
	
	
	//3. 메소드
	 	// 1. gas를 외부로부터 받아서 내부에 gas 저장하는 메소드 역할
	
	void setGas( int gas) { //인수o 반환x
//	리턴x 메소드명(인수1) 	  { 내부변수=외부변수}
		this.gas = gas;
//		내부변수와 외부변수와 이름이 동일할때 구별하는 방법
		//this.필드명 : 내부 ( 현재 쓰고있는 클래스 파일) 변수를 사용할수있음
	}
		// 2. 내부변수 gas에 데이터확인 [0=가스없다 false // 1<= 가스있다 true]
	boolean isLeftGas() { //인수x 반환o
//		논리반환 메소드명()
		if( gas ==0 ) {
			System.out.println("gas가 없습니다. ");
			return false; // 내부변수에 gas가 0이면 false반환 
			
		}
		else {
			System.out.println("gas가 있습니다 ");
			return true;
		}
		
		
	}
	
	
	void run() {
		while(true) {
			if(gas > 0 ) { 
				System.out.println("(달립니다" + gas +")");
				gas--;
			}
			else {
				System.out.println("멈춥니다( gas잔량: "+ gas + ")" );
				return;
			}
			
					
			
			
		}
	}

}
