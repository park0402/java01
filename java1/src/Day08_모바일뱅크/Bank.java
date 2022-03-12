package Day08_모바일뱅크;

public class Bank {
	// 1. 필드
	private String 계좌번호; // 계좌번호 
	private	String 소유주; //계좌 소유주
	private int	잔액; // 잔액
	private int  비번; //비밀번호

	
	//2. 생성자
	
	public Bank() {}
	public Bank(String 계좌번호, String 소유주, int 잔액, int 비번) {

		this.계좌번호=계좌번호;
		this.소유주=소유주;
		this.잔액=잔액;
		this.비번=비번;
		
	}
	
	public Bank(String 계좌번호, int 비번, String 소유주 ) {
		this.계좌번호=계좌번호;
		this.소유주=소유주;
		this.잔액=0;
		this.비번=비번;
		
	}
	

	//3. 메소드  
	
	
	
	
	// 계좌생성    
	public void 계좌생성 (){
		System.out.println("계좌 등록 화면");
		System.out.println("계좌번호를 입력해주세요 : ");
		   String 계좌번호 = BankApplication.scanner.next();
		   System.out.println("계좌비밀번호를 입력해주세요: ");
		   int 비번 = BankApplication.scanner.nextInt();
		   System.out.println("계좌소유주명을 입력해주세요: "); 
		   String 소유주 = BankApplication.scanner.next();
		   
		   Bank Bank = new Bank(계좌번호,비번,소유주); //소유주와 비번 바꿧을때 실행안되는이유 ? String Int ?
		   
		   BankApplication.계좌목록.add(Bank);
		   
		
		
	}
	
	
	
	
	
	//	입금
	
	public void 입금() {
		System.out.println("입금 화면입니다. ");
		 System.out.println( "계좌번호 :  ");
		  String 계좌번호 = BankApplication.scanner.next();
		 System.out.println("비밀번호: ");
		  int 비번 = BankApplication.scanner.nextInt();
		 System.out.println("입금액");
		 int 입금액= BankApplication.scanner.nextInt();
		 
		 for( Bank temp : BankApplication.계좌목록) {
			 if(temp.get계좌번호().equals(계좌번호)&& temp.get비번() == 비번 ) {
				 temp.입금처리(입금액);
				   return;
			 }
		 }	 
		 
		 System.out.println("실패)) 계좌번호 혹은 비밀번호가 다릅니다 .");
	}
	
	
	public String get계좌번호() {
		return this.계좌번호;
	}
	
	public int get비번() {
		return this.비번;
	}
	
	public void 입금처리( int 입금액 ) {
		this.잔액 += 입금액;
		System.err.println("\n[[[ [완료] 입금처리가 되었습니다  ]]]");
	}

	
	
	
	//	출금
	
	public void 출금() {}
	
	
	
	
	//	계좌이체
	
	public void 계좌이체() {}
	
	
	
	
	
	
	
	
	
	
	
}
