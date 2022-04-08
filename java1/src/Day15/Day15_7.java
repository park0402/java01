package Day15;

import java.awt.Toolkit;

public class Day15_7 {
	
	public static void main(String[] args) {
		
		
		// p601. 스레드 제어
			// 1. Thread.sleep(밀리초): 주어진 시간동안 일시정지
						//시간 단위 : 밀리초(1000/1초)
						//일반 예외 발생: 일시정지상태에서 주어진 시간이 되엇을때 미리 처리코드
			// 2. Thread.yield() : 다른 스레드에게 실행양보 [대기상태]
			// 3. Thread.join() : 다른 스레드의 종료를 기다림 [다른 스레드가 끝날때까지 기다림]
		//p.602 sleep 예제
		
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //소리관련 클래스
		for(int i=0 ; i<10 ; i++ ) {
			toolkit.beep(); //소리내기 [소리가 1번 작동중에 for문 끝남]
			try {
				Thread.sleep(3000);//3초간 일시정지 
			} catch (InterruptedException e) {} 
			
			//1.객체생성
			ThreadA threadA = new ThreadA();
			//2.객체생성
			ThreadB threadB = new ThreadB();
			//3. 스레드시작
			threadA.start();
			threadB.start();
			//4. 스레드 3초간 일시정지
			try {Thread.sleep(3000);}
			catch(Exception e) {}
			//5. 스레드A에 work 값 변경;
			threadA.work= false;
			//4. 스레드 3초간 일시정지
			try {Thread.sleep(3000);
				
			} catch (Exception e) {}
			//5. 스레드 a에 work 값 변경
			threadA.work = true;
			//4. 스레드 3초간 일시정지
			try {Thread.sleep(3000);} catch (Exception e) {}
			//6. 스레드a,스레드b종료
			threadA.stop = true;
			threadB.stop = true;
			//7.
//			threadA.stop(); 권장하지 않는 메소드 도는와중에 끝남 
			
			//p607: join()
			
			//1.객체 생성
			SumThread sumThread = new SumThread();
			//2. 스레드 실행
			
			sumThread.start();
			
			try {// 3. 스레드 join : main스레드와 sumThread스레드 join -> 하나의 스레드
				sumThread.join(); //일반 예외처리 발생
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			//4. 
			System.out.println("1~100 합"+ sumThread.getsum() );
			//main 스레드가 join 안했을떄 : "0"
				// SumThread가 더하기를 끝나기전에 main 스레드 sum 출력
			//main 스레드가 join 했을떄 : "5050"
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}

}
