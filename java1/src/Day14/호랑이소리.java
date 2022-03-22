package Day14;

public class 龋尔捞家府 extends Thread {
	
	@Override
	public void run() {
		for( int i = 0 ; i<5;i++) {
			System.out.println("龋尔捞家府"+i);
			try { Thread.sleep(500); }
			catch( Exception e ) {}
		}
		
	}
	

}