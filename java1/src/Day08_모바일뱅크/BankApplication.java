package Day08_����Ϲ�ũ;



import java.util.Scanner;

public class BankApplication {
	

	
	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[1000];
	static Bank[] Bank = new Bank[1000];
	
	
	public static void main(String[] args) { // main s
		
				BankApplication application = new BankApplication();
				application.menu();
				
	} // main end  
	// 1. �ʱ� �޴� �޼ҵ�
	void menu() {
		while( true) { 
			System.out.println("-------------- ����Ϲ�ũ -------------");
			System.out.print("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã�� : ");
			int ch = scanner.nextInt();
			Member member = new Member();
			if( ch == 1 ) {
				member.ȸ������();// ȸ������ �޼ҵ� ȣ�� 
				boolean result = member.ȸ������();
				
				if(result) System.out.println("�˸�) ȸ������ ���"); 
				else System.err.println("�˸�) ȸ�� ���� ����"); 
			} 
			else if( ch ==2 ) {
				String result = member.�α���(); // �α��� �޼ҵ� ȣ�� 
					
				if(result ==null) {
					System.err.println( " �α��ο� �����Ͽ����ϴ�. ȸ�������� Ȯ�����ּ��� .");
				} else if(result.equals("admin")) {
					System.out.println("�˸�))����� �޴��Դϴ�. "+result+"��"); //����� ������
					adminmenu();
				} else { //�� �޴� 
					System.out.println("ȯ���մϴ�"+result+"��!");
					membermenu(result);
				}
			}
			else if( ch ==3 ) {
				member.���̵�ã��();// ���̵� ã�� �޼ҵ� ȣ�� 
			}
			else if( ch ==4 ) {
				member.��й�ȣã��(); // ��й�ȣ ã�� �޼ҵ� ���� 
			}
			else {
				System.err.println(" �˸�]] �˼� ���� ��ȣ�Դϴ�. ");
			} 
		}
	} // menu end 
	
	// 2. �Ϲ�ȸ�� �޴� �޼ҵ�
	void membermenu( String loginid  ) { // �μ� �������� �޶� ������ �ڷ��� ���� 
		while(true) {
			System.out.println(" --------------- ȸ�� �޴� ------------------");
			System.out.print("1.���»��� 2.�Ա� 3.��� 4.������ü 5.�α׾ƿ� ���� : ");
			int ch = scanner.nextInt();
			Bank Bank = new Bank(); // ������ڷ� ��ü => �޼ҵ� ȣ���
			if( ch == 1 ) 		{ Bank.���»���(); }
			else if( ch ==2 ) 	{ Bank.�Ա�(); }
			else if( ch == 3 ) 	{ Bank.���(); }
			else if( ch == 4 ) 	{ Bank.������ü(); }
			else if( ch == 5 ) 	{ return; } // �Ϲ�ȸ���޴� �޼ҵ� ���� [ �α׾ƿ� ] 
			else { System.err.println(" �˸�]] �˼� ���� ��ȣ�Դϴ�. "); }
		}
	} // �Ϲ�ȸ�� �޴� ���� 
	// 3. ������ �޴� �޼ҵ� 
	void adminmenu() {
		while(true) {
			System.out.println(" --------------- ������ �޴� ------------------");
			System.out.print("1.�����ǰ��� 2.�����ǰ���� 3. ������ ���4 . �α׾ƿ� ���� : ");
			int ch = scanner.nextInt();
				Loan Bank = new Loan();
			if( ch == 1 ) 		{ }
			else if( ch == 2 ) 	{ }
			else if( ch == 3 ) 	{ }
			else if( ch == 4 ) 	{ }		// �����ڸ޴� �޼ҵ� ���� 
			else { System.err.println(" �˸�]] �˼� ���� ��ȣ�Դϴ�. "); }
		}
	}
	
	
} // class end 












