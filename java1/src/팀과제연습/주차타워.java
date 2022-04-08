package 팀과제연습;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class 주차타워 {  //박영근작성

	static String 주차현황[] = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]",
			"[ ]","[ ]","[ ]","[ ]"};
	static ArrayList<차량정보> 차량리스트= new ArrayList<차량정보>();


	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) { // m s
		
		
	
		while(true) { // 
			try {
				int i = 0;
				for(String tmep : 주차현황) {
					System.out.print(tmep);
					if(i % 4 == 3) {
						System.out.println();
					}
					i++;
				}
			
			System.out.println("1.입차 2.출차 3.매출 "); 
			System.out.println("알림))번호를 선택하세요:"); int ch =scanner.nextInt();
			if(ch==1) {
						System.out.println("차량 입차 메뉴");
						System.out.println("차량번호4자리 : "); String 차량번호1 = scanner.next();
						System.out.println("0~3 1층 4~7 2층 8~11 3층 0~9");
						System.out.println("주차위치 0~9 선택 : "); int index = scanner.nextInt();
							
						if(주차현황[index] == "[ ]") { // 빈인덱스가 있으면;
							차량정보 입차객체 = new 차량정보(); 
							입차객체.차량등록(차량번호1,index);
							
							System.out.println("입차가 완료되었습니다.");
						}else {//아니면
							System.out.println("먼저온차가 주차되어 있습니다");

						}
						
					} else if(ch==2) {
				System.out.println("차량 출차 메뉴 ");
			}else if(ch == 3) {
				System.out.println("매출 정보");
				System.out.print("년도 입력: "); int 년 = scanner.nextInt();
				System.out.print("월 입력: "); int 월 = scanner.nextInt();
//				차량정보.매출(년, 월);
			}
			else {
				System.out.println("잘못된 숫자입력입니다."); 
			}
			} catch (Exception e) { System.err.println( " 에러입니다 관리자에게 문의하세요");
				// TODO: handle exception
			}
			
			
		
		
		} // w d

			
			
	} // m d
	
	
} // c s
	
	
	



