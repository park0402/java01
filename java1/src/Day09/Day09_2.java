package Day09;

public class Day09_2 {
	
	public static void main(String[] args) {
		//상속
		//부모에게 물려받는것
		//현실: 부모-> 자식선택 // 프로그래밍은 자식이 부모를 선택한다
		//extends 연장하다 : 목적 빠른설계 (기존에 있던 클래스를 연장해서 새로운 클래서 설계)
		//
		
		//p.290~292 예제 
		//1. 서브클래스로 객체 생성
		DmbCellphone dmbCellphone = new DmbCellphone("자바폰", "검정", 10);
						
						
						
		//2. 서브클래스로 만들어진 객체로 슈퍼클래스내 멤버 접근
		System.out.println(" 모델 : " + dmbCellphone.model );
		System.out.println(" 색상 : " + dmbCellphone.color );
		// 3. 서브클래스로 만들어진 객체로 본인 멤버 접근
		System.out.println(" 채널 : " + dmbCellphone.channel );
		// 4. 서브클래스로 만들어진 객체로 슈퍼클래스 내 멤버[메소드] 접근
		dmbCellphone.powerOn(); // 슈퍼클래스내 선언된 메소드 [ 호출 가능 ]
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요");
		dmbCellphone.receiveVoice("안녕하세요! 저는 홍길동입니다.");
		dmbCellphone.sendVoice("아~~ 예 반갑니다.");
		dmbCellphone.hangUp();
		
		// 5, 서브클래스로 만들어진 객체로 본인 멤버 접근
				
		dmbCellphone.turnOffDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();
						
						
						
	}

}
