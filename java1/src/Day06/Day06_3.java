package Day06;

import java.util.Scanner;


public class Day06_3 { 
	// 회원제 프로그램 [클래스 버젼]
		//0. 회원 설계 => 회원 클래스만들기
			// 1. 필드
				// 1. 아이디 2.비밀번호 3. 이름 4. 전화번호
	
		//1. 초기메뉴 [ 1. 회원가입 2. 로그인 3.아이디/비밀번호 찾기]
			// 1. 회원가입시 입력받아 저장 아이디,비밀번호,이름
			// 2. 로그인시 아이디와 비밀번호가 동일하면 로그인처리
			// 3. 아이디찾기는 이름과 전화번호가 동일하면 아이디 출력
			// 4. 비밀번호 찾기는 아이디와 전화번호가 동일하면 비밀번호 출력
	public static void main(String[] args) {
		//위에 선언하는 이유 : main 메소드 모든곳에서 사용하기 위해
		
		
		Scanner sc = new Scanner(System.in);
		Member[] memberlist = new Member[100]; 
		//Member 클래스로 만들어진 객체 100개를 저장할수 있는 배열을 선언
		
		while(true) { //프로그램 실행 무한루프
			System.out.println("----------회원제[클래스버젼]-----------");
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4. 비밀번호찾기");
			System.out.println("선택: "); int ch = sc.nextInt();
			
			if( ch==1 ) { //회원가입
//				1. 회원 정보 입력받기
				System.out.println("---------회원가입 페이지-------");
				System.out.println("아이디: "); String id = sc.next();
				System.out.println("비밀번호: "); String password = sc.next();
				System.out.println("이름: "); String name = sc.next();
				System.out.println("연락처: "); String phone = sc.next();
//				2. 객체 불러오기 
				Member member = new Member();
//				3. 입력받은 변수 4개를 객체내 저장
				member.id = id;
				member.password = password;
				member.phone = phone;
				member.name = name;
				
				// 아이디 중복체크 1. 배열내 객체중 입력한 아이디와 동일한 아이디 찾기
				boolean idcheck = false;
				for( Member temp : memberlist) {
					if(temp !=null && temp.id.equals(id)) {
						System.out.println("알림 )) 사용중인 아이디입니다. ");
						
						idcheck=true;
						break;
					}
				}
				if(idcheck == false) {
					int i = 0;
					for(Member temp : memberlist) {
						System.out.println("알림)) 사용할수있는 아이디입니다.");
						break;
					}
				}

				
				
				
				
//				4. 여러개 객체를 저장하는 배열에저장
				
				
				// 1. 공백 인덱스찾기
				int i = 0;
				for(Member temp : memberlist ) {
					
					// *memberlist 배열내 member 객체 하나씩 꺼내와서 temp 저장 반복 100번반복하는것임
					// 2. 공백에 인덱스에 객체저장	
					if(temp == null) { //100번반복했는데 그게 null이면 저장
						memberlist[i] = member; // 해당 인덱스에 새로 만들어진 객체 저장
						break;//for 나가기 [안나가면 모든 공백에 동일한 객체 저장되기때문에]
					}
					i++; //인덱스증가
			    
						
				} //for end
				
				
			} //회원 가입 end
			else if ( ch==2) {
//				1. 정보 입력받기.
				System.out.println("----------로그인페이지-----------"); 
				System.out.println("아이디 : "); String loginid = sc.next();
				System.out.println("비밀번호 : "); String loginpassword = sc.next();
				boolean logincheck = false;
//				2.기존배열[회원리스트] 내 입력받은 값과 비교
				for( Member temp: memberlist ) {
					if(temp !=null && 
// 		객체가 null이란건 없다는 뜻이니 객체가 null일때 equals가 불가하니, null이 아닌상태에서만 equals실행
							temp.id.equals(loginid)&&temp.password.equals(loginpassword)) {
						System.out.println("알림)) 로그인 성공");
						logincheck = true;
					}
					
					
				}//for end
				if( logincheck == false ) { // 로그인성공시에는 아래 코드 실행불가 
					System.err.println(" 알림))  회원정보가 없습니다.");
			
				}
			}
			else if ( ch==3) {//아이디 찾기 1. 이름과연락처받기 2. 배열내동일한이름 연락처있는지 확인 3. 동일한객체있으면 해당아이디출력 4.없으면 없다고 출력
				System.out.println("----------아이디찾기 페이지------------");
				System.out.println("이름: "); String name1 = sc.next();
				System.out.println("연락처:"); String number1 = sc.next();
				
				boolean findcheck = false;
				for(Member temp : memberlist ) {
					
					if(temp!=null && temp.name.equals(name1)&& temp.phone.equals(number1)) {
						System.out.println("알림))아이디찾기성공 ");
						System.out.println("회원님의 ID는:" + temp.id+ "입니다.");
						findcheck = true;
						break;
					}
				}
				
				if(findcheck==false) {
					System.out.println("알림)) 입력하신 정보로 가입하신 아이디가 없습니다. ");
				}
			}
			else if ( ch==4) {
				System.out.println(" 회원님의 아이디를 입력해주세요.: "); String id1 = sc.next();
				System.out.println(" 회원님의 전화번호를 입력해주세요.: "); String ph1 = sc.next();
				boolean findcheck =false;
				for(Member temp : memberlist ) {
					if(temp !=null && temp.id.equals(id1)&& temp.phone.equals(ph1)) {
						System.out.println("알림))비밀번호 찾기 성공하였습니다");
						System.out.println("회원님의 비밀번호는: "+temp.password+"입니다.");
						findcheck = true;
						break;
						
					}
				}
				if(findcheck==false) {
					System.out.println("입력한 정보가 맞지않습니다.");
					
				}
				
			}
			
			
			
		}
	}
}
