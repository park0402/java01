package Day15;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		while(true) {
			System.out.println( "1.입차 2. 출차"); int ch = sc.nextInt();
			if(ch==1) {
				System.out.println("차량번호:");String 차량번호 = sc.next();
				//차량번호 컨트롤내 메소드에게 넘기기
				// 메소드 결과에 따른출력
			boolean	결과 = Controller.입차(null);
			}
			else if (ch==2) {
				System.out.println("차량번호:");String 차량번호 = sc.next();
				//차량번호 컨트롤내 메소드에게 넘기기
				// 메소드 결과에 따른출력
			boolean	결과 = Controller.출차(null);
				
			}
			else { System.out.println("잘못된 입력입니다.");
			
			}
			
			
		}
	}

}
