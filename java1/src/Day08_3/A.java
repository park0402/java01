package Day08_3;

public class A {
//전범위 클래스 선언 A
	
	// 1.필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	public int field1;
	
	int field2 ; 
	
	private int field3;
	
	
	// 2. 생성자
	
	public A(boolean b) {
		field1 =1;
		field2 =1;
		field3 =1;
		
		method1();
		method2();
		method3();
	} //전범위
	A(int b){} // 현 패키지 내
	private A (String s) {} //현클래스 내
	
	// 3. 메소드
	
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	
}
