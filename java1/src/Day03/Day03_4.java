package Day03;

import java.util.Scanner;

public class Day03_4 { // c s
	
	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������� : "); int ���� = scanner.nextInt();
		System.out.println("�������� : "); int ���� = scanner.nextInt();
		System.out.println("�������� : "); int ���� = scanner.nextInt();
		
		int ��� = (����+����+����)/3;
		
		if(���>=90) { //���90���̻��̸�
			
		if( ����==100)	System.out.println("������ ");
		if( ����==100)	System.out.println("������ ");
		if( ����==100)	System.out.println("���п�� ");
		}
		
		else if(��� >=80 ) {//���80�� �̻��̸� 
		if( ����>=90)	System.out.println("������� ");
		if( ����>=90)	System.out.println("������� ");
		if( ����>=90)	System.out.println("������� ");
		}
		
		else { System.out.println("����� �����Դϴ�. ");}
		
	}	 // m d

} // c d
