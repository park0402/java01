package Day14;

import java.awt.Toolkit;

public class Day14_4 {
	public static void main(String[] args) {
		
		
		
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //�Ҹ� ���� �޼ҵ� ���� Ŭ����
		
		for(int i = 0 ; i<5 ; i++) {
			toolkit.beep(); //beep() : �Ҹ� �޼ҵ�
			try {
				Thread.sleep(500); // ��������(main������)�� 0.5 �ʰ� �Ͻ����� 
			}catch(Exception e ) {}
		}
			for(int i = 0 ; i<5 ; i ++ ) {
				System.out.println("��"); 
				try {
					Thread.sleep(500);//0.5 �Ͻ����� 
				}catch(Exception e) {}
				
			} 
			System.out.println("-------Runnable��Ƽ������α���------------------------");
		
		//p.582 ����2 
			//* ��Ƽ ������
		Runnable beepTask = new BeepTask();
		//1.�������̽��� ������ü
		Thread thread = new Thread(beepTask);
		//2. thread Ŭ���� ��ü ������ �����ڿ� ������ü �ֱ�
		thread.start();
		//3. thread ��ü�� start() �޼ҵ� ȣ��
		
		//���
		for(int i = 0 ;i<5 ; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		
		System.out.println("--------������Ŭ�����α���------------------------");
//				p.584 ������ Ŭ������ ����		
		// 1. Ŭ���� ��ü����
		Thread thread2 = new BeepThread();
		// ����Ŭ���� = �ڽ�Ŭ������ ������
		// �θ�<---- �ڽ� [ �ڵ�����ȯ]
		// �θ�----->�ڽ� [ ��������ȯ]
		thread2.start();
		//���
		for(int i = 0 ; i<5 ; i ++ ) {
			System.out.println("��"); 
			try {
				Thread.sleep(5000);//0.5 �Ͻ����� 
			}catch(Exception e) {}
	}
 }
}