package Day09;

import java.util.Random;

public class 은행컨트롤러 { //클래스
	
	//해당 클래스는 은행 관련 컨트롤러
	// M : 모델 [데이터]
	// V : 뷰 [ 입출력]
	// C : 모델(M)과 뷰(V) 연결 역할
	
	// 뷰에서 요청하는 서비스[기능] 제공
		// 1.계좌생성
	
	//빈 객체생성
	
	public boolean 계좌생성(String 비밀번호 , String 계좌주, int 은행번호) {
		//1. 입력받은 값을 가져온다 
			//계좌 자동생성
		Random rendom = new Random();
			//4자리 생성
		
		//2. 객체화를 시킨다 [다수의 변수를 하나의 객체화]
		은행 temp = null;
		if( 은행번호==1) {
			temp = new 국민은행("0," , 비밀번호 , 계좌주 ,0);
		}else if (은행번호==2) { 
			temp = new 신한은행("0," , 비밀번호 , 계좌주 ,0);
		}else if (은행번호==3) {
			temp = new 하나은행("0," , 비밀번호 , 계좌주 ,0);
		}
		//3. 배열에 저장
		int i = 0; //인덱스
		for (은행 temp2 : 은행계좌프로그램_상속.계좌리스트) {
			if(temp2==null) {
				은행계좌프로그램_상속.계좌리스트[i]=temp; // 공백 인덱스에 저장
				
				System.out.println("계좌 등록 ");
				return true;
				
			}
			i++; //인덱스 증가 증가하면서 공백인덱스 저장 필수 인덱스 쓸경우
		}
		
		return false;
		}
		// 2. 입금
	public boolean 입금() {
		return false;}
		// 3. 출금
	public boolean 출금() {
		return false;
		}
		// 4. 이체
	public boolean 이체() {
		return false;
		}
		// 5. 내계좌목록
	public boolean 계좌목록() {
		return false;
		}
		// 6. 대출
	public boolean 대출() {
		return false;
		}

}
