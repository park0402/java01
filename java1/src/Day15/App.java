package Day15;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		while(true) {
			System.out.println( "1.���� 2. ����"); int ch = sc.nextInt();
			if(ch==1) {
				System.out.println("������ȣ:");String ������ȣ = sc.next();
				//������ȣ ��Ʈ�ѳ� �޼ҵ忡�� �ѱ��
				// �޼ҵ� ����� �������
			boolean	��� = Controller.����(null);
			}
			else if (ch==2) {
				System.out.println("������ȣ:");String ������ȣ = sc.next();
				//������ȣ ��Ʈ�ѳ� �޼ҵ忡�� �ѱ��
				// �޼ҵ� ����� �������
			boolean	��� = Controller.����(null);
				
			}
			else { System.out.println("�߸��� �Է��Դϴ�.");
			
			}
			
			
		}
	}

}
