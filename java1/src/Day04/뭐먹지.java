package Day04;

import java.util.Random;
import java.util.Scanner;

public class ������ { // cs
	public static void main(String[] args) { //ms
		
	// 1. ����ڰ� ��ȣ�� ����
	// 2. ������(��ǻ��)�� �������� ���ý� ���� ����
	// 3.
		int �����;
		int ������;
	
		Scanner scanner = new Scanner(System.in);
		
		while(true) { // w s
			System.out.println("________�������� �˷��帳�ϴ�.________");
			System.out.println("�ƹ� ���ڳ� �Է��ϼ��� ");
			�����= scanner.nextInt();
			System.out.println("�����ѹ�ȣ : "+�����);
			
			
			System.out.println("----------------------------");
			System.out.println("----------------------------");
			System.out.println("----------------------------");
			System.out.println("----------------------------");
			
			
			Random random = new Random(); 
			������ = random.nextInt(4); 
			
			
			
			switch(������){
			case 0 : System.out.println("�������� "); break;
			case 1 : System.out.println("���"); break; 
			case 2 : System.out.println("����"); break; 
			case 3 : System.out.println("���"); break; 
		    case 4 : System.out.println("�ܹ���"); }break; 
			
			
			
			
			
			
			
		} // w d
		
	} //md

} //cd