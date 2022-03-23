package 평가문제2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Controller {
	//1.리스트 사용
	public static ArrayList<Car> 차량리스트 = new ArrayList<>();
	//클래스 입력 
	
	//입차메소드 boolean 으로 성공 실패받기
	
	public static boolean 입차(String 차량번호) {
		// 1.차량번호 인수 가져오기 
		for(Car temp : 차량리스트) {
			// 2.차량번호 중복체크하기
			if(temp.get차량번호().equals(차량번호)) { 
				return false; // 2-1 있으면 주차실패 2-2 없으면 입차 시작
			}
		}	//for문 종료
		// 3.입차날짜(현재날짜)구하기
		LocalDate 날짜 = LocalDate.now();
		// 4.입차시간 구하기
		LocalTime 입차시간 = LocalTime.now();
		// 5. 차량번호,입차날짜,입차시간 객체화하기
		Car 입차1 = new Car(날짜,차량번호,입차시간,null,0);
		// 6. 객체 리스트에 저장하기
		차량리스트.add(입차1);
		// 7. 값 반환하기
		return false;
	}  //입차 메소드 종료
	
	//출차메소드 boolean으로 성공실패받기
	public static boolean 출차(String 차량번호) {
		
		for(Car temp : 차량리스트) {
		// 1.차량번호 인수 가져오기 
			if(temp.get차량번호().equals(차량번호)) {// 2.리스트에 동일한 차량 있는지 가져오기
				
		//2-1.있으면 정산 
			// 3. 출차시간 구하기
			LocalTime 출차시간 = LocalTime.now();
			// 4. 출차시간-입차시간=주차장머무른시간
			int 이용시간 = (int)(temp.get입차시간().until(출차시간,ChronoUnit.MINUTES));
			// 주차장 머무른시간 최초30분 무료 이후 10분 1000원 (머무른시간-30 /10 )* 1000
			이용시간 -=30  ;
			if(이용시간<0) {
				temp.set금액(0);
			}else { 이용시간= ( 이용시간/10)*1000;
				temp.set금액(이용시간);
			}
			
			
			}else {System.out.println("잘못된 입력입니다.");} //2-2. 없으면 오류
		}
		// 2.리스트에 동일한 차량 있는지 가져오기
		

		return true; //출차성공
			
	}
	

	
	

}
