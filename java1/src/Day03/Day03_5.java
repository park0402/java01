package Day03;

import java.util.Scanner;

public class Day03_5 { // c s
	
	public static void main(String[] args) { // m s
		
	Scanner scanner = new Scanner(System.in);
		
	
	
	// 제어문 : 1. if문 2.swich문
	
	// if : 논리검사(true 혹은 false) / 경우의수 정해져 있지 않는경우 ex) >= > < ==!= 등
	
	// swich : 데이터검사 / 경우의수 정해져있는 경우
	// 형태
		//swich( 검사대상 ){
	 		// case '값' : 실행문;
	 		// case '값' : 실행문;
			// case '값' : 실행문;
			// default : 실행문;
			//}
	//예 1) 점수가 90점이면 A 80점이면 B 70점이 C 그외 탈락
		int 점수 = 80;
		if(점수==90)System.out.println("A등급");
		else if(점수==80)System.out.println("B등급");
		else if(점수==70)System.out.println("C등급");
		else System.out.println("탈락");
		
		switch ( 점수 ) {
		
		case 90 : System.out.println("A등급"); break;
		case 80 : System.out.println("B등급"); break;
		case 70 : System.out.println("C등급"); break;
		default : System.out.println("탈락"); break;}
		
		// swich는 모든 case를 실행시킨다 그래서 중지를 시켜줘야 한다 
		
		// break; : 가장 가까운 swich 혹은 반복문을 탈출 
		
	// 예 2) 
		int 버튼 = 3 ; 
		
		switch(버튼) {
		 case 1: System.out.println("1층으로 이동"); break;
		 case 2: System.out.println("2층으로 이동"); break;
		 case 3: System.out.println("3층으로 이동"); break;
		 case 4: System.out.println("4층으로 이동"); break;
		 default:System.out.println(" 정지 "); break;
		}
		
		char 등급 ='B';
		
		switch( 등급 ) {
		 case 'A':
		 case 'B':System.out.println("우수회원");break; //실행문이 동일한경우 A,B 등급 회원이 모두 우수인 경우 묶어도됌 
		 case 'C':
		 case 'D':System.out.println("일반회원");break;
		 
		 default:System.out.println(" 정지 ");break;
		}
		
 //문제1) 국영수 입력받아 평균이 90점 이상이면 A 80점 이상이면 B등급 나머지 탈락
		System.out.println("국어 : "); int 국어 = scanner.nextInt();
		System.out.println("영어 : "); int 영어 = scanner.nextInt();
		System.out.println("수학 : "); int 수학 = scanner.nextInt();
		int 평균 = (국어+영어+수학)/3;
		
		switch (평균/10) { //평균을 단순값으로 나타나기위해서 예: 84/10 =8 10 9 8 7 등 단순 숫자로 나옴 
			case 10 :
			case 9 : System.out.println("A등급입니다."); break;
			case 8 : System.out.println("B등급입니다."); break;
			default : System.out.println("과락입니다 "); }
	
		
		
	} // m d
} // c d
