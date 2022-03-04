package Day04;

import java.util.Scanner;

public class Day04_1 { // c s
	public static void main(String[] args) { // m  s
		
		//제어문 : if , which
		//반복문 : for, while
			// 1.초기값 2.조건식 3.증감식 4.실행문
		// for 예1)
		
		for( int i = 1; i<=10; i++) { // for s
		//i는 1부터 10이하까지 1씩증가하면서 실행문 반복처리 -> 10번실행
		
		System.out.println(i+ " "); 
		
		} //for end
		
		// while의 형태
		// 1. 초기값;
		// while(2.조건식) {
		// 4. 실행문;
		// 3. 증감식;
		//}
		
		//예1)
		int i = 1;// 1.초기값 //위에있는 i는 {}안에서 선언되어서 전체적용x 밖에 선언된 int i는 전체적용
		while( i<=10 ) {// 2.조건식 while s
			
			System.out.println(i+ " ");//4.실행문
			i++; //3. 증감식
		} //while e
		
		// for 예2) 1~100누적합계
		
		int sum = 0;
		for(int j = 1 ; j<=10 ; j++) {
			sum +=j; //sum = sum+j
		}  System.out.println( "for 1~100까지 누적합: " + sum);
		
		
		int j = 1;
		int sum2 = 0;
		while(j<=100) {//2.조건식 [ true이면 실행 아니면 실행x]
			sum2 += j;
			j++;
		}//while e
		System.out.println("while 1~100까지 누적합 : " + sum2);
		
		//while 예3) 무한루프
		while(true) { //조건식이 true이면 실행 //tue상수 -> 무한루프
			System.out.println("무한루프");
			Scanner scanner = new Scanner(System.in);
			int exit = scanner.nextInt();
			if(exit == 3)
				break;//가장 가까운 반복문탈출 [ if 제외 ]
		}
		
	
	} // m d

} // c d
