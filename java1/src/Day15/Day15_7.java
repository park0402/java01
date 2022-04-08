package Day15;

import java.awt.Toolkit;

public class Day15_7 {
	
	public static void main(String[] args) {
		
		
		// p601. ������ ����
			// 1. Thread.sleep(�и���): �־��� �ð����� �Ͻ�����
						//�ð� ���� : �и���(1000/1��)
						//�Ϲ� ���� �߻�: �Ͻ��������¿��� �־��� �ð��� �Ǿ����� �̸� ó���ڵ�
			// 2. Thread.yield() : �ٸ� �����忡�� ����纸 [������]
			// 3. Thread.join() : �ٸ� �������� ���Ḧ ��ٸ� [�ٸ� �����尡 ���������� ��ٸ�]
		//p.602 sleep ����
		
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //�Ҹ����� Ŭ����
		for(int i=0 ; i<10 ; i++ ) {
			toolkit.beep(); //�Ҹ����� [�Ҹ��� 1�� �۵��߿� for�� ����]
			try {
				Thread.sleep(3000);//3�ʰ� �Ͻ����� 
			} catch (InterruptedException e) {} 
			
			//1.��ü����
			ThreadA threadA = new ThreadA();
			//2.��ü����
			ThreadB threadB = new ThreadB();
			//3. ���������
			threadA.start();
			threadB.start();
			//4. ������ 3�ʰ� �Ͻ�����
			try {Thread.sleep(3000);}
			catch(Exception e) {}
			//5. ������A�� work �� ����;
			threadA.work= false;
			//4. ������ 3�ʰ� �Ͻ�����
			try {Thread.sleep(3000);
				
			} catch (Exception e) {}
			//5. ������ a�� work �� ����
			threadA.work = true;
			//4. ������ 3�ʰ� �Ͻ�����
			try {Thread.sleep(3000);} catch (Exception e) {}
			//6. ������a,������b����
			threadA.stop = true;
			threadB.stop = true;
			//7.
//			threadA.stop(); �������� �ʴ� �޼ҵ� ���¿��߿� ���� 
			
			//p607: join()
			
			//1.��ü ����
			SumThread sumThread = new SumThread();
			//2. ������ ����
			
			sumThread.start();
			
			try {// 3. ������ join : main������� sumThread������ join -> �ϳ��� ������
				sumThread.join(); //�Ϲ� ����ó�� �߻�
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			//4. 
			System.out.println("1~100 ��"+ sumThread.getsum() );
			//main �����尡 join �������� : "0"
				// SumThread�� ���ϱ⸦ ���������� main ������ sum ���
			//main �����尡 join ������ : "5050"
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}

}
