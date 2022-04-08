package 팀과제연습; // 원래는 모델 뷰 컨트롤러로 짜야하지만 일단 모델 컨트롤러를 몰아놓음

import java.io.FileOutputStream;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class 차량정보 { //박영근작성

	
	//필드
	private String 차량번호;
	private int 주차위치;


	//전부 String 으로 바꿨습니다. 
	
	
	//생성자
	
	public 차량정보() {};
	//빈생성자
	
	
	
	public 차량정보(String 차량번호,  int 주차위치) { //박영근작성 
		super();
		this.차량번호 = 차량번호;
		this.주차위치 = 주차위치;
		
	}
	

	public void 차량등록(String 차량번호1, int index) { 
		차량번호 = 차량번호1; // 차번호 인자로 받어서 필드의 저장
		주차위치 = index;		// 위치받아서 필드에 저장
		주차타워.주차현황[index] = "[" + 차량번호1 + "]"; 
		save();
	} // 차량등록 e
	
	public void 차량삭제(String 차량번호1) { // 차량삭제 s
		for(int i=0; i<12; i++) { // for s
			if(주차타워.주차현황[i].equals("[" + 차량번호1 + "]")) {
				주차타워.주차현황[i] = "[ ]"; 
				save();
				return;
			}
		} // for e
		출차 = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
	} // 차량삭제 e



		


	
	
	public boolean save(){// 차량파일 저장 시작
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("C:/Users/Public/주차.txt");
		String parkOutput = null;
		for(int i = 0; i<12; i++) {
		parkOutput = 주차타워.주차현황[i]+","; // 쉼표로 구분
		fileOutputStream.write(parkOutput.getBytes()); 
		}
		fileOutputStream.close();
		return true; 
		
	}catch (Exception e) {
				System.out.println(" 저장에 실패하였습니다 ");
	 return false;
	} 
			
		}
	
	public String get차량번호() {
		return 차량번호;
	}
	public void set차량번호(String 차량번호) {
		this.차량번호 = 차량번호;
	}

	public int get주차위치() {
		return 주차위치;
	}
	public void set주차위치(String 차량번호, int 주차위치) {
		this.차량번호 = 차량번호;
		this.주차위치 = 주차위치;
	}
	
	
	//입차 시간
	private ZonedDateTime 입차 = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
	//출차 시간
	private ZonedDateTime 출차;

	public ZonedDateTime get입차() {
		return 입차;
	}

	public ZonedDateTime get출차() {
		return 출차;
	}
	
	
	
	
	
	
	
	
	
}
	
	

