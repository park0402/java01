package Day09;

public class ��ȣŸ�̾� extends Tire{
	
	
	
	public ��ȣŸ�̾� (String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation<maxRotation) {
			System.out.println(location+ " ��ȣŸ�̾� ����: "+ (maxRotation-accumulatedRotation)+"ȸ");
			return true;
			
		}else {
			System.out.println("***"+location+"��ȣŸ�̾� ��ũ **");
			return false;
		}
	}
	
	

}
