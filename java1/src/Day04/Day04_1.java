package Day04;

import java.util.Scanner;

public class Day04_1 { // c s
	public static void main(String[] args) { // m  s
		
		//��� : if , which
		//�ݺ��� : for, while
			// 1.�ʱⰪ 2.���ǽ� 3.������ 4.���๮
		// for ��1)
		
		for( int i = 1; i<=10; i++) { // for s
		//i�� 1���� 10���ϱ��� 1�������ϸ鼭 ���๮ �ݺ�ó�� -> 10������
		
		System.out.println(i+ " "); 
		
		} //for end
		
		// while�� ����
		// 1. �ʱⰪ;
		// while(2.���ǽ�) {
		// 4. ���๮;
		// 3. ������;
		//}
		
		//��1)
		int i = 1;// 1.�ʱⰪ //�����ִ� i�� {}�ȿ��� ����Ǿ ��ü����x �ۿ� ����� int i�� ��ü����
		while( i<=10 ) {// 2.���ǽ� while s
			
			System.out.println(i+ " ");//4.���๮
			i++; //3. ������
		} //while e
		
		// for ��2) 1~100�����հ�
		
		int sum = 0;
		for(int j = 1 ; j<=10 ; j++) {
			sum +=j; //sum = sum+j
		}  System.out.println( "for 1~100���� ������: " + sum);
		
		
		int j = 1;
		int sum2 = 0;
		while(j<=100) {//2.���ǽ� [ true�̸� ���� �ƴϸ� ����x]
			sum2 += j;
			j++;
		}//while e
		System.out.println("while 1~100���� ������ : " + sum2);
		
		//while ��3) ���ѷ���
		while(true) { //���ǽ��� true�̸� ���� //tue��� -> ���ѷ���
			System.out.println("���ѷ���");
			Scanner scanner = new Scanner(System.in);
			int exit = scanner.nextInt();
			if(exit == 3)
				break;//���� ����� �ݺ���Ż�� [ if ���� ]
		}
		
	
	} // m d

} // c d
