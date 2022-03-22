package Day15;

public class StatePrintThread extends Thread{
	private Thread targetThread;
	public StatePrintThread( Thread tarThread) { //외부로부터 받은 스레드객체를 내부저장
		this.targetThread =tarThread;
	}
	//병렬처리
	
	@Override 
	public void run() {
		
		//스레드 상태호출
		while(true) {
		 Thread.State state = targetThread.getState();
		 System.out.println( " 타켓 스레드 상태: " +state);
		 //스레드 상태제어
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
