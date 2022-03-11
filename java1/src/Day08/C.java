package Day08; // A,B클래스와 패키지가 다름 

import Day08_2.B;

public class C {
	
	A a; // A클래스는 default 이기때문에 다른 클래스에서 호출 불가능
		// 다른패키지에서 호출 불가능 
	B b; //B클래스는 public 이기때문에
		// 다른패키지에서 호출 가능

}
