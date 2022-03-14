package Day09;

public class Student extends People{
		// 서브클래스	extends 슈퍼클래스
	
	// 1. 필드
	public int studnetNo; //학생번호
	
	// 2. 생성자
	public Student( String name
			, String Ssn
			, int studentNo) {
		// 부모클래스내 멤버 필드초기화 [값넣기]
//		1.필드에접근하는 방법
//		this.name = name;
//		this.Ssn = Ssn;
//		2.생성자에 접근하는 방법
		super(name, Ssn, studentNo);
		this.studnetNo = studentNo;
	}
	
	
	// 3. 메소드 
	
	

}
