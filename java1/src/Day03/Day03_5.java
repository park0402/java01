package Day03;

import java.util.Scanner;

public class Day03_5 { // c s
	
	public static void main(String[] args) { // m s
		
	Scanner scanner = new Scanner(System.in);
		
	
	
	// ��� : 1. if�� 2.swich��
	
	// if : ���˻�(true Ȥ�� false) / ����Ǽ� ������ ���� �ʴ°�� ex) >= > < ==!= ��
	
	// swich : �����Ͱ˻� / ����Ǽ� �������ִ� ���
	// ����
		//swich( �˻��� ){
	 		// case '��' : ���๮;
	 		// case '��' : ���๮;
			// case '��' : ���๮;
			// default : ���๮;
			//}
	//�� 1) ������ 90���̸� A 80���̸� B 70���� C �׿� Ż��
		int ���� = 80;
		if(����==90)System.out.println("A���");
		else if(����==80)System.out.println("B���");
		else if(����==70)System.out.println("C���");
		else System.out.println("Ż��");
		
		switch ( ���� ) {
		
		case 90 : System.out.println("A���"); break;
		case 80 : System.out.println("B���"); break;
		case 70 : System.out.println("C���"); break;
		default : System.out.println("Ż��"); break;}
		
		// swich�� ��� case�� �����Ų�� �׷��� ������ ������� �Ѵ� 
		
		// break; : ���� ����� swich Ȥ�� �ݺ����� Ż�� 
		
	// �� 2) 
		int ��ư = 3 ; 
		
		switch(��ư) {
		 case 1: System.out.println("1������ �̵�"); break;
		 case 2: System.out.println("2������ �̵�"); break;
		 case 3: System.out.println("3������ �̵�"); break;
		 case 4: System.out.println("4������ �̵�"); break;
		 default:System.out.println(" ���� "); break;
		}
		
		char ��� ='B';
		
		switch( ��� ) {
		 case 'A':
		 case 'B':System.out.println("���ȸ��");break; //���๮�� �����Ѱ�� A,B ��� ȸ���� ��� ����� ��� ����� 
		 case 'C':
		 case 'D':System.out.println("�Ϲ�ȸ��");break;
		 
		 default:System.out.println(" ���� ");break;
		}
		
 //����1) ������ �Է¹޾� ����� 90�� �̻��̸� A 80�� �̻��̸� B��� ������ Ż��
		System.out.println("���� : "); int ���� = scanner.nextInt();
		System.out.println("���� : "); int ���� = scanner.nextInt();
		System.out.println("���� : "); int ���� = scanner.nextInt();
		int ��� = (����+����+����)/3;
		
		switch (���/10) { //����� �ܼ������� ��Ÿ�������ؼ� ��: 84/10 =8 10 9 8 7 �� �ܼ� ���ڷ� ���� 
			case 10 :
			case 9 : System.out.println("A����Դϴ�."); break;
			case 8 : System.out.println("B����Դϴ�."); break;
			default : System.out.println("�����Դϴ� "); }
	
		
		
	} // m d
} // c d
