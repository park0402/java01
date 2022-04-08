package Day09;

public class Computer extends Calculator {
								//서브클래스 extends 슈퍼클래스 
	
	// 1.필드
	// 2.생성자
	// 3.메소드
		// *오버라딩 [부모클래스내 메소드 재정의(수정)]
		//ctrl+스페이스바 
	@Override //생략가능
	double areaCircle(double r) {
		// TODO Auto-generated method stub
	
		System.out.println("Computer 객체의 areaCircle");
		return Math.PI*r*r;
		
	}

}
