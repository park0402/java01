package Day07;

public class Day07_4 {
	
	// p.229 : �ܺ� ȣ��
	
	public static void main(String[] args) {
		
		
		// 1. ****��ü ���� ****
		
		Car2 myCar = new Car2();
		
		// 2. �ڵ��� �õ� �ɸ� 
		myCar.keyTurnOn(); //�μ� ��ȯx
		
		// 3. �ڵ��� ���� �޼ҵ� ȣ��
		
		myCar.run();
		
		// 4. ���ǵ� ���� �޼ҵ� ȣ�� 
		
		int speed= myCar.getSpeed();
		System.out.println("����ӵ�: " + speed + "km/h");
	}
}
