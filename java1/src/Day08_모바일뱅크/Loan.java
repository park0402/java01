package Day08_모바일뱅크;

import java.util.Scanner;


public class Loan {
	
	// 1. 필드
	private double 이자; 
	private int 원금; 
	private int 빌린금액; 
	private String 대출상품명;	
	private String id ;
	private String 상환여부;
	//2. 생성자
	 public Loan() {}
	 
	public Loan(double 이자, int 원금, int 빌린금액, String 대출상환일, String 대출상환액, String id,String 상환여부) {
		
		this.이자 = 이자;
		this.원금 = 원금;
		this.빌린금액 = 빌린금액;	
		this.대출상품명 = 대출상품명;
		this.id = id;
		this.상환여부 = 상환여부;
		
		}

	
	

	
		
	
	// 3. 메소드 
	
	void 대출상품등록(){
		System.out.println("대출상품 등록페이지");
		System.out.println("대출상품명: "); String 대출상품명 = BankApplication.scanner.next();
		System.out.println("대출이자설정: "); double 이자 = BankApplication.scanner.nextDouble();
		
	}

	void 대출신청() {System.out.println("대출신청페이지 ");}
	void 상환여부() {System.out.println("대출상환여부확인 ");}
	
	
}
