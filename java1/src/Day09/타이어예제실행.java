package Day09;

public class Ÿ�̾������ {
	public static void main(String[] args) {
	
		
	Car mycar = new Car();
	//Ŭ���� �� Ÿ�̾� ��ü�� 4�� -> mycar ����
	
	for (int i = 1 ;i<=5;i++) {
		int problemLocation =  mycar.run();  
			
		switch(problemLocation) {
				case 1 :
					System.out.println("�տ��� �ѱ�Ÿ�̾� ��ü");
					mycar.frontLeftTire = new �ѱ�Ÿ�̾�("�տ���", 15);
						break;
						// ���� Ŭ���� ��ü�� = new ����Ŭ����();
						// ����� ������ ����!!
						//break; swich Ż��
						
				case 2 :
					System.out.println("�� ������ ��ȣŸ�̾� ��ü ");
					mycar.frontRightTire = new ��ȣŸ�̾�("�տ�����",13);
					break;
				case 3 :
					System.out.println("�ڿ��� �ѱ�Ÿ�̾� ��ü");
					mycar.backLeftTire = new �ѱ�Ÿ�̾�("�� ����", 14);
					break;
				case 4 :
					System.out.println("�� ������ ��ȣŸ�̾� ��ü");
					mycar.backRightTire = new ��ȣŸ�̾� ("�� ������",17);
					break;
			
		}
		
		System.out.println("-------------------------------");
	}
		
		
	}
}
