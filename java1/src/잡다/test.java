package ���;

public class test {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	String s = "������ �˹ٻ� : ������ ����� ���� �ָ��̴� ���� ���� ����� ���ٵ� �ηƴ�."
			+ "���忡�� �ܼҸ��� ���� �ʱ����ؼ� ��� ���������ʰ� ������� ä�����Ѵ� ȭ����!"
			+"\n" +"5"+"\n" +"4" +"\n" +"3"+"\n" +"2"+"\n" +"1";
	

	
	for (int i = 0; i < s.length(); i++) { // ���ѷα� Ÿ���� ȿ��
			Thread.sleep(25);
	      System.out.print( s.charAt(i) );
	    }
	}
}
