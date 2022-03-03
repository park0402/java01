package Day03;

import java.util.Scanner;

public class Day03_2 { //c s
	public static void main(String[] args) { // m s
		
		// 입력객체 = {} 당 1번 선언
		Scanner scanner = new Scanner(System.in);

		System.out.println("문제1 : 2개의 정수를 입력받아서 더 큰수는?");
		
		System.out.println("정수1입력: ");
		
		int 정수1 = scanner.nextInt();
		// int형 변수 선언하고 입력받은 값을 정수로 가져와서 대입.
		System.out.println("정수2입력: ");
		int 정수2 = scanner.nextInt();
		
		//제어 
		if (정수1 > 정수2)//만약에 입력받은 정수1변수가 정수2보다 크면 실행 아니면 다음 조건
			System.out.println("더 큰수: " + 정수1);
		else if (정수1 < 정수2)//[다음조건] 정수1변수가 정수2 보다 작으면 실행 아니면 그외
			System.out.println("더 큰수: " + 정수2);
		else //나머지 [그외] 실행
			System.out.println("같다");
		
//		//비교 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
//				System.out.print(" 문제6) 정수1 입력 : ");	int 문제6_1 = scanner.nextInt();
//				System.out.print(" 문제6) 정수2 입력 : ");	int 문제6_2 = scanner.nextInt();
//				
//				int 큰수 = 문제6_1 > 문제6_2 ? 문제6_1 : 문제6_2; 
//				System.out.println(" 더 큰 수는 : " + 큰수 );
		
		System.out.println("문제2 3개의 정수 중 가장큰수  ");
		System.out.println("정수3입력: "); int 정수3 = scanner.nextInt(); // 변수명 중복 *주의 *
		System.out.println("정수4입력: "); int 정수4 = scanner.nextInt();
		System.out.println("정수5입력: "); int 정수5 = scanner.nextInt();
		
		int max = 정수3; //가장 큰수를 임시저장
			// max에 첫번째 값 넣어두기.
		if(max<정수4) { max = 정수4;}
		if(max<정수5) { max = 정수5;}
		System.out.println("가장 큰수 : " + max);
		
		
		
		System.out.println("문제3 : 3개의 정수를 입력받아서 오름차순으로 정리하기");
		
		System.out.println("정수6입력: "); int 정수6 = scanner.nextInt();
		System.out.println("정수7입력: "); int 정수7 = scanner.nextInt();
		System.out.println("정수8입력: "); int 정수8 = scanner.nextInt();
		
//		 temp 사용
		if (max < 정수6) {
			// 만약에 max 보다 정수6가 더크면 교체
		int temp = 정수6; // 스왑용 임시변수= 변수1; int temp; // 교환시 사용되는 임시변수
		정수7 = 정수8; // 변수1= 변수2 ;
		정수8 = temp; // 변수2= 임시변수;
		}
		
		if( 정수6>정수8 ) {int temp = 정수6; 정수6 = 정수8; 정수8=temp;}
		if( 정수7>정수8 ) {int temp = 정수7; 정수7 = 정수8; 정수8=temp;}
		
		System.out.printf("입력한 값 오름차순 :  %d %d %d ", 정수6, 정수7, 정수8);
		System.out.println("입력한 값 오름차순: " + 정수6 + " " + 정수7+ " " + 정수8);
		
		// 문제4 : 4개의 정수를 입력받아 오름차순으로 출력 
				System.out.print("문제4 정수1 : ");	int 정수10 = 입력객체.nextInt();
				System.out.print("문제4 정수2 : ");	int 정수11 = 입력객체.nextInt();
				System.out.print("문제4 정수3 : ");	int 정수12 = 입력객체.nextInt();
				System.out.print("문제4 정수4 : ");	int 정수13 = 입력객체.nextInt();
				
				int temp; // 교환시 사용되는 임시변수
				///////////////////////////////// 크면 뒤로 가기 => 오름차순 ////////////////////	
					// 1. 1번째 변수와 2번째,3번째 4번째 변수와 비교 = 3번  
				if( 정수10 > 정수11 ) { temp = 정수10; 정수10 = 정수11; 정수11 = temp; }
				if( 정수10 > 정수12 ) { temp = 정수10; 정수10 = 정수12; 정수12 = temp; }
				if( 정수10 > 정수13 ) { temp = 정수10; 정수10 = 정수13; 정수13 = temp; }
					// 2. 2번째 변수와 3번째,4번째 변수와 비교 = 2번 
				if( 정수11 > 정수12 ) { temp = 정수11; 정수11 = 정수12; 정수12 = temp; }
				if( 정수11 > 정수13 ) { temp = 정수11; 정수11 = 정수13; 정수13 = temp; }
					// 3. 3번째 변수와 4번째 변수와 비교 = 1번 
				if( 정수12 > 정수13 ) { temp = 정수12; 정수12 = 정수13; 정수13 = temp; }
					// 4. 4번째 변수는 비교를 3번 당했기 때문에 비교 x
				System.out.printf(" 오름차순 : %d  %d  %d  %d  \n" , 정수10 , 정수11 , 정수12 , 정수13 );
		
		
	} // m d

} // c d
