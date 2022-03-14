package Day09;

public class Tire { //클래스 선언 
	//1. 필드
	public int maxRotation; // 최대회전수 (타이어수명)
	public int accumulatedRotation; // 누적회전수
	public String location; // 타이어의 위치
	
	
	//2. 생성자
	public Tire(String locatin, int maxRotation) {
		this.location = locatin;
		this.maxRotation  = maxRotation;
	}
	

	
	
	//3. 메소드
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"tire 수명: "+(maxRotation-accumulatedRotation)+"회");
			 return true;
		}else {
			System.out.println("***"+location+"Tire 펑크***");
			return false;
		}
	
	}
	
}
