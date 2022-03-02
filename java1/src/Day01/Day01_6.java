package Day01;

import java.util.Scanner;

public class 문제2 { // c s
	public static void main(String[] args) { // m s
		
		Scanner 입력객체 = new Scanner(System.in);
		
		System.out.println("순번 : "); String number=입력객체.next();
		System.out.println("작성자 : "); String name=입력객체.next();
		System.out.println("내용 :  "); String what=입력객체.next();
		System.out.println("날짜 : "); String date=입력객체.next();
		
		System.out.println("*--------------방문록----------------");
		System.out.println("*|순번|작성자|\t내용\t|날짜");
		System.out.println("*|"+number+"|"+name+"|"+what+"\t\t|"+date);
		
	
		
	} // m d

} // c d
