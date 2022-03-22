package Day15;

public class TargetThread extends Thread{
	
	@Override
	public void run() {
		for( long i = 0 ; i<100000000; i++) {
				//10억반복
		}
			// 1.5 초간 대기 [ 1/1000 밀리초 ]
			try {Thread.sleep(1500);} 
			catch (Exception e) {}
			
			for(long i = 0 ; i<100000000; i++) {
				//10억 반복
			}//for end 
		}
	

}


