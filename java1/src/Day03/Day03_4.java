package Day03;

import java.util.Scanner;

public class Day03_4 { // c s
	
	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수 : "); int 국어 = scanner.nextInt();
		System.out.println("영어점수 : "); int 영어 = scanner.nextInt();
		System.out.println("수학점수 : "); int 수학 = scanner.nextInt();
		
		int 평균 = (국어+영어+수학)/3;
		
		if(평균>=90) { //평균90점이상이면
			
		if( 국어==100)	System.out.println("국어우수 ");
		if( 영어==100)	System.out.println("영어우수 ");
		if( 수학==100)	System.out.println("수학우수 ");
		}
		
		else if(평균 >=80 ) {//평균80점 이상이면 
		if( 국어>=90)	System.out.println("국어장려 ");
		if( 영어>=90)	System.out.println("영어장려 ");
		if( 수학>=90)	System.out.println("수학장려 ");
		}
		
		else { System.out.println("재시험 과락입니다. ");}
		
	}	 // m d

} // c d
