package Day03;

import java.util.Scanner;

public class Day03_2 { //c s
	public static void main(String[] args) { // m s
		
		// �Է°�ü = {} �� 1�� ����
		Scanner scanner = new Scanner(System.in);

		System.out.println("����1 : 2���� ������ �Է¹޾Ƽ� �� ū����?");
		
		System.out.println("����1�Է�: ");
		
		int ����1 = scanner.nextInt();
		// int�� ���� �����ϰ� �Է¹��� ���� ������ �����ͼ� ����.
		System.out.println("����2�Է�: ");
		int ����2 = scanner.nextInt();
		
		//���� 
		if (����1 > ����2)//���࿡ �Է¹��� ����1������ ����2���� ũ�� ���� �ƴϸ� ���� ����
			System.out.println("�� ū��: " + ����1);
		else if (����1 < ����2)//[��������] ����1������ ����2 ���� ������ ���� �ƴϸ� �׿�
			System.out.println("�� ū��: " + ����2);
		else //������ [�׿�] ����
			System.out.println("����");
		
//		//�� : �ΰ��� ������ �Է¹޾� �� ū�� ���  [ true , false ]
//				System.out.print(" ����6) ����1 �Է� : ");	int ����6_1 = scanner.nextInt();
//				System.out.print(" ����6) ����2 �Է� : ");	int ����6_2 = scanner.nextInt();
//				
//				int ū�� = ����6_1 > ����6_2 ? ����6_1 : ����6_2; 
//				System.out.println(" �� ū ���� : " + ū�� );
		
		System.out.println("����2 3���� ���� �� ����ū��  ");
		System.out.println("����3�Է�: "); int ����3 = scanner.nextInt(); // ������ �ߺ� *���� *
		System.out.println("����4�Է�: "); int ����4 = scanner.nextInt();
		System.out.println("����5�Է�: "); int ����5 = scanner.nextInt();
		
		int max = ����3; //���� ū���� �ӽ�����
			// max�� ù��° �� �־�α�.
		if(max<����4) { max = ����4;}
		if(max<����5) { max = ����5;}
		System.out.println("���� ū�� : " + max);
		
		
		
		System.out.println("����3 : 3���� ������ �Է¹޾Ƽ� ������������ �����ϱ�");
		
		System.out.println("����6�Է�: "); int ����6 = scanner.nextInt();
		System.out.println("����7�Է�: "); int ����7 = scanner.nextInt();
		System.out.println("����8�Է�: "); int ����8 = scanner.nextInt();
		
//		 temp ���
		if (max < ����6) {
			// ���࿡ max ���� ����6�� ��ũ�� ��ü
		int temp = ����6; // ���ҿ� �ӽú���= ����1; int temp; // ��ȯ�� ���Ǵ� �ӽú���
		����7 = ����8; // ����1= ����2 ;
		����8 = temp; // ����2= �ӽú���;
		}
		
		if( ����6>����8 ) {int temp = ����6; ����6 = ����8; ����8=temp;}
		if( ����7>����8 ) {int temp = ����7; ����7 = ����8; ����8=temp;}
		
		System.out.printf("�Է��� �� �������� :  %d %d %d ", ����6, ����7, ����8);
		System.out.println("�Է��� �� ��������: " + ����6 + " " + ����7+ " " + ����8);
		
		// ����4 : 4���� ������ �Է¹޾� ������������ ��� 
				System.out.print("����4 ����1 : ");	int ����10 = �Է°�ü.nextInt();
				System.out.print("����4 ����2 : ");	int ����11 = �Է°�ü.nextInt();
				System.out.print("����4 ����3 : ");	int ����12 = �Է°�ü.nextInt();
				System.out.print("����4 ����4 : ");	int ����13 = �Է°�ü.nextInt();
				
				int temp; // ��ȯ�� ���Ǵ� �ӽú���
				///////////////////////////////// ũ�� �ڷ� ���� => �������� ////////////////////	
					// 1. 1��° ������ 2��°,3��° 4��° ������ �� = 3��  
				if( ����10 > ����11 ) { temp = ����10; ����10 = ����11; ����11 = temp; }
				if( ����10 > ����12 ) { temp = ����10; ����10 = ����12; ����12 = temp; }
				if( ����10 > ����13 ) { temp = ����10; ����10 = ����13; ����13 = temp; }
					// 2. 2��° ������ 3��°,4��° ������ �� = 2�� 
				if( ����11 > ����12 ) { temp = ����11; ����11 = ����12; ����12 = temp; }
				if( ����11 > ����13 ) { temp = ����11; ����11 = ����13; ����13 = temp; }
					// 3. 3��° ������ 4��° ������ �� = 1�� 
				if( ����12 > ����13 ) { temp = ����12; ����12 = ����13; ����13 = temp; }
					// 4. 4��° ������ �񱳸� 3�� ���߱� ������ �� x
				System.out.printf(" �������� : %d  %d  %d  %d  \n" , ����10 , ����11 , ����12 , ����13 );
		
		
	} // m d

} // c d
