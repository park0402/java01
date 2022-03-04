package Day04;

import java.util.Scanner;

public class Day04_2 { // c s
	
	// Day01 : 입출력
	// Day02 : 변수 연산
	// Day03 : if for 제어문 반복문
	
	// 자판기 프로그램 
	
		// 1. 메뉴판 [ 1.콜라(300) 2.환타(200) 3.사이다(100) 4. 결제 ]
		// 2. 메뉴판에서 제품선택하면 장바구니에 넣기
		// 3. 재고가 부족하면 알림 (재고 부족)
		// 4. 초기 재고 조건 [ 제품당 10개 씩 ] 
		// 5. 결제시 금액입력받아 결제액 만큼 차감후 잔돈 출력
		// 6. 결제시 투입 금액이 부족하면 결제 취소 [금액부족]
	
	public static void main(String[] args) { // m s
		
		//공통 변수 [ 모든 괄호내에서 사용하는 변수들]
	
		Scanner scanner = new Scanner(System.in); 	// 1. 입력객체
		int 콜라재고=10; int 환타재고=10; int 사이다재고=10; // 2.재고변수
		int 콜라구매수=0; int 환타구매수=0; int 사이다구매수=0; //3.장바구니
		
		// 프로그램 시작 [무한루프]
		while(true) {//프로그램 시작[무한루프]
			System.out.println("----------------메뉴----------------------");
			System.out.println("1.콜라 300원 2. 환타 200원 3. 사이다 100원 4. 결제");
			System.out.println(">>>>>>>>>>>>>>>선택 : " ); int 선택 = scanner.nextInt();
			
			
			if ( 선택 ==1 ) {//콜라 구매
				if( 콜라재고 == 0) {
					System.out.println("알림)) 구매불가 재고가 없습니다. ");
				}
				else {
					System.out.println("[[콜라를 담았습니다.]]");
					콜라구매수++;
					콜라재고--; //재고가 깎이고 구매수가 올라가야한다
				}
				
			}
			
			
			else if ( 선택 ==2 ) { //환타 구매		
				if( 환타재고 == 0) {
				System.out.println("알림)) 구매불가 재고가 없습니다. ");
			}
			else {
				System.out.println("[[환타를 담았습니다.]]");
				환타구매수++;
				환타재고--; //재고가 깎이고 구매수가 올라가야한다
				}
				
			}
			
			
			else if ( 선택 ==3 ) {//사이다 구매		
					if( 사이다재고 == 0) {
						System.out.println("알림)) 구매불가 재고가 없습니다. ");
					}
					else {
						System.out.println("[[사이다를 담았습니다.]]");
						사이다구매수++;
						사이다재고--; //재고가 깎이고 구매수가 올라가야한다
					}
				
			}
			
			else if ( 선택 ==4 ) {//결제		
				
				System.out.println("-------------결제 제품목록--------------");
				System.out.println("제품명\t수량\t금액");
				if(콜라구매수 !=0) System.out.println("콜라\t"+콜라구매수+"\t"+(콜라구매수*300));
				if(환타구매수 !=0) System.out.println("환타\t"+환타구매수+"\t"+(환타구매수*300));
				if(사이다구매수 !=0) System.out.println("사이다\t"+사이다구매수+"\t"+(사이다구매수*300));
				
				
				
				System.out.println("제품 총 결제액: " + ((콜라구매수*300)+(환타구매수*300)+(사이다구매수*300)));
				System.out.println("----------------------------------");
				System.out.println("1.결제 2.취소"); int 선택2= scanner.nextInt();
				
				int 총결제액 = ((콜라구매수*300)+(환타구매수*300)+(사이다구매수*300));
				
				if( 선택2==1) {// 결제 - 금액입력 - 결제액보다 적으면 결제불가 - 금액이 결제액보다 많으면 결제성공 -> 장바구니초기화
					while(true) {
						
					
						
					System.out.println("투입금액: " ); int 투입금액 = scanner.nextInt(); 
					
					
						if(투입금액<총결제액) {System.out.println("금액이 부족합니다.");
					
						}
						else {System.out.println("알림)) 구매완료 주문번호 : 0000번 ");
					
						콜라구매수 =0; 환타구매수 =0; 사이다구매수 =0;
						System.out.println("알림)) 잔돈 출력: " + (투입금액 - 총결제액)+"원"  );
						System.out.println("-------이용해주셔서 감사합니다.-----------");
						break;//while 탈출
						
						}
					}
					
					
				}
				
				
				else if(선택2==2) {
					
					System.out.println("알림)) 구매목록 모두 지우기 ");
					for( int i = 1; i<=콜라구매수;i++) {//방법 1. i를 1부터 콜라구매수까지 1씩증가하면서 재고를 채워주는것 2. 콜라재고+=콜라구매수; 해도됌
						콜라재고+=콜라구매수; 환타재고+=환타구매수; 사이다재고+=사이다구매수;//구매수를 재고로 옮기기
						콜라구매수=0; 환타구매수=0; 사이다구매수=0; //구매수 초기화
					}
					
				}
				else { 
					System.err.println("알림)) 알수없는 행동입니다. ");
				}
			
				
			}
			else { System.err.println("알림)) 알수없는 행동입니다. ");} //err는 out 보다 솔도가 조금 느리다.
			
			
			
		} //while e
		
		
		
		
	} // m d
	
	

} // c d
