package Day09;

public class �ѱ�Ÿ�̾� extends Tire{
	
	
	public �ѱ�Ÿ�̾� (String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation<maxRotation) {
			System.out.println(location+ " �ѱ�Ÿ�̾� ����: "+ (maxRotation-accumulatedRotation)+"ȸ");
			return true;
			
		}else {
			System.out.println("***"+location+"�ѱ�Ÿ�̾� ��ũ **");
			return false;
		}
	}

}
