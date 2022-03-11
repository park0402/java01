package Day08_모바일뱅크;

import java.util.Scanner;

public class Member {
	// 1. 필드
	int bankn; //고유번호
	String id; //아이디
	String password; //비밀번호
	String name; //이름 
	String phone; //연락처
	

	
	// 2. 생성자
	
	public Member() {} //2-1 빈생성자
	
	
	public Member(int bankn, String id, String password, String name, String phone) {
		super();
		this.bankn = bankn ; 
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	

	
	
	// 3. 메소드 회원가입/ 로그인/ 아이디 비밀번호찾기 
	
	
//			1. 회원가입 메소드
	boolean 회원가입() {   
		System.out.println( " 회원 가입 페이지 입니다. ");
		System.out.println("아이디: "); String id  = BankApplication.scanner.next();
		System.out.println("비밀번호: "); String password = BankApplication.scanner.next();
		System.out.println("이름: "); String name = BankApplication.scanner.next();
		System.out.println("연락처: "); String phone = BankApplication.scanner.next();
		//scanner 객체가 다른 클래스내 static선언되어있는것을 불러오기
		
		//*아이디 중복체크
		for (Member temp : BankApplication.members ) {
			if(temp != null&& temp.id.equals(id)) {
				//만약에 공백이 아니면서 배열내 id와 입력받은 id와 동일하면 
				System.out.println("알림)) 현재 사용중인 아이디입니다 .");
				return false; //함수종료 -> 아이디가 중복되었기 때문에 함수 종료
			}	
		}		
	
		
			// 회원 번호 자동주입 [가장 최근에 가입한 회원의번호 + 1]
		
			int bankn = 0;
			int j = 0 ;
			for (Member temp : BankApplication.members) {
				if(temp == null ) {
					if( j == 0) {
						bankn =1; break; 
					}
					else { //첫번째 회원이아니면
						bankn = BankApplication.members[j-1].bankn +1 ;
						//null 앞[마지막회원]번호+1
					
						break;
					}
				}		
				j++; //인덱스증가
			}
		 // 4개변수를 객체화 시키기 -> 1개로 
		Member member = new Member( bankn ,id, password, name , phone);
	
		int i = 0;
		for(Member temp : BankApplication.members ) {
			if(temp == null) {//빈공간이면
				BankApplication.members[i] = member;
				System.out.println(" 알림)) 회원님은  " + bankn+ "번째 고객님입니다.");
				return true; //회원가입 메소드 종료~~~~[반환 :true]
			
			}
			i++; //i증가
		
		}
		//4. 가입성공시 true 반환 실패시 false 반환
		return false; //회원 가입 메소드 종료~~~[반환: false]
	
			
	}
	
	
//	로그인 메소드
	
	String 로그인() { 
		System.out.println( "--- 로그인 창--- ");
	// 1. 입력
		System.out.println("아이디: "); String id = BankApplication.scanner.next();
		System.out.println("비밀번호: "); String password = BankApplication.scanner.next();
	// 2. 배열내 객체 id와 password 가 입력한 값과 동일하면
		for(Member temp:BankApplication.members) {
			if(temp != null && temp.id.equals(id)
					&&temp.password.equals(password)) {
				return temp.id;
			}
		}
		
		
		return null; // 실패시 null 
	}
//	아이디 찾기 메소드
	void 아이디찾기 () {System.out.println( " 아이디 찾기 서비스입니다.");
	 System.out.println("이름"); String name = BankApplication.scanner.next();
	 System.out.println("연락처"); String phone = BankApplication.scanner.next();
	 
	 for(Member temp : BankApplication.members) {
		 if(temp != null && temp.name.equals(name)&&temp.phone.equals(phone)) {
			 System.out.println("알림) 회원님의 아이디는 : " + temp.id + "입니다. ");
			 return;
			 
		 }
		 
	 }
	
		
	}
//	비밀번호찾기
	void 비밀번호찾기 () { System.out.println(" 비밀번호 찾기 서비스입니다. ");
		System.out.println("아이디: "); String id = BankApplication.scanner.next();
		System.out.println("비밀번호: "); String phone = BankApplication.scanner.next();
		for(Member temp: BankApplication.members ) {
			if(temp != null && temp.name.equals(id)&&temp.phone.equals(phone)) {
				System.out.println("회원님의 비밀번호는: " + temp.password+ " 입니다 . ");
				return;
			
			}
		
		
		
		}	
		System.out.println(" 알림]] 동일한 회원정보가 없습니다. ");
		
		}
	
	


	
	

	
	

}

	


