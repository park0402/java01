package Day15;

public class Day15_6 {
	public static void main(String[] args) {
		
		//p.597 
				//�����ٸ�: �ü���� �޸𸮸� ���μ������� �Ҵ��ϴ¹��
		
		//p.598~600
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		
		
		statePrintThread.start();
	}

}
