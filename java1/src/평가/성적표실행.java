package 평가;

import java.util.Scanner;

public class 성적표실행 {
	// 성적표 항시 출력
	//메뉴 1번. 학생점수 추가 2. 점수 삭제 
	//키보드로 입력받아 [배열]에 저장
	// 성적입력 5명이지만 최대 100까지가능하게
	//번호 이름 국어 영어 수학 총점 평균
	//평균 소숫점 2자리까지
	// 총점 이용해 석차 정렬
	// 예외처리 
	
	//1. main 밖에 배열 선언
	//2. 메인 - 무한루프 시작 
	
	public static void main(String[] args) {
		학생[] 학생배열 = new 학생[100];
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("1. 학생등록 2. 학생 삭제"); 
				int ch = scanner.nextInt();
				if(ch == 1) {System.out.println("학생점수를 등록합니다");
				성적표컨트롤러 컨트롤 = new 성적표컨트롤러();
				System.out.println("이름: "); String 이름 = scanner.next();
				System.out.println("국어점수: "); int 국어 = scanner.nextInt();
				System.out.println("영어점수: "); int 영어 = scanner.nextInt();
				System.out.println("수학점수: "); int 수학 = scanner.nextInt();
				String 학생점수목록 = 컨트롤.학생등록(이름,국어,영어,수학);
				
				
				
				}
				
			
			}catch(Exception e) {}
		}
			
		
	}
	
	
	
	
}
