package Day03;

import java.util.Scanner;

public class Day03_3 { //cs
		public static void main(String[] args) { // m s
		
			Scanner sc = new Scanner(System.in);
		
			System.out.println(" ���̵�� ��й�ȣ�� �Է��Ͻÿ� ");
		
			System.out.println( "���̵� : "); String ���̵� =  sc.next();
		
			//1. String Ŭ���� ����ϸ� ���ڿ� ���尡��
			//2. char �迭/����Ʈ ����ϸ� ����
		System.out.println( "��й�ȣ : "); int ��й�ȣ = sc.nextInt();
		
//		if( id == "redpyg"){" ��й�ȣ�� �Է��Ͻÿ� ." };
//			//�Է��� id�� admin �̸�
//		
//			if(pw == 1234 ){" �α��ο� �����Ͽ����ϴ�. "};
//				// �Է��� pw1234�̸�        ���ڿ���  �����ڰ� �ȵȴ� 
		boolean �α��μ��� = false;
			// boolean true Ȥ�� false�� ���� : �α��� ���� ���θ� �˱�����
		if( ���̵�.equals("redpyg")) { // ifs 
		//�Է��� id�� admin �̸�
	
		if(��й�ȣ==1234 ) System.out.println(" �α��ο� �����Ͽ����ϴ�. "); }
			// �Է��� pw1234�̸�}
		
		else { System.out.println("�α��� ������ �����ʽ��ϴ�. "); 
		
		}
		
		} //ifd
				
		
		
			
		
		

		
 
	
} // m d
} //cd
