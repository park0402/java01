package Day15;

public class User2 extends Thread {
	
	//�ʵ�
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
	this.setName("user2");
	this.calculator = calculator;
	}
	//��öó��
	
	 @Override
	 public void run() {
		 calculator.setMemory(50);
	 }
}
