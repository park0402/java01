package Day14;

import Day13.Day13_3_달력;

public class Day14_2_클래스멤버 {
	
	public static void main(String[] args) {
		
		// 클래스 멤버 
			// 1. 필드
				// 1. 접근제한자 ( 생략시 default )
					// private : 현재 클래스내에서 사용가능
						// 목적 : 필드 직접접근 제한 [ 필드에 저장/호출시 데이터 검사(무결성유지)  ]
					// public : 모든 클래스내에서 사용가능
					// default(생략시) : 동일한 패키지[폴더]내 사용가능
					// protected : 동일한 패키지[폴더]내 사용가능 ( *단: 서로 다른 패키지의 슈퍼클래스 접근 가능 )
				// * : static , final  = 상수 
				// 2. 자료형(클래스,기본자료형)
					// 1. 기본 자료형 [ int , double , char , boolean 등 ]
					// 2. 클래스 [ 사용자 만든 클래스 ] : 회원클래스,게시판클래스,제품클래스,카클래스
					// 3. 클래스 [ 미리 만들어진 클래스 ] : API ( String , Scanner , ArrayList 등) 
					// 4. 인터페이스
					// 5. [ ] 배열
				// 3. 변수명(객체명)
					// * 본인이 원하는대로 하되 중복이름X
					// * 클래스명의 소문자 [ Scanner scanner , Date date ]
		
				// * 변수 , 객체(new) , 인터페이스 , 배열
					
			// 2. 생성자 [ 객체 생성시 초기값 = 처음값 ]
				// 1. 접근제한자 
				// 2. *생성자이름 = 클래스이름   [ 만일 다를경우 오류 ]
				// 3. 인수[매개변수]
					// * 필요에 따른 인수 선택 
					// 1. 빈생성자 [ 관례적 목적 : 메소드 호출용(메소드 호출시 객체필요!!) ]
					// 2. 모든필드생성자[ 관례적 목적 : 모든 필드 저장/호출 ]
					// 3. 특정필드생성자[ 몇가지의 필드만 저장 ]
						// * 상황에 따른 객체 생성시 들어가는 필드
		
			// 3. 메소드 [ 1. 코드 묶음 2.재활용[재사용] 3.인수에 따른 서로 다른 결과물 4.반환값 ]
				// 1. 접근제한자
				// 2. 반환자료형
					// void : 반환값 [ 메소드 종료시 돌려주는 값 X ] 
					// 기본자료형/클래스/인터페이스/배열 등 
				// 3. 메소드이름
					// * 아무거나 하되 관례적 소문자 
				// 4. 인수[매개변수]
					// * 메소드 호출시 메소드 안으로 들어오는 데이터들
					// 객체명.메소드( 3 )   ->   메소드( int 변수명 )
						// * 인수의 자료형 동일하되 변수명은 자유 
							// 객체명.메소드( 유재석 )  ->   메소드 ( int 변수명 )  : X 
									// 문자열을 보냈으면 문자열로 받아라
											//		->   메소드 ( String 변수명 ) : O
		
	}
	
	
	
	
	
	
	
}