package ��;

import java.util.Scanner;

public class ����ǥ���� {
	// ����ǥ �׽� ���
	//�޴� 1��. �л����� �߰� 2. ���� ���� 
	//Ű����� �Է¹޾� [�迭]�� ����
	// �����Է� 5�������� �ִ� 100���������ϰ�
	//��ȣ �̸� ���� ���� ���� ���� ���
	//��� �Ҽ��� 2�ڸ�����
	// ���� �̿��� ���� ����
	// ����ó�� 
	
	//1. main �ۿ� �迭 ����
	//2. ���� - ���ѷ��� ���� 
	
	public static void main(String[] args) {
		�л�[] �л��迭 = new �л�[100];
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("1. �л���� 2. �л� ����"); 
				int ch = scanner.nextInt();
				if(ch == 1) {System.out.println("�л������� ����մϴ�");
				����ǥ��Ʈ�ѷ� ��Ʈ�� = new ����ǥ��Ʈ�ѷ�();
				System.out.println("�̸�: "); String �̸� = scanner.next();
				System.out.println("��������: "); int ���� = scanner.nextInt();
				System.out.println("��������: "); int ���� = scanner.nextInt();
				System.out.println("��������: "); int ���� = scanner.nextInt();
				String �л�������� = ��Ʈ��.�л����(�̸�,����,����,����);
				
				
				
				}
				
			
			}catch(Exception e) {}
		}
			
		
	}
	
	
	
	
}
