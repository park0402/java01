package Day04;

import java.util.Random;
import java.util.Scanner;

public class 뭐먹지 { // cs
	public static void main(String[] args) { //ms
		
	// 1. 사용자가 번호를 선택
	// 2. 뭐먹지(컴퓨터)는 무작위수 선택시 랜덤 선택
	// 3.
		int 사용자;
		int 뭐먹지;
	
		Scanner scanner = new Scanner(System.in);
		
		while(true) { // w s
			System.out.println("________뭐먹을지 알려드립니다.________");
			System.out.println("아무 숫자나 입력하세요 ");
			사용자= scanner.nextInt();
			System.out.println("선택한번호 : "+사용자);
			
			
			System.out.println("----------------------------");
			System.out.println("----------------------------");
			System.out.println("----------------------------");
			System.out.println("----------------------------");
			
			
			Random random = new Random(); 
			뭐먹지 = random.nextInt(4); 
			
			
			
			switch(뭐먹지){
			case 0 : System.out.println("굶으세요 "); break;
			case 1 : System.out.println("돈까스"); break; 
			case 2 : System.out.println("국밥"); break; 
			case 3 : System.out.println("김밥"); break; 
		    case 4 : System.out.println("햄버거"); }break; 
			
			
			
			
			
			
			
		} // w d
		
	} //md

} //cd