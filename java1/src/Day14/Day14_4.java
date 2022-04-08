package Day14;

import java.awt.Toolkit;

public class Day14_4 {
	public static void main(String[] args) {
		
		
		
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //소리 관련 메소드 제공 클래스
		
		for(int i = 0 ; i<5 ; i++) {
			toolkit.beep(); //beep() : 소리 메소드
			try {
				Thread.sleep(500); // 현스레드(main스레드)를 0.5 초간 일시정지 
			}catch(Exception e ) {}
		}
			for(int i = 0 ; i<5 ; i ++ ) {
				System.out.println("띵"); 
				try {
					Thread.sleep(500);//0.5 일시정지 
				}catch(Exception e) {}
				
			} 
			System.out.println("-------Runnable멀티스레드로구현------------------------");
		
		//p.582 예제2 
			//* 멀티 스레드
		Runnable beepTask = new BeepTask();
		//1.인터페이스에 구현객체
		Thread thread = new Thread(beepTask);
		//2. thread 클래스 객체 생성시 생성자에 구현객체 넣기
		thread.start();
		//3. thread 객체내 start() 메소드 호출
		
		//출력
		for(int i = 0 ;i<5 ; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		
		System.out.println("--------스레드클래스로구현------------------------");
//				p.584 스레드 클래스로 구현		
		// 1. 클래스 객체생성
		Thread thread2 = new BeepThread();
		// 슈퍼클래스 = 자식클래스의 생성자
		// 부모<---- 자식 [ 자동형변환]
		// 부모----->자식 [ 강제형변환]
		thread2.start();
		//출력
		for(int i = 0 ; i<5 ; i ++ ) {
			System.out.println("띵"); 
			try {
				Thread.sleep(5000);//0.5 일시정지 
			}catch(Exception e) {}
	}
 }
}