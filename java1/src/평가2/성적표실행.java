package 평가2;

import java.util.Scanner;

	//1. 무한루프 시작시 성적표 출력 배열 다 끄집어내기
	//2. 석차 최초 모두 1등으로 초기화 

public class 성적표실행 { // c s
	
	public static void main(String[] args) { // m  s
		
		//1. 기본도구 1.스캐너툴 2. 배열지정
		Scanner sc = new Scanner(System.in);
		학생[] stu = new 학생[100];  //배열 100명
		//2. 메뉴 1번 2번 입력받기 무한루프시작
		
		while(true) {// 무한루프 시작 w s
			try {//예외 발생처리 숫자외 다른거 입력했을때
				System.out.println("---------------------------------------------------");
				System.out.println("                        성적표                       ");
				System.out.println("---------------------------------------------------");
		
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s \n","번호","이름","국어","영어","수학","총점","평균","석차");			
				for (int i= 0; i<stu.length ; i++) {
					if(stu[i] != null) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
								stu[i].get번호(),stu[i].get이름(),stu[i].get국어()
								,stu[i].get영어(),stu[i].get수학(),stu[i].get총점(),stu[i].get평균(),i+1 );
					}else {
						break;
						
					}
				} //for end
				System.out.println("----------------------------");
				System.out.println("1.학생점수 등록2.학생점수 삭제");
				int ch = sc.nextInt();
				if(ch==1) { //1. 학생 점수 등록 입력받기
					System.out.println("학생점수를 등록해주세요.");
					System.out.println("번호: "); int 번호 = sc.nextInt();
					System.out.println("이름: "); String 이름 = sc.next();
					System.out.println("국어: "); int 국어 = sc.nextInt();
					System.out.println("영어: "); int 영어 = sc.nextInt();
					System.out.println("수학: "); int 수학 = sc.nextInt();
					//2. 입력값
					int 총점= 국어+영어+수학; 
					double 평균= (double)총점 / 3;
					//3. 객체화
					학생 점수객체 = new 학생(번호,이름,국어,영어,수학,총점,평균);
					//4. 객체 저장
					for(int i =0; i<stu.length; i++) {
						if(stu[i]==null) {
							stu[i]=점수객체; 
						break;
						
						}
						
					}// for2 end
				}//1.학생점수등록 끝
//				if(stu[1]!=null) {
//					for(int i =0 ; i <stu.length; i++) {
//						
//						for(int j = i + 1; j <stu.length; i++) {
//							if(stu[i].get총점()<stu[j].get총점()) {
//								System.out.println(stu[i].get총점()+ ","+stu[j].get총점());
//								학생 temp = stu[i]; 
//								stu[i] = stu[j];
//							    stu[j] = temp;
//							} //if-if end	
//					
//						} // if-for-for end
//					} //if-for end
//					
//				} //석차 if end				

				

			else if (ch==2) { //점수삭제
				System.out.println("학생점수를 삭제합니다. 학생번호를 입력해주세요.");
				int 학생점수삭제= sc.nextInt();
				boolean 삭제 = false;
				for(int i=0 ;i<stu.length ;i++) {
					if(stu[i].get번호() == 학생점수삭제) {
						stu[i]=null;
						for(int j=i; j< stu.length; j++) {
							stu[j]=stu[j+1];
						}
						System.out.println("점수를 삭제했습니다.");
						삭제= true;
						break;
					
					
					}
				}
				if (삭제==false) {
					System.err.println("해당번호의 학생이 없습니다.");
				}
			
			}
			else {
				 System.err.println("번호를확인해주세요.");
			}
						
				
			
				
				
				
				
			}catch(Exception a) { System.out.println("알림)) 잘못된 입력이있는지 확인해주세요.");
				
				
			}//catch end
			
			 
		}// w s
			
		
		
	} // m  d
	

} // c d