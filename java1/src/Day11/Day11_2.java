package Day11;

import java.util.Scanner;

public class Day11_2 {
	//p.422 
		// ��ǻ���� �ϵ���� ���� ���� [�ذ�Ұ�]
		// ������� �߸��� ���� or �������� �߸��� �ڵ��� ������ ����
		//���� : 1. �Ϲݿ��� 2. ���࿹�� 
			// �Ϲݿ��� : ������(����) ���� ���� �˻� [�����ڿ��� ���� ����ó�� :�ƿ������̺Ұ����ϴϱ� (������)]
			// ���࿹�� : ������(����) �Ŀ� ���� �˻�	[�������� ������ �Ǵ��ؼ� ����ó��]
		//����ó��
			// ����: ������ �߻��ϸ� ���α׷��� ����ȴ� [�������� ������ �����]
			// ������ �߻� �ϴ��� ��ü �ڵ带 �ִ°� 
	/* �����
	 * try{
	 *	���ܰ� �߻��ҰͰ��� �ڵ� ����
	 * }catch(����Ŭ���� ��ü��) {
	 *	���࿡ ���ܰ� �߻��ϸ� ����Ǵ� �ڵ� 
	 * } 
	 */
	
	
	
	public static void main(String[] args) {
		// p.423
		try{
			String data = null;
			System.out.println( data.toString() );  
			//Object Ŭ���� �޼ҵ� : toSpring() : ��ü�������
			//���������� ������ ���� -> �����Ŀ� ���ܻ���°��� ���࿹�ܶ��Ѵ�
			//������ �߻��ϴ����� :  null �� �޸� �Ҵ��� ���� ������ ��ü���� ��� �Ұ���
		}
		catch(NullPointerException ��ü��) {
			//����ó�� 
			System.out.println("���ܹ߻�: "+ ��ü��);
		}
		
		try {
		String[]�迭 = new String[2]; // String 2���� �����Ҽ� �ִ� �迭
		�迭[0] = "a" ; �迭 [1] = "b"; �迭[2] ="c"; //2���� �ʰ�
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻�: " + e);
			
		// p.426
		try {
		String	data1 = "100";
		String	data2 = "a100";
		int value1 = Integer.parseInt(data1);// "100"-> 100
		int value2 = Integer.parseInt(data2);//"a100" -> a�� ������ �Ұ����ϴ�
							//Integer.parseInt(���ڿ�_): ���ڿ� ->����
		//���� �߻����� : ���ڿ��� ���������� ��ȯ�̰���������// ���������� ��ȯ�� �Ұ����ϴ�
		int result = value1 + value2 ;
		System.out.println(data1+"+"+data2+result);
		//������ �߻����ϸ� int�� �߻��ϸ� catch�� �̵�
		}catch(NumberFormatException f) {
			System.out.println("���ܹ߻�:"+f);
		}
		}
		try {
		String ���ڿ� = "���缮"; 	//�ڹ� Ŭ������ �ϳ� [ object ���]
		Object ���۰�ü; 			// �ڹ� Ŭ������ �ֻ��� Ŭ����
		
		���۰�ü = ���ڿ� ; 			//�ڽ� --> �θ� ����
		���ڿ� = (String) ���۰�ü; 	//�θ� --> �ڽ� �Ұ���
				//��������ȯ
				//�����߿� ����ȯ

		}catch(Exception g) {
			System.out.println("���� �߻�: " + g);
		}
	}
}
