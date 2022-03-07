package Day05;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Day05_2 { // c s
	// 회원제 방문록 프로그램
		// 1. 초기메뉴 [ 1. 회원 가입 2. 로그인 ]
			// 1. 회원가입 [ 아이디, 비밀번호 , 이름]
			// 2. 로그인 [아이디, 비밀번호 동일하면 로그인처리]
		// 2. 로그인시 메뉴 [1.방문록쓰기 2. 로그아웃 ]
			// 1. 방문록쓰기 [제목, 내용 , 작성자(로그인된아이디)]
			// 2. 로그아웃 [ 초기메뉴로 돌아가기]
	public static void main(String[] args) { // m s
		//준비
		Scanner sc = new Scanner(System.in);
		//회원 100명[id,pw,name] 저장하는 배열
		String[][] memberlist = new String[100][3];
		//방문록 100개[title,contents, writer] 저장하는 배열
		String[][] boardlist = new String[100][3]; // 게시물당 1행
		
		while(true) { //무한루프 [종료조건 : x] //wh s
			System.out.println("--------------회원제 방문록---------------");
			System.out.println("--------------------------------------");
			System.out.println("-1.회원가입 2.로그인 선택:------------------");
			int ch = sc.nextInt();
			if(ch==1) { // if1 s
				System.out.println("------------회원가입 페이지---------");
				System.out.println("ID: "); String id = sc.next();
				System.out.println("Password: "); String pa = sc.next();
				System.out.println("Name: "); String na = sc.next();
				//string 3개 변수를 입력받아 memberlist 2차원 배열에 저장
					// 1. 빈공간[숫자=0, ]을 찾아서 저장 [만약에 빈공간이 없으면 회원 100명 초대]
					// 2. 아이디 중복체크
				//아이디 중복체크
				
				
			for( int i= 0; i<memberlist.length ; i ++) { // if-for s
					//i < memberlist.length 행길이 = 100 
				if(memberlist [1][0] == null) { //i번째행에 id가 없으면 = 빈공간
				
				memberlist[0][0] = id;
				memberlist[0][1] = pa;
				memberlist[0][2] = na;
				System.out.println("알림))) 회원가입이 완료 되었습니다. ");
				break; //저장했으면끝
				
				} //if-for-if d
				
			} // if-for d
				
				
			} //if 1 d
			
			else if (ch==2) { // eif s
				
				System.out.println("---------로그인 페이지---------");
				System.out.println("ID: "); String id = sc.next();
				System.out.println("Password: "); String pa= sc.next();
				
				//배열내 데이터가 입력받은 id와 pass가 동일하면 로그인처리
				
				for(int i =0; i<memberlist.length ; i++ ) {
					if( memberlist[i][0] !=null && memberlist[i][0].equals( id ) &&
							memberlist[i][1].equals(pa) ) 
					{ System.out.println("알림 로그인 성공");//null 은 == 는 가능하지만 equals 는 취급할수없다
					
					
				}// for if ed
					
				} // eif -for ed
				
				
				
			} // eif d
			else {System.out.println("알림)) 알수 없는 선택입니다 .");}
		} // while d
		
	} // m d

} // c d
