package Day15;

public class TargetThread extends Thread{
	
	@Override
	public void run() {
		for( long i = 0 ; i<100000000; i++) {
				//10��ݺ�
		}
			// 1.5 �ʰ� ��� [ 1/1000 �и��� ]
			try {Thread.sleep(1500);} 
			catch (Exception e) {}
			
			for(long i = 0 ; i<100000000; i++) {
				//10�� �ݺ�
			}//for end 
		}
	

}


