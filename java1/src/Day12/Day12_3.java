package Day12;

import java.io.IOException;

public class Day12_3 {
	
	//도서 검색 프로그램
	//조건
	//1.입력받기 [System.in.read()]
	//2. String 배열을 이용한 도서명을 여러개 저장
		//1. String[] 도서목록 = {
		// " 된다! 네이버 블로그&포스트".
		// " 스프링 부트 실전 활용 마스터",
		// " 혼자 공부하는 C 언어"
		// " Tucker의 Go 언어 프로그래밍",
	//3. 검색기능,수정기능
		//검색기능: 특정 문자를 입력받아 도서내 포함된 문자가 있으면 모두 출력 
			//'언어' 검색 -> " Tucker의 Go 언어 프로그래밍", /" 혼자 공부하는 C 언어"
		//수정기능: 수정할 도서명의 일부를 입력받아 출력된 도서명중 번호를 선택 replace
			//'수정' 수정 -> 선택된 도서명의 수정할 문자 입력 -> 수정완료
	public static void main(String[] args) throws IOException {
		String[] 도서목록 = {" 된다! 네이버 블로그&포스트",
				" 스프링 부트 실전 활용 마스터",
				" 혼자 공부하는 C 언어",
				" Tucker의 Go 언어 프로그래밍"};
		//1.메뉴
		while(true) {
			System.out.println("1.검색 2. 수정  ");
			
			byte[] bytes = new byte[100];
			int count = System.in.read(bytes); //키보드로부터 [스트림] 바이트를 읽어오기 //일반예외 떠넘기기 
			String ch = new String (bytes, 0 , count-2); 
			//바이트배열 --> 문자열변환 [-2차감=\n\r이 자동으로 들어와서 바이트 배열에서 없애야한다]
			
			if(ch.equals("1")) {
				System.out.println("****검색****"); 
				System.out.println("검색:  "); count = System.in.read(bytes);
				String search = new String (bytes, 0 ,count-2); //찾을문자
				
				System.out.println("검색결과");
				for(String temp : 도서목록 ) {//모든 배열내 문자열 하나씩 꺼내오기 
					//indexOf 메소드 -1 반환되는 경우
					
//					if( temp.indexOf(search) != -1 ) { // 해당 문자열내 찾을문자의 인덱스가 존재하면
//					// indexOf 메소드 -1 반환되는경우는 동일한 단어가 없을경우 [ 검색x]
//					System.out.println( temp ); // 해당 문자열내 찾을문자가 존재하면 출력 
//				}
				// 방법2
				if( temp.contains(search) ) {	
					// 문자열.contains("찾을문자") : 문자열내 찾을문자가 true[있다] / false[없다] 반환
					System.out.println( temp );
				}
					
				
			 }
			
			}else if( ch.equals("2")) {
				System.out.println("****수정****");
				System.out.println("수정할 도서명[일부]");
				count = System.in.read(bytes);
				String search = new String(bytes,0,count-2);
				int i = 0 ;//인덱스
				for(String temp : 도서목록) {
					if(temp.contains(search)) {
						//문자열.contains("찾을문자"): 문자열내 찾을문자가 true 있다 / false 없다 반환
						System.out.println("도서번호: " + i + " 교재명 "+temp);
					
					}
					i++;
				}
				//도서번호[ 인덱스] 받아서 수정하기
				System.out.println("도서번호 선택: ");
					count = System.in.read(bytes);
					String ch2 = new String ( bytes,0 ,count-2);
					 int index = Integer.parseInt(ch2);
				System.out.println("기존문자 : ");
				count = System.in.read(bytes);
				String oldstr = new String ( bytes,0 ,count-2);
				System.out.println("새로운 문자 : ");
				//수정내용 입력받기 
				count = System.in.read(bytes);
				String newstr = new String ( bytes,0 ,count-2);
				
				도서목록[index]= 도서목록[index].replace(oldstr, newstr); // 바꾼것을 다시 인덱스에 담아야함 
				//배열내 도서명= 수정된 도서명 
				System.out.println("변경되었습니다. ");
				
			}
		}
		
		
	}

}
