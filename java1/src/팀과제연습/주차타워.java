package ����������;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class ����Ÿ�� {  //�ڿ����ۼ�

	static String ������Ȳ[] = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]",
			"[ ]","[ ]","[ ]","[ ]"};
	static ArrayList<��������> ��������Ʈ= new ArrayList<��������>();


	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) { // m s
		
		
	
		while(true) { // 
			try {
				int i = 0;
				for(String tmep : ������Ȳ) {
					System.out.print(tmep);
					if(i % 4 == 3) {
						System.out.println();
					}
					i++;
				}
			
			System.out.println("1.���� 2.���� 3.���� "); 
			System.out.println("�˸�))��ȣ�� �����ϼ���:"); int ch =scanner.nextInt();
			if(ch==1) {
						System.out.println("���� ���� �޴�");
						System.out.println("������ȣ4�ڸ� : "); String ������ȣ1 = scanner.next();
						System.out.println("0~3 1�� 4~7 2�� 8~11 3�� 0~9");
						System.out.println("������ġ 0~9 ���� : "); int index = scanner.nextInt();
							
						if(������Ȳ[index] == "[ ]") { // ���ε����� ������;
							�������� ������ü = new ��������(); 
							������ü.�������(������ȣ1,index);
							
							System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						}else {//�ƴϸ�
							System.out.println("���������� �����Ǿ� �ֽ��ϴ�");

						}
						
					} else if(ch==2) {
				System.out.println("���� ���� �޴� ");
			}else if(ch == 3) {
				System.out.println("���� ����");
				System.out.print("�⵵ �Է�: "); int �� = scanner.nextInt();
				System.out.print("�� �Է�: "); int �� = scanner.nextInt();
//				��������.����(��, ��);
			}
			else {
				System.out.println("�߸��� �����Է��Դϴ�."); 
			}
			} catch (Exception e) { System.err.println( " �����Դϴ� �����ڿ��� �����ϼ���");
				// TODO: handle exception
			}
			
			
		
		
		} // w d

			
			
	} // m d
	
	
} // c s
	
	
	



