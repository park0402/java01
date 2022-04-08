package Day15;

public class StatePrintThread extends Thread{
	private Thread targetThread;
	public StatePrintThread( Thread tarThread) { //�ܺηκ��� ���� �����尴ü�� ��������
		this.targetThread =tarThread;
	}
	//����ó��
	
	@Override 
	public void run() {
		
		//������ ����ȣ��
		while(true) {
		 Thread.State state = targetThread.getState();
		 System.out.println( " Ÿ�� ������ ����: " +state);
		 //������ ��������
		 if(state == Thread.State.NEW) {
			 targetThread.start();
		 }
		 if(state==Thread.State.TERMINATED) {
			break;
		 }
	}
	try { Thread.sleep(500);}catch(Exception e) {}
	}
	
	
}
