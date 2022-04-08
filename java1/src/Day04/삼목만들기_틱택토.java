/* 
1.9칸생성 1.string[]배열=new String[9]
2.사용자에게 0~8인덱스번호 입력받기 해당인덱스에 o표시 이미둔자리는 입력
3.컴퓨터는 0~8사이 난수 발생
	1. 해당 인덱스에 x표시
	2. 이미 둔 자리는 난수 생성
4.승리판단
	1.가로 인덱스들의 모양이 모두동일하면 012 345 678
	2.세로 인덱스들의 모양이 모두동일하면 036 147 258 
	3.대각선 인덱스들의 모양이 모두동일하면 048 246 
*/
package Day04;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class 삼목만들기_틱택토 { // c s 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] 게임판 = { "[ ]","[ ]","[ ]",
						  "[ ]","[ ]","[ ]",
						  "[ ]","[ ]","[ ]"};
				 //String 객체 9개를 저장할수 있는 배열 선언
		String 승리알 = ""; //3목이 되었을때 해당 알을 저장하는 변수
		
		
		//게임실행
		while(true) {//무한 루프 종료조건 1. 9칸 모두 알이 있을경우 2. 3목이 되었을때 [승리자]
			
			/////////////////////////게임판출력 [ 배열내 모든 인덱스 출력] /////////////
			
				for(int i = 0; i<게임판.length;i++) {
					System.out.print(게임판[i]); 
					// 배수찾기 : 값%수 ==0
					if( i % 3 ==2) System.out.println();
				} // 2 5 8 떄 라인을 내리기위해 3을나눈 나머지가 2 일때 
			
			/////////////////////////////////////
				while(true) { // wh s
					//1.플레이어 위치(인덱스) 선택
					System.out.print("위치 선택 :"); int 위치=scanner.nextInt();
					if(게임판[위치].equals("[ ]"))  {
						//선택위치가 공백이면 알두기
						게임판[위치] = "[O]";
						break;// 가장 가까운 반복문 탈출;
						} else {
						System.out.println("알림)) 해당 위치에 이미 알이 존재. [재선택하시오]");
				
						}
			
					} //while ed
			
			while(true) { // wh2 s
				Random random = new Random(); //1. 난수 객체 생성
				int 위치 = random.nextInt(9); //2. 0~8 사이의 난수 int형으로 가져오기
				if( 게임판[위치].equals("[ ]")) { //3. 해당 난수 위치가 공백이면 X알을 두기
				// 난수 위치에 공백이면 x알 두기
					게임판[위치] = "[X]"; break; //4.알을두면 탈출
				}
			} // wh2 d
			
		//1.가로 012/345/678
//			if((게임판[0].equals(게임판[1])) &&게임판[1].equals(게임판[2]) ) {}
//			if((게임판[3].equals(게임판[4])) &&게임판[4].equals(게임판[5]) ) {}
//			if((게임판[6].equals(게임판[7])) &&게임판[7].equals(게임판[8]) ) {}
			
			for( int i = 0 ; i<=6 ; i+=3 ) { // for s
				if( 게임판[i].equals(게임판[i+1] ) && 게임판[i+1].equals(게임판[i+2])  ) { //if s
					if( !게임판[i].equals("[ ]") ) {
						// ! : 부정 [ true => false ]
						승리알 = 게임판[i];
					}
				} //if d
			} //for d
		
			
		 //2.세로 036/147/258 
		
//			if((게임판[0].equals(게임판[3])) &&게임판[3].equals(게임판[6]) ) 
//				
//				
//			 if((게임판[1].equals(게임판[4])) &&게임판[4].equals(게임판[7]) ) 
//			 if((게임판[2].equals(게임판[5])) &&게임판[5].equals(게임판[8]) ) 
				 for( int i = 0 ; i<=2 ; i++ ) { // for s
						if( 게임판[i].equals(게임판[i+3] ) && 게임판[i+3].equals(게임판[i+6])) { //if s
							if( !게임판[i].equals("[ ]") ) {
								// ! : 부정 [ true => false ]
								승리알 = 게임판[i];
							}
						} //if d
					} //for d
			//3. 대각선 이기는 경우의수 048/246
				 
			if((게임판[0].equals(게임판[4])) &&게임판[4].equals(게임판[8]) ) {
				승리알 = 게임판[0];
				
			}
			
			if((게임판[2].equals(게임판[4])) &&게임판[4].equals(게임판[6]) ) {
				승리알 = 게임판[2];
				
			}
		 //WHILE end ( 게임종료) 
			
			
			if( 승리알.equals("[O]")) {
				System.out.println("알림)) 플레이어 승리");
				break;
			}
			if( 승리알.equals("[X]")) {
				System.out.println("알림)) 컴퓨터 승리");
				break;
				
				
			}
		
	
		}
	

		} // m d
	
} // c d

