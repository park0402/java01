package Day09;

import java.util.Scanner;


public class 은행계좌프로그램_상속 {
	//은행 계좌 프로그램 [상속]
		//국민은행 , 신한은행, 하나은행
	// 주 기능: 1.계좌 생성 2. 입금 3. 출금 4. 이체 5. 내 계좌 목록
	//**  main 밖에서 선언하는 이유
	// 모든 클래스에서 사용하기 위해 static 배열로 선언
	// static 변수는 프로그램 시작시 메모리 할당 -> 프로그램 종료시 메모리 초기화 
	//
	public static 은행[] 계좌리스트 = new 은행[100];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------계좌시스템------");
			System.out.println("1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 계좌목록 6. 대출");
			int 선택 = sc.nextInt();
			
			은행컨트롤러 컨트롤 = new 은행컨트롤러(); //컨트롤러 메소드 호출용 객체
			if(선택 == 1) {
				//입력
				System.out.println("+++ 계좌등록 페이지+++");
				System.out.println("비밀번호:"); String 비밀번호 = sc.next();
				System.out.println("계좌주"); String 계좌주 = sc.next();
				System.out.println("은행선택 : 1. 국민 2. 신한 3. 하나"); 
				int 은행번호 = sc.nextInt();
				//컨트롤러 연결
			String 계좌번호 = 컨트롤.계좌생성(비밀번호, 계좌주, 은행번호);
				//메소드 반환 저장 =계좌번호 혹은 null
				//메소드 실행 후 메세지 출력
			if(계좌번호 !=null) {///계좌번호가 null  아니면
				System.out.println("계좌 생성");
				System.out.println("고객님의 계좌번호"+ 계좌번호);
			}else {
				System.out.println("계좌등록 실패");
			}
			
			}else if(선택 ==2) {
				System.out.println("+++입금 페이지+++");
				}
			else if(선택 ==3) {
				System.out.println("+++출금 페이지+++");
			
				}
			else if(선택 ==4) {
				System.out.println("+++이체 페이지+++");
				}
			else if(선택 ==5) {
				System.out.println("+++계좌목록 페이지+++");
				System.out.println("계좌주: "); String 계좌주 = sc.next();
				 컨트롤.계좌목록(계좌주);
				}
			else if (선택 ==6 ) {
				System.out.println("+++대출 페이지+++");
				}
			else {
				System.out.println("알림))알수없는 번호입니다.");
			}
			
				
			
		}	
	}
}
