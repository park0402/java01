package Day14;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
							// �����ϴ� [Runable]
					//implements ���� �߻�޼ҵ� ��! �����ϱ�
					//ctrl + �����̽���

	@Override
	public void run() {
		// Runnable �������̽��� run �޼ҵ� �����ϱ�
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0 ; i<5 ; i++) {
			toolkit.beep(); //�Ҹ�����
			try {
				Thread.sleep(500);//�Ϲݿ��ܰ� �����ǹ߻�-> ����ó�� ������
				
			} catch (Exception e) {}
		}
		
	}

}
