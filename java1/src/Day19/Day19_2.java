package Day19;

import java.util.HashSet;
import java.util.Scanner;

public class Day19_2 {
	public static void main(String[] args) {
		// 로또 프로그램
		//set 컬렉션
		Scanner sc = new Scanner(System.in); // 1. 입력객체
		HashSet<Integer> set = new HashSet<>(); //2. set 컬렉션 HashSet 클래스 객체선언
		while(true) {
			System.out.println("1~45 숫자선택 (중복불가): ");
			int num = sc.nextInt(); 
			
			if(num<1 || num >45) {
				System.out.println("선택할수 없는번호입니다");
			} else {
			System.out.println();
	
			}
		
		}
	}
}
