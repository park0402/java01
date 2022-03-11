package Day07;

public class Member {
	// 1. 필드
	int mno ;
	String id;
	String password;
	String name;
	String phone;
		//회원번호 아이디 비밀번호 이름 연락처
	
	// 2.생성자 [ 생성자명 == 클래스명 ]
	// 1. 빈생성자[기본생성자] : 메소드호출용 객체생성시
	public Member() { }
	// 2. 모든 필드를 받는 생성자 : 회원가입용 객체생성시
	public Member(int mno, String id, String password, String name, String phone) {
		this.mno = mno;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	
	// 3. 메소드 
// 회원가입 
	boolean 회원가입() {   
		System.out.println( " 회원 가입 페이지 입니다. ");
		System.out.println("아이디: "); String id  = BookApplication.scanner.next();
		System.out.println("비밀번호: "); String password = BookApplication.scanner.next();
		System.out.println("이름: "); String name = BookApplication.scanner.next();
		System.out.println("연락처: "); String phone = BookApplication.scanner.next();
		//scanner 객체가 다른 클래스내 static선언되어있는것을 불러오기
		
		//*아이디 중복체크
		for (Member temp : BookApplication.members ) {
			if(temp != null&& temp.id.equals(id)) {
				//만약에 공백이 아니면서 배열내 id와 입력받은 id와 동일하면 
				System.out.println("알림)) 현재 사용중인 아이디입니다 .");
				return false; //함수종료 -> 아이디가 중복되었기 때문에 함수 종료
			}	
		}		
	
		
			// 회원 번호 자동주입 [가장 최근에 가입한 회원의번호 + 1]
		
			int bno = 0;
			int j = 0 ;
			for (Member temp : BookApplication.members) {
				if(temp == null ) {
					if( j == 0) {
						bno =1; break; 
						
					
					
				}
				
				else {
					
					bno = BookApplication.members[j-1].mno +1 ;
						//null 앞[마지막회원]번호+1
				
					break;
				
				
				}
					
			 }		
				j++;
				
				
			}
		

		
		
		
		
		
		
		//2. 4개변수 -> 객체화 -> 1개
		
		Member member = new Member ( bno, id,password, name , phone);
	
		int i = 0;
		for(Member temp : BookApplication.members ) {
			if(temp == null) {//빈공간이면
				BookApplication.members[i] = member;
		System.out.println(" 알림)) 회원님의 회원번호 : " + bno);
			
				return true; //회원가입 메소드 종료~~~~[반환 :true]
			
			}
			i++; //i증가
		
		}
		
		return false;
	
			//4. 가입성공시 true 반환 실패시 false 반환
	}
	
	
//	로그인 
	String 로그인() { System.out.println( " 로그인 창 ");
		return "아이디";
	}
//	아이디찾기 
	void 아이디찾기 () {System.out.println( " 아이디 찾기 서비스입니다.");
	 System.out.println("이름"); String name = BookApplication.scanner.next();
	 System.out.println("연락처"); String phone = BookApplication.scanner.next();
	 
	 for(Member temp : BookApplication.members) {
		 if(temp != null && temp.name.equals(name)&&temp.phone.equals(phone)) {
			 System.out.println("알림) 회원님의 아이디는 : " + temp.id + "입니다. ");
			 return;
			 
		 }
		 
	 }
	
		
	}
//	비밀번호찾기
	void 비밀번호찾기 () { System.out.println(" 비밀번호 찾기 서비스입니다. ");
		System.out.println("아이디: "); String id = BookApplication.scanner.next();
		System.out.println("비밀번호: "); String phone = BookApplication.scanner.next();
		for(Member temp: BookApplication.members ) {
			if(temp != null && temp.name.equals(id)&&temp.phone.equals(phone)) {
				System.out.println("회원님의 비밀번호는: " + temp.password+ " 입니다 . ");
				return;
			
			}
		
		
		
		}	
		System.out.println(" 알림]] 동일한 회원정보가 없습니다. ");
		
		}
//	회원탈퇴
	void 회원탈퇴(){
		
	}

}
