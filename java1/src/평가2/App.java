package ��2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// �׽�Ʈ 
//		Car car = new Car( LocalDate.now()  , 
//				"7777",
//				LocalTime.of(17, 44 , 0 ),
//				null, 
//				0 );
//		
//		Controller.carlist.add(car);
//		
		
		while( true ) {
			// 1. ��� ���� ǥ ��� 
			System.out.println("------------------------ ���� ��Ȳ ǥ --------------------------------------------");

				//
				Date date = new Date();
				// ��¥ ���� ����
				SimpleDateFormat dateFormat = new SimpleDateFormat("����ð� : yyyy-MM-dd hh:mm");
				// ������ �����ؼ� ����Ѵ�.
				System.out.println( "\t\t"+ dateFormat.format(date) );
				System.out.println("\t��¥\t������ȣ\t�����ð�\t\t�����ð�\t�ݾ�");

						// �迭�̳� ����Ʈ�� ��� ��ü ȣ�� �ݺ���
					for( Car temp : Controller.carlist ) {
						System.out.print( temp.get��¥() + "\t" );
						System.out.print( temp.get������ȣ() + "\t" );
						System.out.print( temp.get�����ð�().getHour() + ":" );
						System.out.print( temp.get�����ð�().getMinute() + ":" );
						System.out.print( temp.get�����ð�().getSecond() + "\t" );
						
						if( temp.get�����ð�() == null ) {
							System.out.print( "������\t" );
						}else {
							System.out.print( temp.get�����ð�().getHour() + ":" );
							System.out.print( temp.get�����ð�().getMinute() + ":" );
							System.out.print( temp.get�����ð�().getSecond() + "\t" );
						}
						
						if( temp.get�����ð�() == null ) {
							System.out.print( "���� ��\n" );
						}else {
							System.out.print( temp.get�ݾ�() + "\n" );
						}
						
					}
					System.out.println("-----------------------------------------------------------------------------------------");

				// 
			System.out.print("\n\t\t 1.���� \t  2.���� : ");
			int ch = scanner.nextInt();
			
			if( ch == 1 ) {
				// 1. ������ȣ�� �Է¹޴´�.
					// �Է� 
				System.out.println("������ȣ�� �Է��ϼ���");
				String ������ȣ = scanner.next();
				// 2. �Է¹��� ������ȣ�� ��Ʈ�ѳ� �޼ҵ� ���� �ѱ��.
				// 3. �޼ҵ� ��� �� ���� ��� 
				boolean ��� = Controller.����(������ȣ);
			}else if( ch == 2 ){
				// 1. ������ȣ�� �Է¹޴´�.
					// �Է�
				System.out.println("������ȣ�� �Է��ϼ���");
				String ������ȣ = scanner.next();
				// 2. �Է¹��� ������ȣ�� ��Ʈ�ѳ� �޼ҵ� ���� �ѱ��.
				// 3. �޼ҵ� ��� �� ���� ��� 
				Boolean ��� = Controller.����(������ȣ);
			}
			
		}
		
	} // 
} // 