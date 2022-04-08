package Day05;

import java.util.Scanner;

public class Day05_도서대여프로그램 { // c s
	public static void main(String[] args) { // m s
		Scanner sc = new Scanner(System.in);
		//회원 100명[id,pw] 저장하는 배열
		String[][] memberlist = new String[100][3];
		//도서 100권[도서명,대여여부(대여가능,대여중),대여인(로그인시아이디)] 저장하는 배열
		String[][] boardlist = new String[100][3]; // 도서목록당 1행
		
		
		
		while(true) { //wh s
			System.out.println("도서 대출 프로그램---------------");
			System.out.println("----------------------------");
			System.out.println("1.회원가입 2.로그인 선택:---------");
			int ch = sc.nextInt();
			
			if(ch==1) { // if1 s
				System.out.println("------------회원가입 페이지---------");
				System.out.println("ID: "); String id = sc.next();
				System.out.println("Password: "); String pa = sc.next();
				System.out.println("Name: "); String na = sc.next();
				
		
			boolean idcheck = true; 
			
			for( int i = 0 ; i<memberlist.length ; i++ ) {  
				if( memberlist[i][0] != null && memberlist[i][0].equals(id) ) {  
							
					System.err.println("알림)) : 중복된 아이디가 존재합니다 ");
					
					idcheck = false; 
					break;  
				}
			}
			if( idcheck ) {
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
				}//if
			
			
			} // if 1 d
			
				else if (ch==2) { // 2번째 선택 시작
					
				
				System.out.println("---------로그인 페이지---------");
				System.out.println("ID: "); String id = sc.next();
				System.out.println("Password: "); String pa= sc.next();
				
				boolean logincheck = false;
				
				boolean insertbook = false;
				
				for(int i =0; i<memberlist.length ; i++ ) {
				    
					if(id.equals("admin")){  //관리자 메뉴로 접근했을경우
						System.out.println("관리자 메뉴입니다");
						System.out.println("1.도서등록\t2.도서목록\t3.도서삭제\t4.로그아웃"); int 번호1 =sc.nextInt();
						
						insertbook = true; 
						
						if(번호1==1) { 

						System.out.println(" 제목 : "); String title = sc.next();
						System.out.println(" 작가 : "); String content = sc.next();

							 
								
								
							
				
									
								System.out.println("-------------------------------");
								System.out.println("------도서목록----------------------");
								System.out.println("번호\t담당자\t제목\t작가");
								
							 
							
						
					
					
						}	//if ed
					
				
				
							
						else if(번호1==2) {
							

							for( int j = 0; j<boardlist.length ; j ++) {
							if(boardlist [j][0] != null) {
							
							System.out.printf("%d\t%s\t%s\t%s \n",
									j,
									boardlist[j][2],
									boardlist[j][0],
									boardlist[j][1]);
							}
						}}
						else if(번호1==3) {System.out.println(" 알림)) 도서를 삭제합니다.");}
						else if(번호1==4) { System.out.println(" 알림)) 로그아웃되었습니다. ");}
						else { System.out.println("잘못된 입력입니다. 초기메뉴로 돌아갑니다");}
						
					break;
						
						
						
						
					} // admin if d
					
					else if( memberlist[i][0] !=null && memberlist[i][0].equals( id ) &&
							memberlist[i][1].equals(pa) ) {
					
					
					logincheck = true; 
					System.out.println("알림))) 로그인 성공");
					
						while(true) {// 로그인시 메뉴
						}
					}
					
					
					
					else if(logincheck == false) {
						System.err.println("실패 ! 로그인 정보가 다르거나 없습니다.");
					break;
					}
					
					System.out.println("1.도서검색\t2.도서목록\t3.도서대여\t4.도서반납\t5.로그아웃 ");
					break;
					
					} //for end
					
					
					
					
						
					
					
					
				
			     
				} // 2번째 선택 끝
			
				
		 } //wh d
			
	
	} // m d
	
	
	
} // c d


