package Day05;

import java.util.Scanner;

public class Day05_3 {
	public static void main(String[] args) { // m s 
	// ����7. p182. �־��� ������ �ִ밪 ���ϱ�
		int max =0; 
		int[] array = {1,5,3,8,2}; // ���� +�ʱⰪ ����
		
		for(int i = 0 ; i<array.length ; i++) { 
			//i�� 0���� �迭�� ���̱��� 1������ ���� �ݺ�ó��
			if( max <array[i])max =array[i];
			// ���࿡ max���� i��° �ε����� ���� ��ũ�� max�� i���� �� ����
	    }
		System.out.println("max : " + max);
		
		
	// ����8. �־��� �迭�� ��ü �հ� ��հ� ���ϱ� for�̿�	
		int[][] array2 = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0; //�հ�
		double avg = 0.0; //���
		
		int count = 0; //�����ǰ��� [ĭ ����]
		
		for(int �� = 0 ; ��<array2.length; ��++) {
			//���� 0���� �迭�� �����[3]�̸����� 1������
			for(int �� = 0 ; ��<array2[��].length; ��++) {// ���� 0���� �迭�� ������ [2,3,5] �̸����� 1������
				sum += array2[��][��]; //�����հ�
				
			}
			count += array2[��].length; // �������� �����հ�
					
		} 
		//Ǯ�� 
		
		avg = (double)sum /count; //�����׺�ȯ
		
		System.out.println("sum: "+ sum);
		
		System.out.println("avg: "+ avg);
		
		// 9. Ű����� �л� ���� �л� ���� �Է¹ޱ�, �ְ� ������ ������� ���ϱ� 
		boolean run = true; //while�� ����ġ ����
		int stuNum = 0; //�л��� ����
		int[]scores = null; //�����迭���� //null; ������ 
		Scanner sc = new Scanner(System.in);
		
		// while(true){}
		
		while(run) {
			
			System.out.println("--------------------------------------------------");
			System.out.println("1.�л��� 2.�����Է� 3.��������Ʈ 4.�м� 5.����");
			System.out.println("-----------------------------------------");
			System.out.println("����: ");
			
			int selectNo =sc.nextInt();
			
			if ( selectNo == 1) { //�л��� �Է¹ޱ�
				System.out.print("�л���: "); stuNum = sc.nextInt();
				
				scores = new int[stuNum]; //scores ȣ��
			}
			else if(selectNo == 2) { //�л� �����Է¹ޱ�
				for( int i = 0 ;i<scores.length; i++){
					System.out.printf("scores[%d] : " ,i );
					scores[i] = sc.nextInt(); //�Է¹޾� i��° �ε����� ����
				}
				
			}
			else if(selectNo == 3) { //�л� ���� ����ϱ�
				for( int i = 0 ;i<scores.length; i++){
					System.out.printf("scores[%d] : %d \n " , i , scores[i]);
				}
			}
			else if(selectNo == 4) {
				int �ְ����� = 0;
				int ���հ� = 0;
				double ������� = 0.0;
				
				for(int i =0; i<scores.length;i++) {
					
					//�ְ����� ���ϱ�
					if(max<scores[i]) �ְ����� = scores[i];
					
					//�����հ� 
					���հ� += scores[i];
				}
				
				// ������� ���ϱ�
				�������= (double)���հ� / scores.length;
				
				System.out.println("�ְ� ����: " + �ְ�����);
				System.out.println("��� ����: " + �������);
				
			}
			else if(selectNo == 5) {
//				break; // break �� �ᵵ �ǰ� run�� false�� �� �����ؼ� �Ѱܵ� �ȴ�
				run = false;
			}
		}

	} // m d
}
