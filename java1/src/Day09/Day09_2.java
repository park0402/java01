package Day09;

public class Day09_2 {
	
	public static void main(String[] args) {
		//���
		//�θ𿡰� �����޴°�
		//����: �θ�-> �ڽļ��� // ���α׷����� �ڽ��� �θ� �����Ѵ�
		//extends �����ϴ� : ���� �������� (������ �ִ� Ŭ������ �����ؼ� ���ο� Ŭ���� ����)
		//
		
		//p.290~292 ���� 
		//1. ����Ŭ������ ��ü ����
		DmbCellphone dmbCellphone = new DmbCellphone("�ڹ���", "����", 10);
						
						
						
		//2. ����Ŭ������ ������� ��ü�� ����Ŭ������ ��� ����
		System.out.println(" �� : " + dmbCellphone.model );
		System.out.println(" ���� : " + dmbCellphone.color );
		// 3. ����Ŭ������ ������� ��ü�� ���� ��� ����
		System.out.println(" ä�� : " + dmbCellphone.channel );
		// 4. ����Ŭ������ ������� ��ü�� ����Ŭ���� �� ���[�޼ҵ�] ����
		dmbCellphone.powerOn(); // ����Ŭ������ ����� �޼ҵ� [ ȣ�� ���� ]
		dmbCellphone.bell();
		dmbCellphone.sendVoice("��������");
		dmbCellphone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�Դϴ�.");
		dmbCellphone.sendVoice("��~~ �� �ݰ��ϴ�.");
		dmbCellphone.hangUp();
		
		// 5, ����Ŭ������ ������� ��ü�� ���� ��� ����
				
		dmbCellphone.turnOffDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();
						
						
						
	}

}
