package �򰡹���2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try { while(true) { //while ���ѷ�������
			//1.������Ȳǥ �׽����
			System.out.println("----------------------------������Ȳǥ-----------------------");
			Date ��¥ = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("����ð�:yyyy-MM-dd hh:mm");
			System.out.println( "\t\t"+ dateFormat.format(��¥) );
			System.out.println("��¥\t\t������ȣ\t\t�����ð�\t�����ð�\t�ݾ�");
			//��¥���� ����ð� �� �� �� ���� Ŭ����
			for(Car temp : Controller.��������Ʈ) {//��Ʈ���� ��������Ʈ ȣ�� for �ݺ���

				System.out.print(temp.get��¥()+"\t");
				System.out.print(temp.get������ȣ()+"\t");
				System.out.print(temp.get�����ð�().getHour()+":"
				+temp.get�����ð�().getMinute()+"\t");
				
				if(temp.get�����ð�() ==null) {
					System.out.print("���� ��"+"\t");  
				}else {
					System.out.print(temp.get�����ð�().getHour()+":"
				+temp.get�����ð�().getMinute()+"\t");  
				}
				
				if(temp.get�����ð�()==null) {
					System.out.print("���� ��"+"\t");
				}else {System.out.println(temp.get�ݾ�()); 
				
			}	
			
		
		
					
		System.out.println();
		
		}
	
		System.out.println("------------------------------------------------");
		System.out.println("\t\t1.����\t\t2. ����"); int ch =sc.nextInt();
		if(ch==1) {
			System.out.println("������ȣ:");String ������ȣ =sc.next();
			//������ȣ �Է¹ް� �޼ҵ����� ���� �ֱ�
			boolean ��� =  Controller.����(������ȣ); //
			
		}else if (ch==2) {
			System.out.println("������ȣ:");String ������ȣ =sc.next();
			boolean ��� = Controller.����(������ȣ);
			
		}
		
		
	
	
	} } catch (Exception e) {
		// TODO: handle exception
		}
	} //m d
} // c d
