package Day07;

public class Calculator {
	
	// 1. �ʵ�
	
	
	// 2. ������
	
	
	// 3. �޼ҵ�
	void powerOn() { //1. �μ�x ��ȯx
		System.out.println("������ �մϴ�.");
		//  return; �Լ�����
		// System.out.println("������ �մϴ�.");
	} 
	//1. void : ����Ÿ�� 
		//void : ������� �������� �ʴ� �Լ� void �� : ��ȿ�� 
			//return ; �������� why? void�� ������̾�� [ ��, ����� �߰��� ���� �Լ�����]
	//2. powerOn : �޼ҵ��̸�[�ƹ��ų�]
	//3. (�Ű�����[�μ�]) : �Լ��� ������ ������
	//4. {�����ڵ�} : �Լ� �����
	
	int plus( int x, int y) {
		
		int result = x+y;
		return result;
		
	// 1. int : ����Ÿ�� // �Լ��� ����Ǹ鼭 int�� �����Ͱ� ��ȯ
		// 5. return ��ȯ��;
			//����Ÿ���� int �̱⶧���� return ���� ������ int�� ������
		
	// 2. plus : �޼ҵ��̸� [�ƹ��ų�]
	// 3. (int x , int y) : int�� 2�� �Ű����� �ޱ�
		// �Լ�ȣ��� �Լ��� ������ x�� y�� int ������ �ޱ�
	// 4. {�����}
	}
	
	double divide ( int x , int y) { // �μ� o ��ȯ x 
// ����Ÿ��   �޼ҵ�� ( �μ�1�� ,  �μ�2��) { �����ڵ� ; return �Ǽ�������		
		
		double result = (double)x / (double)y;
			//(�ڷ���) ������) : ��������ȯ
				// int������ -> double ���泪����� �Ҽ����� ���� �� �ֱ� ������
		return result; //����� ------> �޼ҵ� ȣ���ߴ� ������ �̵�
		
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	
}
