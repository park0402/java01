package Day13;

import java.util.Random;

public class Day13_1 {
	public static void main(String[] args) {
		
		//p.534 : Math Ŭ���� (java.lang��Ű��) [���� ���� �޼ҵ� ����] ��ü���� ��밡��
		
		// Math.abs(��) : �ش� ���� ���밪
		System.out.println("���밪 " + Math.abs(-5)); //5
		System.out.println("���밪 " + Math.abs(-3.14)); //3.14
		
		// Math.ceil(��): ����� ������ �ø�
		System.out.println("�ø���"+ Math.ceil(5.3)); //6
		System.out.println("�ø���"+ Math.ceil(-5.3)); //15
		
		// Math.floor(��): ����������� ����
		System.out.println( "������" + Math.floor(5.3));
		System.out.println( "������" + Math.floor(-5.3)); //-6
		
		// Math.max(��1,��2): �μ����� �� ū��
		System.out.println("�ִ�" + Math.max(5, 9)); //9
		System.out.println("�ִ�" + Math.max(5.3, 2.5)); //5.3
		
		// Math.min(��1,��2): �μ����� �� ������
		System.out.println("�ּҰ�"+Math.min(5, 6)); //5
		System.out.println("�ּҰ�"+Math.min(5.3, 2.5)); //2.5
		
		// Math.random(): 0~1������ (double)�� ���� �߻�
		System.out.println("����: " + Math.random()); //0~1 ������ ���� �߻�
		
		// Math.rint(��) : ����� ������ �Ǽ������� �ݿø�
		System.out.println("����� ������ �Ǽ��� : "+ Math.rint(5.3) ); //�ݿø�[5�̻� �ø�] 
		System.out.println("����� ������ �Ǽ��� : "+ Math.rint(5.7) ); 
		
		// Math.round(��) : ����� ������ ���������� �ݿø�
		System.out.println("����� ������ ������: "+ Math.round(5.3));
		System.out.println("����� ������ ������: "+ Math.round(5.7));
		// Ư�� �Ҽ��� ��ġ���� �ݿø�
		System.out.println(Math.round(12.3456));
		double value = 12.3456; // �Ҽ� �����ڸ����� �ݿø� 
		double temp1 = value *100; //12.2345 *100 -> 1234.56
		long temp2 = Math.round(temp1);	//1234.56 �ݿø� => 1235
		double v16 = temp2/100.0;
				//temp2/100 -> long/int -> �⺻������ : int
				//temp2/100.0 -> long/double -> �⺻������ : double
		System.out.println("V16: " + v16);
		
		System.out.println("0~1������ �Ǽ���: " + Math.random() );
		System.out.println(Math.random()*6);
		System.out.println(Math.random()*6+1);
		int num = (int)(Math.random()*6)+1;
		
		System.out.println("1~6������ ���� : "+ num);
	///////////////////////////////////////
		Random random = new Random();
		System.out.println(random.nextInt(6)+1);
		System.out.println("1~6������ ����: " + random.nextInt(6)+1);
	
	
	
	}

}
