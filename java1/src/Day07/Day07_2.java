package Day07;

public class Day07_2 {
	
	public static void main(String[] args) {
		
		//p.223~22 
		
		
		// 1. ��ü ���� [�������=�⺻������]
		Car mycar = new Car();
		
		// 2. �޼ҵ� ȣ�� [�μ�1��=5]
/*1�����*/ mycar.setGas(5); /*2�� ��� mycar.gas = 5;*/ 
        // �Ȱ��� 1�� 2����� �ٻ�밡�� �ѹ��� �޼ҵ� ���ؼ� �����ϴ� ������ ���ȶ���
		

		// 3. �޼ҵ� ȣ�� [ �μ�x��ȯ=true Ȥ�� false]
		if(mycar.isLeftGas() ) {
			
			System.out.println("��� �մϴ�. ");
		// 4. �޼ҵ� ȣ��
			mycar.run();
		}
		
		//5. �޼ҵ� ȣ��
		
		if(mycar.isLeftGas()) { //Car isLeftGas() �޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�. ");
		} else {
			System.out.println("gas�� �����ϼ���. ");
		}





	}

}
