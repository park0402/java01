package Day15;

public class Calculator {
	
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory ;
		//2�ʰ� �Ͻ�����;
		
		try{Thread.sleep(2000); }
		catch(Exception e) {}
		
		System.out.println(Thread.currentThread().getName()+
				":" + this.memory);
	}

}
