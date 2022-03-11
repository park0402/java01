package Day08_모바일뱅크;



import java.util.Scanner;

public class BankApplication {
	

	
	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[1000];
	static Bank[] Bank = new Bank[1000];
	
	
	public static void main(String[] args) { // main s
		
				BankApplication application = new BankApplication();
				application.menu();
				
	} // main end  
	// 1. 초기 메뉴 메소드
	void menu() {
		while( true) { 
			System.out.println("-------------- 모바일뱅크 -------------");
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기 : ");
			int ch = scanner.nextInt();
			Member member = new Member();
			if( ch == 1 ) {
				member.회원가입();// 회원가입 메소드 호출 
				boolean result = member.회원가입();
				
				if(result) System.out.println("알림) 회원가입 상공"); 
				else System.err.println("알림) 회원 가입 실패"); 
			} 
			else if( ch ==2 ) {
				String result = member.로그인(); // 로그인 메소드 호출 
					
				if(result ==null) {
					System.err.println( " 로그인에 실패하였습니다. 회원정보를 확인해주세요 .");
				} else if(result.equals("admin")) {
					System.out.println("알림))은행원 메뉴입니다. "+result+"님"); //은행원 관리자
					adminmenu();
				} else { //고객 메뉴 
					System.out.println("환영합니다"+result+"님!");
					membermenu(result);
				}
			}
			else if( ch ==3 ) {
				member.아이디찾기();// 아이디 찾기 메소드 호출 
			}
			else if( ch ==4 ) {
				member.비밀번호찾기(); // 비밀번호 찾기 메소드 소출 
			}
			else {
				System.err.println(" 알림]] 알수 없는 번호입니다. ");
			} 
		}
	} // menu end 
	
	// 2. 일반회원 메뉴 메소드
	void membermenu( String loginid  ) { // 인수 변수명은 달라도 되지만 자료형 동일 
		while(true) {
			System.out.println(" --------------- 회원 메뉴 ------------------");
			System.out.print("1.계좌생성 2.입금 3.출금 4.계좌이체 5.로그아웃 선택 : ");
			int ch = scanner.nextInt();
			Bank Bank = new Bank(); // 빈생성자로 객체 => 메소드 호출용
			if( ch == 1 ) 		{ Bank.계좌생성(); }
			else if( ch ==2 ) 	{ Bank.입금(); }
			else if( ch == 3 ) 	{ Bank.출금(); }
			else if( ch == 4 ) 	{ Bank.계좌이체(); }
			else if( ch == 5 ) 	{ return; } // 일반회원메뉴 메소드 종료 [ 로그아웃 ] 
			else { System.err.println(" 알림]] 알수 없는 번호입니다. "); }
		}
	} // 일반회원 메뉴 종료 
	// 3. 관리자 메뉴 메소드 
	void adminmenu() {
		while(true) {
			System.out.println(" --------------- 관리자 메뉴 ------------------");
			System.out.print("1.대출상품등록 2.대출상품삭제 3. 대출자 목록4 . 로그아웃 선택 : ");
			int ch = scanner.nextInt();
				Loan Bank = new Loan();
			if( ch == 1 ) 		{ }
			else if( ch == 2 ) 	{ }
			else if( ch == 3 ) 	{ }
			else if( ch == 4 ) 	{ }		// 관리자메뉴 메소드 종료 
			else { System.err.println(" 알림]] 알수 없는 번호입니다. "); }
		}
	}
	
	
} // class end 












