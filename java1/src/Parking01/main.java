package Parking01;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	static String park[] = {"[ ]","[ ]","[ ]","[ ]",
							"[ ]","[ ]","[ ]","[ ]",
							"[ ]","[ ]","[ ]","[ ]"};
	public static void main(String[] args) {
		ArrayList<tower> tow = new ArrayList<tower>();
	
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("-------------------- ���� ���α׷� [��Ȳ]---------------");
				//���� ��Ȳ ���
				for(int i = 0; i < park.length ; i++) {
						System.out.print(park[i]);
						if(i %  4 == 3) {
							System.out.println();
						}
				}						
				System.out.println("----------------------------------------------------");
				System.out.println("1.������� 2.���� 3.����Ȯ��"); int ch = sc.nextInt();// ���� �Է¹ޱ�
				
				if(ch == 1) {// �������
					System.out.println("������ȣ: "); String carNumber = sc.next();// ����ȣ �Է¹ޱ�
					System.out.println("������ ��ġ: "); int index = sc.nextInt();	// ������ġ �Է¹ޱ�
					if(park[index] == "[ ]") { // ���ε����� ������;
						tower e = new tower(); 
						e.�������(carNumber, index);
						tow.add(e);
					}else {//�ƴϸ�
						System.out.println("�̹������Ǿ� �ֽ��ϴ�");
					}
										
				}else if(ch == 2) {	// ���ڵ��
					
				}else if(ch == 3) { // ����Ȯ��
					
				}else { // �׿�
					System.out.println("����)) �˼����� �ൿ");
				}
			}catch(Exception e) {
				System.out.println("����)) ������ ȣ�� ���" + e);
			}//���ܹ� ����
		}// while�� ����
		
		}
	
}