package Day07;

public class Day07_1 { // c s
	public static void main(String[] args) { // m s
		
	
	
	// �޼ҵ� ȣ����
		// 1. �޼ҵ尡 �����ϴ� Ŭ������ ��ü�ʿ�
		// 2. ��ü��.�޼ҵ��()
			// . : ���ٿ����� (�ʵ峪 �޼ҵ� ȣ���)
		
	
	// 1. ��ü ���� 
		Calculator myCalc = new Calculator();
	//Ŭ������   ��ü��[�̸�] = �޸��Ҵ� ������();
		
	
	// 2. �޼ҵ� ȣ��
		myCalc.powerOn();
		
	// 3. �޼ҵ� ȣ�� [�μ�2��]
		int result1 =myCalc.plus(5, 6);
		//* plus �޼ҵ忡 5�� 6 �����Ŀ�
		//* 11�̶�� ����� �޾Ƽ� 
		
		System.out.println("5�� 6���ϸ� " + result1 );
		
		int x = 10;
		int y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("10�� 4 ������ " + result2);
		
	// 4. �޼ҵ� ȣ�� [ �μ� x ]
		
	   myCalc.powerOff();
		
		
	} // m e

} // c e
