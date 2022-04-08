package 평가문제2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try { while(true) { //while 무한루프시작
			//1.주차현황표 항시출력
			System.out.println("----------------------------주차현황표-----------------------");
			Date 날짜 = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("현재시간:yyyy-MM-dd hh:mm");
			System.out.println( "\t\t"+ dateFormat.format(날짜) );
			System.out.println("날짜\t\t차량번호\t\t입차시간\t출차시간\t금액");
			//날짜형식 현재시간 년 월 일 지정 클래스
			for(Car temp : Controller.차량리스트) {//컨트롤이 차량리스트 호출 for 반복문

				System.out.print(temp.get날짜()+"\t");
				System.out.print(temp.get차량번호()+"\t");
				System.out.print(temp.get입차시간().getHour()+":"
				+temp.get입차시간().getMinute()+"\t");
				
				if(temp.get출차시간() ==null) {
					System.out.print("주차 중"+"\t");  
				}else {
					System.out.print(temp.get출차시간().getHour()+":"
				+temp.get출차시간().getMinute()+"\t");  
				}
				
				if(temp.get출차시간()==null) {
					System.out.print("정산 전"+"\t");
				}else {System.out.println(temp.get금액()); 
				
			}	
			
		
		
					
		System.out.println();
		
		}
	
		System.out.println("------------------------------------------------");
		System.out.println("\t\t1.입차\t\t2. 출차"); int ch =sc.nextInt();
		if(ch==1) {
			System.out.println("차량번호:");String 차량번호 =sc.next();
			//차량번호 입력받고 메소드한테 인자 주기
			boolean 결과 =  Controller.입차(차량번호); //
			
		}else if (ch==2) {
			System.out.println("차량번호:");String 차량번호 =sc.next();
			boolean 결과 = Controller.출차(차량번호);
			
		}
		
		
	
	
	} } catch (Exception e) {
		// TODO: handle exception
		}
	} //m d
} // c d
