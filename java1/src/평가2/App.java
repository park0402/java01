package 평가2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 테스트 
//		Car car = new Car( LocalDate.now()  , 
//				"7777",
//				LocalTime.of(17, 44 , 0 ),
//				null, 
//				0 );
//		
//		Controller.carlist.add(car);
//		
		
		while( true ) {
			// 1. 모든 차량 표 출력 
			System.out.println("------------------------ 주차 현황 표 --------------------------------------------");

				//
				Date date = new Date();
				// 날짜 형식 설정
				SimpleDateFormat dateFormat = new SimpleDateFormat("현재시간 : yyyy-MM-dd hh:mm");
				// 설정을 적용해서 출력한다.
				System.out.println( "\t\t"+ dateFormat.format(date) );
				System.out.println("\t날짜\t차량번호\t입차시간\t\t출차시간\t금액");

						// 배열이나 리스트내 모든 객체 호출 반복문
					for( Car temp : Controller.carlist ) {
						System.out.print( temp.get날짜() + "\t" );
						System.out.print( temp.get차량번호() + "\t" );
						System.out.print( temp.get입차시간().getHour() + ":" );
						System.out.print( temp.get입차시간().getMinute() + ":" );
						System.out.print( temp.get입차시간().getSecond() + "\t" );
						
						if( temp.get출차시간() == null ) {
							System.out.print( "주차중\t" );
						}else {
							System.out.print( temp.get출차시간().getHour() + ":" );
							System.out.print( temp.get출차시간().getMinute() + ":" );
							System.out.print( temp.get출차시간().getSecond() + "\t" );
						}
						
						if( temp.get출차시간() == null ) {
							System.out.print( "정산 전\n" );
						}else {
							System.out.print( temp.get금액() + "\n" );
						}
						
					}
					System.out.println("-----------------------------------------------------------------------------------------");

				// 
			System.out.print("\n\t\t 1.입차 \t  2.출차 : ");
			int ch = scanner.nextInt();
			
			if( ch == 1 ) {
				// 1. 차량번호를 입력받는다.
					// 입력 
				System.out.println("차량번호를 입력하세요");
				String 차량번호 = scanner.next();
				// 2. 입력받은 차량번호를 컨트롤내 메소드 에게 넘긴다.
				// 3. 메소드 결과 에 따른 출력 
				boolean 결과 = Controller.입차(차량번호);
			}else if( ch == 2 ){
				// 1. 차량번호를 입력받는다.
					// 입력
				System.out.println("차량번호를 입력하세요");
				String 차량번호 = scanner.next();
				// 2. 입력받은 차량번호를 컨트롤내 메소드 에게 넘긴다.
				// 3. 메소드 결과 에 따른 출력 
				Boolean 결과 = Controller.출차(차량번호);
			}
			
		}
		
	} // 
} // 