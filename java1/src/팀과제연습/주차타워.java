package ����������;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ����Ÿ�� { 

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) { // m s
		
		
		

				
		while(true) { // while s
			try {
				
			
//			��Ʈ�ѷ�.�ҷ�����(); //�������� ����
			
			System.out.println("����Ÿ�� ���α׷��Դϴ�.");
			System.out.println("1.���� 2.���� 3.���� ");
			System.out.println("�˸�))��ȣ�� �����ϼ���:");
			int ch =scanner.nextInt();
			
			if(ch==3) {
				System.out.println("�̿����ּż� �����մϴ�");
			break;
			}else if(ch==1) {
				System.out.println("���� ���� �޴�");
				System.out.println("1.���� 2. ����"); int ch2 = scanner.nextInt();
					if(ch2==2) {
						System.out.println("������ �����մϴ�.");
					}else if(ch2==1) {
						System.out.println("������ȣ4�ڸ� : "); int ������ȣ = scanner.nextInt();
						System.out.println("�԰�ð� ��)1��13��09��:011309");
						System.out.println("�����԰�ð�6�ڸ�: "); int �����ð� = scanner.nextInt();
						System.out.println("������ �԰�Ǿ����ϴ�.");
					
						��Ʈ�ѷ�.write(������ȣ, �����ð�); //������������޼ҵ� �μ�����
					}
			
			} else if(ch==2) {
				System.out.println("���� ���� �޴� ");
				//������ �����ߴ� ���� ��ȣ, ���ð��Է� ,011309
			}else {
				System.out.println("�߸��� �����Է��Դϴ�."); 
			}
			} catch (Exception e) { System.err.println( " �����Դϴ� �����ڿ��� �����ϼ���");
				// TODO: handle exception
			}
			
			
		
		
		} // w d

			
			
	} // m d
	
	
} // c s
	
	
	



	
	


