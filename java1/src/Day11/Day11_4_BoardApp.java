package Day11;

import java.util.Scanner;

public class Day11_4_BoardApp {
	/*	
	 *  �Խ���+ ��� ���α׷�	
	 *  �Խù� Ŭ����
	 *  		// ��ȣ=�ε��� , ����, ���� ,�ۼ��� ,�ۼ��� , ��ȸ��
	 *  ��� Ŭ����
	 *  		// �Խù� ��ȣ
	 *  ��Ʈ�ѷ� Ŭ����
	 *  		// 1. ��� 2. ���� 3. ���� 4. ���� 5. ���� 6.��۾���
	 *  Day11_4_BoredApp Ŭ����
	 *  	//����� [ �Է¹޾� ��Ʈ�ѷ����� �Է¹��������� 
	 */
	public static void main(String[] args) {
		Controller.load(); // 2. ���� [ ���Խù� �ҷ����� ]
		Scanner scanner = new Scanner(System.in); //1.�Է°�ü
		
		while(true) {
			try{//���ܹ߻� : ����ڰ� �����Է½� ���ܹ߻� catch�� �̵�
				//��� �Խù� ���
				System.out.printf("%s\t%10s\t%10s\t%10s\t%2s\t \n" ,"��ȣ","����","�ۼ���","�ۼ���","��ȸ��");
				int i = 0; // ����Ʈ�� �ε���
				for(Board board: Controller.boardlist) {
					System.out.printf("%2s\t%10s\t%10s\t%10s\t%2s\t \n", i , board.getTitle(),
							board.getWriter(),board.getDate(),board.getViewcount() ); 
							i++; 
				}
				System.out.println("1.���� 2. ���� ");
				int ch = scanner.nextInt();
				if(ch==1) {
					System.out.println("***�Խù� ���***"); //next ���� x nextLine�� ���� o
					scanner.nextLine();
					//nextLine() : �������� �Է°��� [����! : nextLine �տ� next �ϳ��� ����ؼ� �������
					// �ذ���; �Ϲ�next�� nextLine ���̿� nextLine()
					System.out.println("����: "); String ���� = scanner.nextLine();
					System.out.println("����: "); String ���� = scanner.nextLine();
					System.out.println("�ۼ���: "); String �ۼ��� = scanner.next();
					System.out.println("��й�ȣ[����/������]: "); String ��й�ȣ = scanner.nextLine();
					Controller.write(����, ����, �ۼ��� ,��й�ȣ); //�μ�����
				}
				else if(ch==2) {
					//�ش� �Խù� ��ȣ�� �Է¹޾� �Խù����� ��� ���
					System.out.println("�Խù� ��ȣ: "); int index = scanner.nextInt();
					
					//�ش� �ε��� ��� 
					try{Board temp = Controller.boardlist.get(index);
					System.out.println("*****�Խù�����****");
					System.out.println("���� : "+ temp.getTitle() );
					System.out.println("�ۼ��� : "+ temp.getWriter()+"�ۼ���: " + temp.getDate() + temp.getDate() + "��ȸ��: " +temp.getViewcount());
					System.out.println("���� : " + temp.getContent() );
					System.out.println("1. �ڷΰ��� 2. ���� 3. ���� 4. ��۾��� ����: ");
					//�޴�
					int ch2 = scanner.nextInt();
					if(ch2==1) {}
					else if (ch2 ==2 ) {
						System.out.println(" �� �Խù� �н����� "); String password = scanner.next();
						scanner.nextLine(); 
						System.out.println(" ���� ����: "); String title = scanner.nextLine();
						System.out.println(" ���� ����: "); String content = scanner.nextLine();
						Controller.update(index,password,title,content); //������ �ε��� ��ȣ,�н�����,üũ,������ ����, ������ ���� 
					}
					else if (ch2 ==3 ) {
					System.out.println("�� �Խù� �н����� : "); String password = scanner.next();
					Controller.delete(index,password);
					boolean result = Controller.delete(index, password);
					if(result) {System.out.println("�˸�) ��������");}
					else System.out.println("�˸�)�������� ��й�ȣ�� �ٸ��ϴ�");
					
					}
					else if (ch2 ==4 ) {Controller.replywrite();//�ε�����ȣ,��۳����н������
					}
					else {}
					}catch(Exception e){
						System.err.println( " �޼��� )����Ҽ����� ��ȣ�Դϴ�");
						scanner =new Scanner(System.in);
					}
				}
				else {}
			}catch(Exception e) {
				System.err.println("����))���ڸ� �Է����ּ���. [�ٽ��Է�] "); //console�� �����޽��� �ݺ���
				scanner= new Scanner(System.in); //���� �ݺ����ϱ����� ���� �Է¹ޱ�
			}
			
		}
	
	}
}
