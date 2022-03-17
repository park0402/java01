package Day11;

import java.util.Scanner;

public class Day11_4_BoardApp {
	/*	
	 *  게시판+ 댓글 프로그램	
	 *  게시물 클래스
	 *  		// 번호=인덱스 , 제목, 내용 ,작성자 ,작성일 , 조회수
	 *  댓글 클래스
	 *  		// 게시물 번호
	 *  컨트롤러 클래스
	 *  		// 1. 목록 2. 쓰기 3. 보기 4. 수정 5. 삭제 6.댓글쓰기
	 *  Day11_4_BoredApp 클래스
	 *  	//입출력 [ 입력받아 컨트롤러에게 입력받은값전달 
	 */
	public static void main(String[] args) {
		Controller.load(); // 2. 파일 [ 모든게시물 불러오기 ]
		Scanner scanner = new Scanner(System.in); //1.입력객체
		
		while(true) {
			try{//예외발생 : 사용자가 문자입력시 예외발생 catch로 이동
				//모든 게시물 출력
				System.out.printf("%s\t%10s\t%10s\t%10s\t%2s\t \n" ,"번호","제목","작성자","작성일","조회수");
				int i = 0; // 리스트내 인덱스
				for(Board board: Controller.boardlist) {
					System.out.printf("%2s\t%10s\t%10s\t%10s\t%2s\t \n", i , board.getTitle(),
							board.getWriter(),board.getDate(),board.getViewcount() ); 
							i++; 
				}
				System.out.println("1.쓰기 2. 보기 ");
				int ch = scanner.nextInt();
				if(ch==1) {
					System.out.println("***게시물 등록***"); //next 띄어쓰기 x nextLine은 띄어쓰기 o
					scanner.nextLine();
					//nextLine() : 공백포함 입력가능 [문제! : nextLine 앞에 next 하나로 취급해서 묶어버림
					// 해결방법; 일반next와 nextLine 사이에 nextLine()
					System.out.println("제목: "); String 제목 = scanner.nextLine();
					System.out.println("내용: "); String 내용 = scanner.nextLine();
					System.out.println("작성자: "); String 작성자 = scanner.next();
					System.out.println("비밀번호[수정/삭제시]: "); String 비밀번호 = scanner.nextLine();
					Controller.write(제목, 내용, 작성자 ,비밀번호); //인수전달
				}
				else if(ch==2) {
					//해당 게시물 번호를 입력받아 게시물정보 모두 출력
					System.out.println("게시물 번호: "); int index = scanner.nextInt();
					
					//해당 인덱스 출력 
					try{Board temp = Controller.boardlist.get(index);
					System.out.println("*****게시물보기****");
					System.out.println("제목 : "+ temp.getTitle() );
					System.out.println("작성자 : "+ temp.getWriter()+"작성일: " + temp.getDate() + temp.getDate() + "조회수: " +temp.getViewcount());
					System.out.println("내용 : " + temp.getContent() );
					System.out.println("1. 뒤로가기 2. 수정 3. 삭제 4. 댓글쓰기 선택: ");
					//메뉴
					int ch2 = scanner.nextInt();
					if(ch2==1) {}
					else if (ch2 ==2 ) {
						System.out.println(" 현 게시물 패스워드 "); String password = scanner.next();
						scanner.nextLine(); 
						System.out.println(" 변경 제목: "); String title = scanner.nextLine();
						System.out.println(" 변경 내용: "); String content = scanner.nextLine();
						Controller.update(index,password,title,content); //수정할 인덱스 번호,패스워드,체크,수정할 제목, 수정할 내용 
					}
					else if (ch2 ==3 ) {
					System.out.println("현 게시물 패스워드 : "); String password = scanner.next();
					Controller.delete(index,password);
					boolean result = Controller.delete(index, password);
					if(result) {System.out.println("알림) 삭제성공");}
					else System.out.println("알림)삭제실패 비밀번호가 다릅니다");
					
					}
					else if (ch2 ==4 ) {Controller.replywrite();//인덱스번호,댓글내용패스워드등
					}
					else {}
					}catch(Exception e){
						System.err.println( " 메세지 )사용할수없는 번호입니다");
						scanner =new Scanner(System.in);
					}
				}
				else {}
			}catch(Exception e) {
				System.err.println("에러))숫자만 입력해주세요. [다시입력] "); //console시 에러메시지 반복뜸
				scanner= new Scanner(System.in); //에러 반복피하기위해 새로 입력받기
			}
			
		}
	
	}
}
