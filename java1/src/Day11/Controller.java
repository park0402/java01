package Day11;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Controller {
	
	//��� �޼ҵ�� static
	//0. �Խù�����Ʈ
	public static ArrayList<Board> boardlist= 
			new ArrayList<>();

	
	//2.����޼ҵ�
	public static void write(String ����, String ���� ,String �ۼ���, String ��й�ȣ) {
		Board board = new Board (����, ���� ,��й�ȣ, �ۼ��� ) ;
		// 1. ��üȭ
		boardlist.add(board);
		// 2. ����Ʈ�� ����
		save();
		// 3. ���Ͽ� ����
		
	}

	//4.�����޼ҵ�
	public static void update(int index, String password, String title, String content) {
		if(password.equals(boardlist.get(index).getPassword() )) {
			//�н����尡 �����ϸ� ����ó��
			boardlist.get(index).setTitle(title);
			boardlist.get(index).setContent(content);
			//���� ������Ʈ
			save();
		}
	}
	//5.�����޼ҵ�
	public static boolean delete(int index, String password) {
		if(password.equals(boardlist.get(index).getPassword())){
			boardlist.remove(index); //����Ʈ.add():�߰� ����Ʈ.get ():ȣ�� ����Ʈ.remove():����
			save();
			return true;
		}else {
			
			return false;
}
		
	}
	//6.��۾���޼ҵ�
	public static void replywrite() {}
	//7.�Խù�����޼ҵ�
	public static void save() {
		try {
			// 1. ������� Ŭ����
		FileOutputStream outputStream = new FileOutputStream("C:/mine_data/�Խù�����.txt");
			// 2. ���Ͽ� �ۼ��� ����[���پ� �Խù��ϳ��� ��ü1���� ]
		for(Board board: boardlist) {
			String �ۼ����� = board.getTitle() + ","+board.getContent()+","
		+board.getPassword()+","+board.getWriter()+", "+
					board.getViewcount()+","+board.getDate()+"\n";
			outputStream.write(�ۼ�����.getBytes());

		}
		}catch(Exception e) {
			System.err.println("�˸�)) �������� ���� ������ ���� ����");
		}
	}
	
	//8.�Խù��ҷ�����޼ҵ�
	public static void load() {
		try {
			FileInputStream inputStream = new FileInputStream("C:/mine_data/�Խù�����.txt");
			//1. �����Է�Ŭ����
			byte[] bytes = new byte[1000];
			//2. ����Ʈ�迭 ����
			inputStream.read(bytes);
			//3. ��� ����Ʈ �о�ͼ� ����Ʈ�� ����
			String file = new String(bytes);
			String[] boards = file.split("\n");
			//4. ����Ʈ-> ���ڿ� ��ȯ
			int i =0 ;
			for( String temp : boards ) {//
				if( i+1 == boards.length )break; //������ �ε���[��ü]���� �����������Ҽ������Ƿ�
				String[] field = temp.split(",");
				Board board = new Board ( field[0],field[1],field[2],
						field[3],Integer.parseInt(field[4]),field[5],null); //7.��üȭ
				// ��ȸ���� �ʵ�� �������̹Ƿ� ���������� ����ȯ [Integer.parseInt(���ڿ�)]
				boardlist.add(board); // 8. ����Ʈ���
				i++; //�ε���
				}
			//5. ���ڿ��ڸ��� [���پ�[\n] -> 1����ü]
			 
		}catch(Exception e) {System.err.println("�˸�)) ���Ϸε忡 �����Ͽ����ϴ� "+e);}

			
	
	}


}
