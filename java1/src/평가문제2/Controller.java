package �򰡹���2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Controller {
	//1.����Ʈ ���
	public static ArrayList<Car> ��������Ʈ = new ArrayList<>();
	//Ŭ���� �Է� 
	
	//�����޼ҵ� boolean ���� ���� ���йޱ�
	
	public static boolean ����(String ������ȣ) {
		// 1.������ȣ �μ� �������� 
		for(Car temp : ��������Ʈ) {
			// 2.������ȣ �ߺ�üũ�ϱ�
			if(temp.get������ȣ().equals(������ȣ)) { 
				return false; // 2-1 ������ �������� 2-2 ������ ���� ����
			}
		}	//for�� ����
		// 3.������¥(���糯¥)���ϱ�
		LocalDate ��¥ = LocalDate.now();
		// 4.�����ð� ���ϱ�
		LocalTime �����ð� = LocalTime.now();
		// 5. ������ȣ,������¥,�����ð� ��üȭ�ϱ�
		Car ����1 = new Car(��¥,������ȣ,�����ð�,null,0);
		// 6. ��ü ����Ʈ�� �����ϱ�
		��������Ʈ.add(����1);
		// 7. �� ��ȯ�ϱ�
		return false;
	}  //���� �޼ҵ� ����
	
	//�����޼ҵ� boolean���� �������йޱ�
	public static boolean ����(String ������ȣ) {
		
		for(Car temp : ��������Ʈ) {
		// 1.������ȣ �μ� �������� 
			if(temp.get������ȣ().equals(������ȣ)) {// 2.����Ʈ�� ������ ���� �ִ��� ��������
				
		//2-1.������ ���� 
			// 3. �����ð� ���ϱ�
			LocalTime �����ð� = LocalTime.now();
			// 4. �����ð�-�����ð�=������ӹ����ð�
			int �̿�ð� = (int)(temp.get�����ð�().until(�����ð�,ChronoUnit.MINUTES));
			// ������ �ӹ����ð� ����30�� ���� ���� 10�� 1000�� (�ӹ����ð�-30 /10 )* 1000
			�̿�ð� -=30  ;
			if(�̿�ð�<0) {
				temp.set�ݾ�(0);
			}else { �̿�ð�= ( �̿�ð�/10)*1000;
				temp.set�ݾ�(�̿�ð�);
			}
			
			
			}else {System.out.println("�߸��� �Է��Դϴ�.");} //2-2. ������ ����
		}
		// 2.����Ʈ�� ������ ���� �ִ��� ��������
		

		return true; //��������
			
	}
	

	
	

}
