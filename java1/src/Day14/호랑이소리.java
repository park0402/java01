package Day14;

public class ȣ���̼Ҹ� extends Thread {
	
	@Override
	public void run() {
		for( int i = 0 ; i<5;i++) {
			System.out.println("ȣ���̼Ҹ�"+i);
			try { Thread.sleep(500); }
			catch( Exception e ) {}
		}
		
	}
	

}