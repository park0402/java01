package Day05;

import java.util.Scanner;

public class Day05_3 {
	public static void main(String[] args) { // m s 
	// 문제7. p182. 주어진 값에서 최대값 구하기
		int max =0; 
		int[] array = {1,5,3,8,2}; // 선언 +초기값 선언
		
		for(int i = 0 ; i<array.length ; i++) { 
			//i는 0부터 배열의 길이까지 1씩증가 실행 반복처리
			if( max <array[i])max =array[i];
			// 만약에 max보다 i번째 인덱스의 값이 더크면 max에 i번쨰 값 대입
	    }
		System.out.println("max : " + max);
		
		
	// 문제8. 주어진 배열의 전체 합과 평균값 구하기 for이용	
		int[][] array2 = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0; //합계
		double avg = 0.0; //평균
		
		int count = 0; //점수의개수 [칸 개수]
		
		for(int 행 = 0 ; 행<array2.length; 행++) {
			//행은 0부터 배열의 행길이[3]미만까지 1씩증가
			for(int 열 = 0 ; 열<array2[행].length; 열++) {// 열은 0부터 배열의 열길이 [2,3,5] 미만까지 1씩증가
				sum += array2[행][열]; //누적합계
				
			}
			count += array2[행].length; // 열길이의 누적합계
					
		} 
		//풀이 
		
		avg = (double)sum /count; //강제항변환
		
		System.out.println("sum: "+ sum);
		
		System.out.println("avg: "+ avg);
		
		// 9. 키보드로 학생 수와 학생 점수 입력받기, 최고 점수및 평균점수 구하기 
		boolean run = true; //while문 스위치 변수
		int stuNum = 0; //학생수 변수
		int[]scores = null; //점수배열선언 //null; 값없음 
		Scanner sc = new Scanner(System.in);
		
		// while(true){}
		
		while(run) {
			
			System.out.println("--------------------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택: ");
			
			int selectNo =sc.nextInt();
			
			if ( selectNo == 1) { //학생수 입력받기
				System.out.print("학생수: "); stuNum = sc.nextInt();
				
				scores = new int[stuNum]; //scores 호출
			}
			else if(selectNo == 2) { //학생 점수입력받기
				for( int i = 0 ;i<scores.length; i++){
					System.out.printf("scores[%d] : " ,i );
					scores[i] = sc.nextInt(); //입력받아 i번째 인덱스에 저장
				}
				
			}
			else if(selectNo == 3) { //학생 점수 출력하기
				for( int i = 0 ;i<scores.length; i++){
					System.out.printf("scores[%d] : %d \n " , i , scores[i]);
				}
			}
			else if(selectNo == 4) {
				int 최고점수 = 0;
				int 총합계 = 0;
				double 평균점수 = 0.0;
				
				for(int i =0; i<scores.length;i++) {
					
					//최고점수 구하기
					if(max<scores[i]) 최고점수 = scores[i];
					
					//누적합계 
					총합계 += scores[i];
				}
				
				// 평균점수 구하기
				평균점수= (double)총합계 / scores.length;
				
				System.out.println("최고 점수: " + 최고점수);
				System.out.println("평균 점수: " + 평균점수);
				
			}
			else if(selectNo == 5) {
//				break; // break 를 써도 되고 run은 false다 로 선언해서 넘겨도 된다
				run = false;
			}
		}

	} // m d
}
