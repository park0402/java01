package Day14;

import java.awt.Toolkit;

public class BeepThread extends Thread {
	// 상속 Thred [ 멀티스레드 클래스]

	//run 메소드 오버라이딩 
	@Override
	public void run() {
		// Runnable 인터페이스내 run 메소드 구현하기

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0 ; i<5 ; i++) {
			toolkit.beep(); //소리내기
			try {
				Thread.sleep(500);//일반예외가 무조건발생-> 예외처리 무조건

			} catch (Exception e) {}
		}

	}

}
