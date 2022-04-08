package Day09;

public class People { // 클래스선언
	
	//1. 필드
	
	public String name;
	// 접근 제한자 자료형 변수명 ;
	public String Ssn;
	
	
//	2. 생성자
	public People (String name , String Ssn , int studentNo) {
		super(); //생략가능
		this.name = name;
		this.Ssn = Ssn;
	}
	
//  3. 메소드
}
