package Day08_����Ϲ�ũ;

import java.util.Scanner;

public class Member {
	// 1. �ʵ�
	int bankn; //������ȣ
	String id; //���̵�
	String password; //��й�ȣ
	String name; //�̸� 
	String phone; //����ó
	

	
	// 2. ������
	
	public Member() {} //2-1 �������
	
	
	public Member(int bankn, String id, String password, String name, String phone) {
		super();
		this.bankn = bankn ; 
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	

	
	
	// 3. �޼ҵ� ȸ������/ �α���/ ���̵� ��й�ȣã�� 
	
	
//			1. ȸ������ �޼ҵ�
	boolean ȸ������() {   
		System.out.println( " ȸ�� ���� ������ �Դϴ�. ");
		System.out.println("���̵�: "); String id  = BankApplication.scanner.next();
		System.out.println("��й�ȣ: "); String password = BankApplication.scanner.next();
		System.out.println("�̸�: "); String name = BankApplication.scanner.next();
		System.out.println("����ó: "); String phone = BankApplication.scanner.next();
		//scanner ��ü�� �ٸ� Ŭ������ static����Ǿ��ִ°��� �ҷ�����
		
		//*���̵� �ߺ�üũ
		for (Member temp : BankApplication.members ) {
			if(temp != null&& temp.id.equals(id)) {
				//���࿡ ������ �ƴϸ鼭 �迭�� id�� �Է¹��� id�� �����ϸ� 
				System.out.println("�˸�)) ���� ������� ���̵��Դϴ� .");
				return false; //�Լ����� -> ���̵� �ߺ��Ǿ��� ������ �Լ� ����
			}	
		}		
	
		
			// ȸ�� ��ȣ �ڵ����� [���� �ֱٿ� ������ ȸ���ǹ�ȣ + 1]
		
			int bankn = 0;
			int j = 0 ;
			for (Member temp : BankApplication.members) {
				if(temp == null ) {
					if( j == 0) {
						bankn =1; break; 
					}
					else { //ù��° ȸ���̾ƴϸ�
						bankn = BankApplication.members[j-1].bankn +1 ;
						//null ��[������ȸ��]��ȣ+1
					
						break;
					}
				}		
				j++; //�ε�������
			}
		 // 4�������� ��üȭ ��Ű�� -> 1���� 
		Member member = new Member( bankn ,id, password, name , phone);
	
		int i = 0;
		for(Member temp : BankApplication.members ) {
			if(temp == null) {//������̸�
				BankApplication.members[i] = member;
				System.out.println(" �˸�)) ȸ������  " + bankn+ "��° �����Դϴ�.");
				return true; //ȸ������ �޼ҵ� ����~~~~[��ȯ :true]
			
			}
			i++; //i����
		
		}
		//4. ���Լ����� true ��ȯ ���н� false ��ȯ
		return false; //ȸ�� ���� �޼ҵ� ����~~~[��ȯ: false]
	
			
	}
	
	
//	�α��� �޼ҵ�
	
	String �α���() { 
		System.out.println( "--- �α��� â--- ");
	// 1. �Է�
		System.out.println("���̵�: "); String id = BankApplication.scanner.next();
		System.out.println("��й�ȣ: "); String password = BankApplication.scanner.next();
	// 2. �迭�� ��ü id�� password �� �Է��� ���� �����ϸ�
		for(Member temp:BankApplication.members) {
			if(temp != null && temp.id.equals(id)
					&&temp.password.equals(password)) {
				return temp.id;
			}
		}
		
		
		return null; // ���н� null 
	}
//	���̵� ã�� �޼ҵ�
	void ���̵�ã�� () {System.out.println( " ���̵� ã�� �����Դϴ�.");
	 System.out.println("�̸�"); String name = BankApplication.scanner.next();
	 System.out.println("����ó"); String phone = BankApplication.scanner.next();
	 
	 for(Member temp : BankApplication.members) {
		 if(temp != null && temp.name.equals(name)&&temp.phone.equals(phone)) {
			 System.out.println("�˸�) ȸ������ ���̵�� : " + temp.id + "�Դϴ�. ");
			 return;
			 
		 }
		 
	 }
	
		
	}
//	��й�ȣã��
	void ��й�ȣã�� () { System.out.println(" ��й�ȣ ã�� �����Դϴ�. ");
		System.out.println("���̵�: "); String id = BankApplication.scanner.next();
		System.out.println("��й�ȣ: "); String phone = BankApplication.scanner.next();
		for(Member temp: BankApplication.members ) {
			if(temp != null && temp.name.equals(id)&&temp.phone.equals(phone)) {
				System.out.println("ȸ������ ��й�ȣ��: " + temp.password+ " �Դϴ� . ");
				return;
			
			}
		
		
		
		}	
		System.out.println(" �˸�]] ������ ȸ�������� �����ϴ�. ");
		
		}
	
	


	
	

	
	

}

	


