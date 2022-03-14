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
			//String 쓴이유 계좌번호 알려줘야 하기 때문에 
	public String 계좌생성(String 비밀번호 , String 계좌주, int 은행번호) {
		
		String 계좌번호 = null; //선언만 [이유 while안에서 선언시 while 안에서만 사용가능 메소드에서 쓰기위해서]
		
		while(true) { //무한루프 
		
		//1. 입력받은 값을 가져온다 
			//계좌 자동생성
			
			Random random = new Random();
			//4자리 생성
			int 난수 = random.nextInt(10000); //0~9999 사이
			계좌번호 = String.format("%04d", 난수);
						// 문자형식 변경
						// %d 정수
						// %4d 정수 4자리 [만일 자릿수 없으면 공백]
								//15->15
						// %04d 정수 4자리[만일 자릿수없으면 0처리]
								//15->0015
			//중복체크 
			Boolean 계좌번호중복 = false;
			for (은행 temp2 : 은행계좌프로그램_상속.계좌리스트) {
				if(temp2 != null && temp2.get계좌번호().equals(계좌번호)) {
				//기존 배열내 계좌번호와 동일하면 
					계좌번호중복 = true;
				
				}
			}
			if(계좌번호중복==false) break; //무한루프 종료
		}
			
		//2. 객체화를 시킨다 [다수의 변수를 하나의 객체화]
		은행 temp = null;
		if( 은행번호==1) {
			temp = new 국민은행(계좌번호 , 비밀번호 , 계좌주 ,0);
		}else if (은행번호==2) { 
			temp = new 신한은행(계좌번호 , 비밀번호 , 계좌주 ,0);
		}else if (은행번호==3) {
			temp = new 하나은행(계좌번호 , 비밀번호 , 계좌주 ,0);
		}
		//3. 배열에 저장
		int i = 0; //인덱스
		for (은행 temp2 : 은행계좌프로그램_상속.계좌리스트) {
			if(temp2==null) {//해당 temp2 가 공백이면 
				은행계좌프로그램_상속.계좌리스트[i]=temp; // 공백 인덱스에 저장
				return 계좌번호;
			
				
				
			}
			i++; //인덱스 증가 증가하면서 공백인덱스 저장 필수 인덱스 쓸경우
		}
		
		return null;
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
	public boolean 계좌목록(String 계좌주) { 
							//인수 외부로 들어오는 데이터
		// 동일한 계좌주의 계좌를 찾아서 배열담아 넘기기
		은행[ ]내계좌목록= new 은행 [100];
		for (은행 temp: 은행계좌프로그램_상속.계좌리스트) {
			if(temp!= null && temp.get계좌주().equals(계좌주) ){//해당 계좌내 계좌주와 인수의 계좌주와 동일하면 목록 배열내 빈공간 을 찾아서 계좌목록에 넣기
				int i = 0;
				for (은행 temp2 : 내계좌목록) {
					if(temp2==null) {
						내계좌목록[i]=temp; break;
					}
					i++;
				}
			}
		}		
		return false;
		}
		// 6. 대출
	public boolean 대출() {
		return false;
		}

}
