package Day09;

public class Day09_4 {
	
	public static void main(String[] args) {
		// @Override : ������
		// ���� ������ �μ��� �޼ҵ���� ����Ҽ����� 
		// ����: ������ �޼ҵ带 ������ [ ����] / ��ӹ޾����� �����ϰ�������
		
			int r = 10;
			// 1.  ����Ŭ������ ��ü����
			Calculator calculator = new Calculator();
			
			System.out.println("������: " + calculator.areaCircle(r));
			
			Calculator computer = new Computer();
			System.out.println("������:" +computer.areaCircle(r));
		
	}

}
