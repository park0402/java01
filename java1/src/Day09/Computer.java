package Day09;

public class Computer extends Calculator {
								//����Ŭ���� extends ����Ŭ���� 
	
	// 1.�ʵ�
	// 2.������
	// 3.�޼ҵ�
		// *������� [�θ�Ŭ������ �޼ҵ� ������(����)]
		//ctrl+�����̽��� 
	@Override //��������
	double areaCircle(double r) {
		// TODO Auto-generated method stub
	
		System.out.println("Computer ��ü�� areaCircle");
		return Math.PI*r*r;
		
	}

}
