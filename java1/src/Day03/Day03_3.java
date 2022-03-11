package Day03;

import java.util.Scanner;

public class Day03_3 { //cs
		public static void main(String[] args) { // m s
		
			Scanner sc = new Scanner(System.in);
		
			System.out.println(" 아이디와 비밀번호를 입력하시오 ");
		
			System.out.println( "아이디 : "); String 아이디 =  sc.next();
		
			//1. String 클래스 사용하면 문자열 저장가능
			//2. char 배열/리스트 사용하면 가능
		System.out.println( "비밀번호 : "); int 비밀번호 = sc.nextInt();
		
//		if( id == "redpyg"){" 비밀번호를 입력하시오 ." };
//			//입력한 id가 admin 이면
//		
//			if(pw == 1234 ){" 로그인에 성공하였습니다. "};
//				// 입력한 pw1234이면        문자열은  연산자가 안된다 
		boolean 로그인성공 = false;
			// boolean true 혹은 false만 저장 : 로그인 성공 여부를 알기위해
		if( 아이디.equals("redpyg")) { // ifs 
		//입력한 id가 admin 이면
	
		if(비밀번호==1234 ) System.out.println(" 로그인에 성공하였습니다. "); }
			// 입력한 pw1234이면}
		
		else { System.out.println("로그인 정보가 맞지않습니다. "); 
		
		}
		
		} //ifd
				
		
		
			
		
		

		
 
	
} // m d
} //cd
