package Day07;

public class Member {
	// 1. �ʵ�
	int mno ;
	String id;
	String password;
	String name;
	String phone;
		//ȸ����ȣ ���̵� ��й�ȣ �̸� ����ó
	
	// 2.������ [ �����ڸ� == Ŭ������ ]
	// 1. �������[�⺻������] : �޼ҵ�ȣ��� ��ü������
	public Member() { }
	// 2. ��� �ʵ带 �޴� ������ : ȸ�����Կ� ��ü������
	public Member(int mno, String id, String password, String name, String phone) {
		this.mno = mno;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	
	// 3. �޼ҵ� 
// ȸ������ 
	boolean ȸ������() {   
		System.out.println( " ȸ�� ���� ������ �Դϴ�. ");
		System.out.println("���̵�: "); String id  = BookApplication.scanner.next();
		System.out.println("��й�ȣ: "); String password = BookApplication.scanner.next();
		System.out.println("�̸�: "); String name = BookApplication.scanner.next();
		System.out.println("����ó: "); String phone = BookApplication.scanner.next();
		//scanner ��ü�� �ٸ� Ŭ������ static����Ǿ��ִ°��� �ҷ�����
		
		//*���̵� �ߺ�üũ
		for (Member temp : BookApplication.members ) {
			if(temp != null&& temp.id.equals(id)) {
				//���࿡ ������ �ƴϸ鼭 �迭�� id�� �Է¹��� id�� �����ϸ� 
				System.out.println("�˸�)) ���� ������� ���̵��Դϴ� .");
				return false; //�Լ����� -> ���̵� �ߺ��Ǿ��� ������ �Լ� ����
			}	
		}		
	
		
			// ȸ�� ��ȣ �ڵ����� [���� �ֱٿ� ������ ȸ���ǹ�ȣ + 1]
		
			int bno = 0;
			int j = 0 ;
			for (Member temp : BookApplication.members) {
				if(temp == null ) {
					if( j == 0) {
						bno =1; break; 
						
					
					
				}
				
				else {
					
					bno = BookApplication.members[j-1].mno +1 ;
						//null ��[������ȸ��]��ȣ+1
				
					break;
				
				
				}
					
			 }		
				j++;
				
				
			}
		

		
		
		
		
		
		
		//2. 4������ -> ��üȭ -> 1��
		
		Member member = new Member ( bno, id,password, name , phone);
	
		int i = 0;
		for(Member temp : BookApplication.members ) {
			if(temp == null) {//������̸�
				BookApplication.members[i] = member;
		System.out.println(" �˸�)) ȸ������ ȸ����ȣ : " + bno);
			
				return true; //ȸ������ �޼ҵ� ����~~~~[��ȯ :true]
			
			}
			i++; //i����
		
		}
		
		return false;
	
			//4. ���Լ����� true ��ȯ ���н� false ��ȯ
	}
	
	
//	�α��� 
	String �α���() { System.out.println( " �α��� â ");
		return "���̵�";
	}
//	���̵�ã�� 
	void ���̵�ã�� () {System.out.println( " ���̵� ã�� �����Դϴ�.");
	 System.out.println("�̸�"); String name = BookApplication.scanner.next();
	 System.out.println("����ó"); String phone = BookApplication.scanner.next();
	 
	 for(Member temp : BookApplication.members) {
		 if(temp != null && temp.name.equals(name)&&temp.phone.equals(phone)) {
			 System.out.println("�˸�) ȸ������ ���̵�� : " + temp.id + "�Դϴ�. ");
			 return;
			 
		 }
		 
	 }
	
		
	}
//	��й�ȣã��
	void ��й�ȣã�� () { System.out.println(" ��й�ȣ ã�� �����Դϴ�. ");
		System.out.println("���̵�: "); String id = BookApplication.scanner.next();
		System.out.println("��й�ȣ: "); String phone = BookApplication.scanner.next();
		for(Member temp: BookApplication.members ) {
			if(temp != null && temp.name.equals(id)&&temp.phone.equals(phone)) {
				System.out.println("ȸ������ ��й�ȣ��: " + temp.password+ " �Դϴ� . ");
				return;
			
			}
		
		
		
		}	
		System.out.println(" �˸�]] ������ ȸ�������� �����ϴ�. ");
		
		}
//	ȸ��Ż��
	void ȸ��Ż��(){
		
	}

}
