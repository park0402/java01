package Day12;

public class Day12_2 {
	public static void main(String[] args) {
		
		//String 메소드
		//p499 charAt(): 문자열에서 특정문자 추출
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch(sex) { //switch 제어문 [ switch (검사대상)]
			case '1' : 
			case '3' : System.out.println("남자"); break;
			case '2' :
			case '4' : System.out.println("여자 "); break;	
		}
		// p.501 equals() : 문자열 비교
		// 기본 자료형 사용하는 변수는 연산자 사용가능 [==]
		// String 클래스 사용하는 객체는 ==연산자 사용불가능 [equals]
		
		//자바메모리 [	JVM]
			//스택 메모리 :지역변수
			// 힙 메모리	:객체
			// 메소드 메모리
		
		//1.문자열 선언
		String strVar1 = new String("신민철");
		String strVar2 = "신문철"; // 객체는 new 연산자가 필수이지만 String 클래스만 자동 객체생성
		//2.문자열 비교
		if(strVar1==strVar2) { //문자열은 ==이 안된다 [ == 메모리 주소 비교 
			System.out.println("같은 String 객체를 참조"); 
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		//3. equals 사용
		if(strVar1.equals(strVar2)){
			System.out.println("같은 문자열을 가짐");
			
		}else {
			System.out.println("다른문자열을 가짐");
		}
		// p.502 getBytes() : 문자열 -> 바이트열 변환
		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes(); //문자열-> 바이트열 변환
		System.out.println("영문1byte 한글2byte" + bytes1.length ); //배열명.length 
		try {
			
				//1. 인코딩 타입
			//EUC-KR
				byte[] bytes2 = str.getBytes("EUC-KR");//일반예외 발생
				System.out.println("EUC-KR 길이: " + bytes2.length );
				String str2 = new String( bytes2 , "EUC-KR");
				System.out.println("바이트열-> 문자열: "+str2);
			//UTF-8
				byte[] bytes3 = str.getBytes("UTF-8");//일반예외 발생
				System.out.println("UTF-8 길이: " + bytes3.length );
				String str3 = new String( bytes3 , "UTF-8");
				System.out.println("바이트열-> 문자열: "+str3);
		}catch(Exception e) {
			
		}
		
		//P.504 iudexOf() 문자 위치[인덱스] 찾기
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		System.out.println(location); // 3번 인덱스에서 프로그래밍 찾기 성공
		// 문자열내 특정 문자열 위치 [인덱스] 찾기 /.만약에 없으면 -1[없다]
		if (subject.indexOf("자바") !=-1) {
			System.out.println("자바와 관련 책");
			
		}else {
			System.out.println("자바와 관련 없는 책");
		}
		
		System.out.println("------------------------------");
		
		//p.505 length(): 문자열 길이
		String ssn2 = "7306241230123";
		int length = ssn2.length();
		if(length == 13 ){
			System.out.println("주민번호 자리수가 맞습니다 .");
		}else {
			System.out.println("주민번호 자리수가 틀립니다 . ");
		}
		
		System.out.println("--------------------");
		// p.506 replace( "기존문자", "새로운문자") : 문자열 대치[변경]
		String oldStr = " 자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println( "기존문자열: " +oldStr );
		System.out.println( "새로운문자열: " +newStr );
		
		//p.507 substring() vs split () : 문자열 자르기
		String ssn3 = " 880815-1234567";
		
		String firstNum = ssn3.substring(0,6); //시작인덱스 마지막인덱스
		System.out.println("확인 : " + firstNum);
		
		
		
		String str2 = String.valueOf(10);
		String str3 = String.valueOf(10.5);
		String str4 =  String.valueOf(true);
		String str5 =  10+""; //  int 형을 String 변수에 저장 불가능+ "" 가능 문자+숫자는 ->문자 공백x
	}
	


}
