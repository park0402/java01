package Day01;

import java.util.Scanner;

public class 문제1 { // c s
	public static void main(String[] args) { // m s
		
		Scanner 입력객체 = new Scanner(System.in);
		
		
		System.out.print(" 아이디 : "); String id = 입력객체.next();
		System.out.print(" 비밀번호 : "); String password = 입력객체.next();
		System.out.print(" 성명 : "); String name = 입력객체.next();
		System.out.print(" 이메일 : "); String emailaddress = 입력객체.next();
		
		System.out.println(">>>>>>>>>회원가입 완료 아래 정보를 확인해주세요<<<<<<<<");
		System.out.println("아이디\t비밀번호\t성명\t이메일\t");
		System.out.println( id +"\t"+ password + "\t"+name + "\t"+emailaddress);
		
		
		
	
	} // m d

} // c d
