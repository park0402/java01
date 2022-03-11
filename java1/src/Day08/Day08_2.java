package Day08;

public class Day08_2 {
	
	public static void main(String[] args) {
		// p .245 : final
			// 최종적 / 고정값 / 사용법 1. 필드 선언시 2. 생성자에서
		
		// 1. 객체 생성
		
		Person p1 = new Person("123123-123123","계백");
		
//		p1.nation = "USA";
//		p1.ssn = "456456-455455"; 파이널 필드는 수정불가
		p1.name = " 유재석";
	}

}
