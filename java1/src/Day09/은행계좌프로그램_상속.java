package Day09;

import java.util.Scanner;


public class ����������α׷�_��� {
	//���� ���� ���α׷� [���]
		//�������� , ��������, �ϳ�����
	// �� ���: 1.���� ���� 2. �Ա� 3. ��� 4. ��ü 5. �� ���� ���
	//**  main �ۿ��� �����ϴ� ����
	// ��� Ŭ�������� ����ϱ� ���� static �迭�� ����
	// static ������ ���α׷� ���۽� �޸� �Ҵ� -> ���α׷� ����� �޸� �ʱ�ȭ 
	//
	public static ����[] ���¸���Ʈ = new ����[100];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------���½ý���------");
			System.out.println("1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���¸�� 6. ����");
			int ���� = sc.nextInt();
			
			������Ʈ�ѷ� ��Ʈ�� = new ������Ʈ�ѷ�(); //��Ʈ�ѷ� �޼ҵ� ȣ��� ��ü
			if(���� == 1) {
				//�Է�
				System.out.println("+++ ���µ�� ������+++");
				System.out.println("��й�ȣ:"); String ��й�ȣ = sc.next();
				System.out.println("������"); String ������ = sc.next();
				System.out.println("���༱�� : 1. ���� 2. ���� 3. �ϳ�"); 
				int �����ȣ = sc.nextInt();
				//��Ʈ�ѷ� ����
			String ���¹�ȣ = ��Ʈ��.���»���(��й�ȣ, ������, �����ȣ);
				//�޼ҵ� ��ȯ ���� =���¹�ȣ Ȥ�� null
				//�޼ҵ� ���� �� �޼��� ���
			if(���¹�ȣ !=null) {///���¹�ȣ�� null  �ƴϸ�
				System.out.println("���� ����");
				System.out.println("������ ���¹�ȣ"+ ���¹�ȣ);
			}else {
				System.out.println("���µ�� ����");
			}
			
			}else if(���� ==2) {
				System.out.println("+++�Ա� ������+++");
				}
			else if(���� ==3) {
				System.out.println("+++��� ������+++");
			
				}
			else if(���� ==4) {
				System.out.println("+++��ü ������+++");
				}
			else if(���� ==5) {
				System.out.println("+++���¸�� ������+++");
				System.out.println("������: "); String ������ = sc.next();
				 ��Ʈ��.���¸��(������);
				}
			else if (���� ==6 ) {
				System.out.println("+++���� ������+++");
				}
			else {
				System.out.println("�˸�))�˼����� ��ȣ�Դϴ�.");
			}
			
				
			
		}	
	}
}
