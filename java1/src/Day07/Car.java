package Day07;

public class Car {
	//Ŭ���� ����
	
	//1. �ʵ�
	
	int gas; // ��������
	
	//2. ������
	
		// ������ ������ �⺻ ������
	
	
	//3. �޼ҵ�
	 	// 1. gas�� �ܺηκ��� �޾Ƽ� ���ο� gas �����ϴ� �޼ҵ� ����
	
	void setGas( int gas) { //�μ�o ��ȯx
//	����x �޼ҵ��(�μ�1) 	  { ���κ���=�ܺκ���}
		this.gas = gas;
//		���κ����� �ܺκ����� �̸��� �����Ҷ� �����ϴ� ���
		//this.�ʵ�� : ���� ( ���� �����ִ� Ŭ���� ����) ������ ����Ҽ�����
	}
		// 2. ���κ��� gas�� ������Ȯ�� [0=�������� false // 1<= �����ִ� true]
	boolean isLeftGas() { //�μ�x ��ȯo
//		����ȯ �޼ҵ��()
		if( gas ==0 ) {
			System.out.println("gas�� �����ϴ�. ");
			return false; // ���κ����� gas�� 0�̸� false��ȯ 
			
		}
		else {
			System.out.println("gas�� �ֽ��ϴ� ");
			return true;
		}
		
		
	}
	
	
	void run() {
		while(true) {
			if(gas > 0 ) { 
				System.out.println("(�޸��ϴ�" + gas +")");
				gas--;
			}
			else {
				System.out.println("����ϴ�( gas�ܷ�: "+ gas + ")" );
				return;
			}
			
					
			
			
		}
	}

}
