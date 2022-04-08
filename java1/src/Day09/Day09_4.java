package Day09;

public class Day09_4 {
	
	public static void main(String[] args) {
		// @Override : 재정의
		// 원래 동일한 인수와 메소드명을 사용할수없음 
		// 목적: 동일한 메소드를 재정의 [ 수정] / 상속받았지만 수정하고싶을경우
		
			int r = 10;
			// 1.  슈퍼클래스로 객체생성
			Calculator calculator = new Calculator();
			
			System.out.println("원면적: " + calculator.areaCircle(r));
			
			Calculator computer = new Computer();
			System.out.println("원면적:" +computer.areaCircle(r));
		
	}

}
