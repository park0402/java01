package Day08;

import java.util.Random;

public class Day08_3 {
	
	public static void main(String[] args) {
		
		// 패키지 : 폴더 기능 [클래스 식별 ]
		
			// 하위패키지 : 패키지명. 하위패키지명.
		// import :  현 패키지를 제외한 다른 패키지내 클래스 호출
		
			//클래스파일 상단에 작성
			// * : 모든 클래스
			// 클래스 자동완성시 -> 해당 클래스 import 자동 
		
//		Random 클래스 컨 스페이스로 자동완성
		
		// 접근제한자
			// public : 모든 곳에서 접근 [호출가능]
			// private : 현 클래스내에서만 접근[호출가능]
			// 일반적으로 필드는 private 로 막아야한다  생성자는 public
			// protected : 동일한 패키지내에서만 접근[호출 가능] (상속된 클래스는 접근가능)
			
			// default(생략,기본값) : 동일한 패키지내에서만 접근 [호출 가능]
	}

}
