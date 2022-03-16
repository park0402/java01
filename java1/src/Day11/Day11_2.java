package Day11;

import java.util.Scanner;

public class Day11_2 {
	//p.422 
		// 컴퓨터의 하드웨어 문제 에러 [해결불가]
		// 사용자의 잘못된 조작 or 개발자의 잘못된 코딩의 에러의 예외
		//종류 : 1. 일반예외 2. 실행예외 
			// 일반예외 : 컴파일(실행) 전에 예외 검사 [개발자에게 강제 예외처리 :아예실행이불가능하니까 (실행전)]
			// 실행예외 : 컴파일(실행) 후에 예외 검사	[개발자의 경험의 판단해서 예외처리]
		//예외처리
			// 목적: 에러가 발생하면 프로그램은 종료된다 [안전성에 문제가 생긴다]
			// 에러가 발생 하더라도 대체 코드를 넣는것 
	/* 사용방법
	 * try{
	 *	예외가 발생할것같은 코드 묶기
	 * }catch(예외클래스 객체명) {
	 *	만약에 예외가 발생하면 실행되는 코드 
	 * } 
	 */
	
	
	
	public static void main(String[] args) {
		// p.423
		try{
			String data = null;
			System.out.println( data.toString() );  
			//Object 클래스 메소드 : toSpring() : 객체정보출력
			//실행전에는 에러가 없다 -> 실행후에 예외생기는것을 실행예외라한다
			//에러가 발생하는이유 :  null 은 메모리 할당이 없기 때문에 객체정보 출력 불가능
		}
		catch(NullPointerException 객체명) {
			//예외처리 
			System.out.println("예외발생: "+ 객체명);
		}
		
		try {
		String[]배열 = new String[2]; // String 2개를 저장할수 있는 배열
		배열[0] = "a" ; 배열 [1] = "b"; 배열[2] ="c"; //2개를 초과
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생: " + e);
			
		// p.426
		try {
		String	data1 = "100";
		String	data2 = "a100";
		int value1 = Integer.parseInt(data1);// "100"-> 100
		int value2 = Integer.parseInt(data2);//"a100" -> a는 정수로 불가능하다
							//Integer.parseInt(문자열_): 문자열 ->정수
		//오류 발생이유 : 문자열내 숫자형식은 변환이가능하지만// 문자형식은 변환이 불가능하다
		int result = value1 + value2 ;
		System.out.println(data1+"+"+data2+result);
		//오류가 발생안하면 int로 발생하면 catch로 이동
		}catch(NumberFormatException f) {
			System.out.println("예외발생:"+f);
		}
		}
		try {
		String 문자열 = "유재석"; 	//자바 클래스중 하나 [ object 상속]
		Object 슈퍼객체; 			// 자바 클래스내 최상위 클래스
		
		슈퍼객체 = 문자열 ; 			//자식 --> 부모 가능
		문자열 = (String) 슈퍼객체; 	//부모 --> 자식 불가능
				//강제형변환
				//실행중에 형변환

		}catch(Exception g) {
			System.out.println("예외 발생: " + g);
		}
	}
}
