package Day15;

public class Day15_2 {
	public static void main(String[] args) {
		
		//�������̽�
			// ������ ������ ����(���δٸ�) ��ü�� ����
			// 1. �������̽��� ���	
				// 1. ����ʵ� 2. �߻�޼ҵ� 3. ����Ʈ �޼ҵ� 4. ���� �޼ҵ� 
			// 2. �����
				// public class Ŭ������ implements �μ�
				// !�ʼ� : �߻�޼ҵ� ����
			// 3. ������ü ����
				//Ŭ�����κ��� �޸� �Ҵ� ������
			// 4. �͸���ü ����
				// �������̽����� ���� ����
		
		// ��1) ������ü ����� :������ �޼ҵ� ���� ����
			�����е� pad1 = new �����ý��丮();
			//�������̽��� ��ü�� = new (������)Ŭ������();
			
		// ��2 ) �͸���ü ����� : ������ �޼ҵ带 ���� �Ұ�
		//�������̽��� ��ü�� = new �������̽���(){�߻�޼ҵ� ����} ;
			�����е� pad2 = new �����е�() {

				@Override
				public void A��ư() {}

				@Override
				public void B��ư() {}

				@Override
				public void C��ư() {}
				
			};//������
		////////////////////////////
			// �������̽��� ������ü ��ü 
			// ���� ��ü
			pad1= new ���Ŀ¶���();
			
			���� g1 = new ����();
			g1 = new �����ý��丮(); //���ӱ�ü
			g1 = new ���Ŀ¶���();
			/////////////
			//          ���  vs �������̽�
			//�����       1   	vs ����[������]
			//@override   ������  vs����[����]
			//�����       1  	vs ����[������]
			//������		�θ�<-�ڽ� vs �θ�<-�ڽ�
			//����		���� ����  vs ������ ������ Ŭ�������� ���δٸ� Ŭ������ ����
			//					vs �١��߻�١�
	}

}