package Day11;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Controller {
	
	//모든 메소드는 static
	//0. 게시물리스트
	public static ArrayList<Board> boardlist= 
			new ArrayList<>();

	
	//2.쓰기메소드
	public static void write(String 제목, String 내용 ,String 작성자, String 비밀번호) {
		Board board = new Board (제목, 내용 ,비밀번호, 작성자 ) ;
		// 1. 객체화
		boardlist.add(board);
		// 2. 리스트에 저장
		save();
		// 3. 파일에 저장
		
	}

	//4.수정메소드
	public static void update(int index, String password, String title, String content) {
		if(password.equals(boardlist.get(index).getPassword() )) {
			//패스워드가 동일하면 수정처리
			boardlist.get(index).setTitle(title);
			boardlist.get(index).setContent(content);
			//파일 업데이트
			save();
		}
	}
	//5.삭제메소드
	public static boolean delete(int index, String password) {
		if(password.equals(boardlist.get(index).getPassword())){
			boardlist.remove(index); //리스트.add():추가 리스트.get ():호출 리스트.remove():삭제
			save();
			return true;
		}else {
			
			return false;
}
		
	}
	//6.댓글쓰기메소드
	public static void replywrite() {}
	//7.게시물저장메소드
	public static void save() {
		try {
			// 1. 파일출력 클래스
		FileOutputStream outputStream = new FileOutputStream("C:/mine_data/게시물파일.txt");
			// 2. 파일에 작성할 내용[한줄씩 게시물하나에 객체1개씩 ]
		for(Board board: boardlist) {
			String 작성내용 = board.getTitle() + ","+board.getContent()+","
		+board.getPassword()+","+board.getWriter()+", "+
					board.getViewcount()+","+board.getDate()+"\n";
			outputStream.write(작성내용.getBytes());

		}
		}catch(Exception e) {
			System.err.println("알림)) 파일저장 실패 관리자 에게 문의");
		}
	}
	
	//8.게시물불러오기메소드
	public static void load() {
		try {
			FileInputStream inputStream = new FileInputStream("C:/mine_data/게시물파일.txt");
			//1. 파일입력클래스
			byte[] bytes = new byte[1000];
			//2. 바이트배열 선언
			inputStream.read(bytes);
			//3. 모든 바이트 읽어와서 바이트에 저장
			String file = new String(bytes);
			String[] boards = file.split("\n");
			//4. 바이트-> 문자열 변환
			int i =0 ;
			for( String temp : boards ) {//
				if( i+1 == boards.length )break; //마지막 인덱스[객체]제외 공백을제외할수없으므로
				String[] field = temp.split(",");
				Board board = new Board ( field[0],field[1],field[2],
						field[3],Integer.parseInt(field[4]),field[5],null); //7.객체화
				// 조회수는 필드는 정수형이므로 정수형으로 형변환 [Integer.parseInt(문자열)]
				boardlist.add(board); // 8. 리스트담기
				i++; //인덱스
				}
			//5. 문자열자르기 [한줄씩[\n] -> 1개객체]
			 
		}catch(Exception e) {System.err.println("알림)) 파일로드에 실패하였습니다 "+e);}

			
	
	}


}
