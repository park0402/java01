package Day12;

import java.io.IOException;

public class Day12_3 {
	
	//���� �˻� ���α׷�
	//����
	//1.�Է¹ޱ� [System.in.read()]
	//2. String �迭�� �̿��� �������� ������ ����
		//1. String[] ������� = {
		// " �ȴ�! ���̹� ��α�&����Ʈ".
		// " ������ ��Ʈ ���� Ȱ�� ������",
		// " ȥ�� �����ϴ� C ���"
		// " Tucker�� Go ��� ���α׷���",
	//3. �˻����,�������
		//�˻����: Ư�� ���ڸ� �Է¹޾� ������ ���Ե� ���ڰ� ������ ��� ��� 
			//'���' �˻� -> " Tucker�� Go ��� ���α׷���", /" ȥ�� �����ϴ� C ���"
		//�������: ������ �������� �Ϻθ� �Է¹޾� ��µ� �������� ��ȣ�� ���� replace
			//'����' ���� -> ���õ� �������� ������ ���� �Է� -> �����Ϸ�
	public static void main(String[] args) throws IOException {
		String[] ������� = {" �ȴ�! ���̹� ��α�&����Ʈ",
				" ������ ��Ʈ ���� Ȱ�� ������",
				" ȥ�� �����ϴ� C ���",
				" Tucker�� Go ��� ���α׷���"};
		//1.�޴�
		while(true) {
			System.out.println("1.�˻� 2. ����  ");
			
			byte[] bytes = new byte[100];
			int count = System.in.read(bytes); //Ű����κ��� [��Ʈ��] ����Ʈ�� �о���� //�Ϲݿ��� ���ѱ�� 
			String ch = new String (bytes, 0 , count-2); 
			//����Ʈ�迭 --> ���ڿ���ȯ [-2����=\n\r�� �ڵ����� ���ͼ� ����Ʈ �迭���� ���־��Ѵ�]
			
			if(ch.equals("1")) {
				System.out.println("****�˻�****"); 
				System.out.println("�˻�:  "); count = System.in.read(bytes);
				String search = new String (bytes, 0 ,count-2); //ã������
				
				System.out.println("�˻����");
				for(String temp : ������� ) {//��� �迭�� ���ڿ� �ϳ��� �������� 
					//indexOf �޼ҵ� -1 ��ȯ�Ǵ� ���
					
//					if( temp.indexOf(search) != -1 ) { // �ش� ���ڿ��� ã�������� �ε����� �����ϸ�
//					// indexOf �޼ҵ� -1 ��ȯ�Ǵ°��� ������ �ܾ ������� [ �˻�x]
//					System.out.println( temp ); // �ش� ���ڿ��� ã�����ڰ� �����ϸ� ��� 
//				}
				// ���2
				if( temp.contains(search) ) {	
					// ���ڿ�.contains("ã������") : ���ڿ��� ã�����ڰ� true[�ִ�] / false[����] ��ȯ
					System.out.println( temp );
				}
					
				
			 }
			
			}else if( ch.equals("2")) {
				System.out.println("****����****");
				System.out.println("������ ������[�Ϻ�]");
				count = System.in.read(bytes);
				String search = new String(bytes,0,count-2);
				int i = 0 ;//�ε���
				for(String temp : �������) {
					if(temp.contains(search)) {
						//���ڿ�.contains("ã������"): ���ڿ��� ã�����ڰ� true �ִ� / false ���� ��ȯ
						System.out.println("������ȣ: " + i + " ����� "+temp);
					
					}
					i++;
				}
				//������ȣ[ �ε���] �޾Ƽ� �����ϱ�
				System.out.println("������ȣ ����: ");
					count = System.in.read(bytes);
					String ch2 = new String ( bytes,0 ,count-2);
					 int index = Integer.parseInt(ch2);
				System.out.println("�������� : ");
				count = System.in.read(bytes);
				String oldstr = new String ( bytes,0 ,count-2);
				System.out.println("���ο� ���� : ");
				count = System.in.read(bytes);
				String newstr = new String ( bytes,0 ,count-2);
				
				�������[index].replace(oldstr, newstr);
				System.out.println("����Ǿ����ϴ�. ");
				
			}
		}
		
		
	}

}
