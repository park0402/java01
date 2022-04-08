package Day09;

public class 금호타이어 extends Tire{
	
	
	
	public 금호타이어 (String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation<maxRotation) {
			System.out.println(location+ " 금호타이어 수명: "+ (maxRotation-accumulatedRotation)+"회");
			return true;
			
		}else {
			System.out.println("***"+location+"금호타이어 펑크 **");
			return false;
		}
	}
	
	

}
