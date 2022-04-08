package Day09;

public class 한국타이어 extends Tire{
	
	
	public 한국타이어 (String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation<maxRotation) {
			System.out.println(location+ " 한국타이어 수명: "+ (maxRotation-accumulatedRotation)+"회");
			return true;
			
		}else {
			System.out.println("***"+location+"한국타이어 펑크 **");
			return false;
		}
	}

}
