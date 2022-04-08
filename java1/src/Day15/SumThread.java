package Day15;

public class SumThread extends Thread{
	private long sum;
	
	public long getsum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
				
	}
	
	@Override
	public void run() {
		for(int i =1 ; i<100 ; i++) {
			sum+=i ; //1부터 100까지 누적 합계
		}
	}
	

}
