package 잡다;

public class test {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	String s = "편의점 알바생 : 오늘은 사람이 많은 주말이다 점점 많은 사람이 올텐데 두렵다."
			+ "점장에게 잔소리를 듣지 않기위해선 재고가 부족하지않게 음료수를 채워야한다 화이팅!"
			+"\n" +"5"+"\n" +"4" +"\n" +"3"+"\n" +"2"+"\n" +"1";
	

	
	for (int i = 0; i < s.length(); i++) { // 프롤로그 타이핑 효과
			Thread.sleep(25);
	      System.out.print( s.charAt(i) );
	    }
	}
}
