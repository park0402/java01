package Day15;

public class ThreadA extends Thread{
	public boolean stop = false; // �����÷���
	public boolean work = true; //�۾����࿩�� �÷���
	
	
	//����ó��
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA �۾�����");
			}else {
				Thread.yield(); //�ٸ� �����忡�� �纸 
			}
		}//while end
		System.out.println("ThreadA ����");
	}

}
