package 팀과제연습;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class 주차타워 { 

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) { // m s
		
		
		

				
		while(true) { // while s
			try {
				
			
//			컨트롤러.불러오기(); //입차차량 정보
			
			System.out.println("주차타워 프로그램입니다.");
			System.out.println("1.입차 2.출차 3.종료 ");
			System.out.println("알림))번호를 선택하세요:");
			int ch =scanner.nextInt();
			
			if(ch==3) {
				System.out.println("이용해주셔서 감사합니다");
			break;
			}else if(ch==1) {
				System.out.println("차량 입차 메뉴");
				System.out.println("1.입차 2. 종료"); int ch2 = scanner.nextInt();
					if(ch2==2) {
						System.out.println("입차를 종료합니다.");
					}else if(ch2==1) {
						System.out.println("차량번호4자리 : "); int 차량번호 = scanner.nextInt();
						System.out.println("입고시간 예)1일13시09분:011309");
						System.out.println("차량입고시간6자리: "); int 입차시간 = scanner.nextInt();
						System.out.println("차량이 입고되었습니다.");
					
						컨트롤러.write(차량번호, 입차시간); //입차정보저장메소드 인수전달
					}
			
			} else if(ch==2) {
				System.out.println("차량 출차 메뉴 ");
			}else {
				System.out.println("잘못된 숫자입력입니다."); 
			}
			} catch (Exception e) { System.err.println( " 에러입니다 관리자에게 문의하세요");
				// TODO: handle exception
			}
			
			
		
		
		} // w d

			
			
	} // m d
	
	
} // c s
	
	
	



	
	


