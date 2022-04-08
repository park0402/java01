package Day15;

import java.util.ArrayList;

public class Controller {
	//입차메소드
	public static boolean 입차(String 차량번호) {
		
//		// 1. 배열경우
//		public static Car[] carlist = new Car[100];
//		
//		//2. 리스트경우
//		public static ArrayList<Car> = new ArrayList<>();
		
		//입차 코드 작성
			// 1. 입력 받은 차량번호(인수)를 가져온다
			// *차량번호 중복체크()
			// 2. 입차날짜를 구한다 (????)
			// 3. 입차시간을 구한다
			// 출차시간 ,금액은 출차시 
			// 4. 차량번호, 입차날짜 , 입차시간 -> 3개변수 ->1객체화
			// 5. 차량객체를 배열이나 리스트에 저장
			// 6. 파일처리나 DB 처리
		
		return false;
	}
	
	public static boolean 출차(String 차량번호) {
		//출차 코드작성
			//1. 입력받은 차량번호(인수) 가져온다
			//2. 출차시간(현재시간)을 구한다 
			//3. 계산 출차시간- 입차시간 -> 분단위로 계산Localtime until로 차이 구하기
						// (분-30)/10 *1000
			//4. 배열 or 리스트내 동일한 차량번호 찾아서 
			//5. 찾은 객체내 출차시간과 금액을 대입한다.
		return false;
	}
}
