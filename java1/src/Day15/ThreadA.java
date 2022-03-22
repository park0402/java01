package Day15;

public class ThreadA extends Thread{
	public boolean stop = false; // 종료플래그
	public boolean work = true; //작업진행여부 플래그
	
	
	//병렬처리
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업내용");
			}else {
				Thread.yield(); //다른 스레드에게 양보 
			}
		}//while end
		System.out.println("ThreadA 종료");
	}

}
