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
			//��Ʈ�ѷ� �޼ҵ� ȣ��� ��ü
			������Ʈ�ѷ� ��Ʈ�� = new ������Ʈ�ѷ�();
			if(���� == 1) {
				//�Է�
				System.out.println("+++ ���µ�� ������+++");
				System.out.println("��й�ȣ:"); String ��й�ȣ = sc.next();
				System.out.println("������"); String ������ = sc.next();
				System.out.println("���༱�� : 1. ���� 2. ���� 3. �ϳ�"); 
				int �����ȣ = sc.nextInt();
				//��Ʈ�ѷ� ����
			Boolean result = ��Ʈ��.���»���(��й�ȣ, ������, �����ȣ);
			if(result) {
				System.out.println("���� ����");
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
