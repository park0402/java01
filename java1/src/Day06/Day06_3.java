package Day06;

import java.util.Scanner;


public class Day06_3 { 
	// ȸ���� ���α׷� [Ŭ���� ����]
		//0. ȸ�� ���� => ȸ�� Ŭ���������
			// 1. �ʵ�
				// 1. ���̵� 2.��й�ȣ 3. �̸� 4. ��ȭ��ȣ
	
		//1. �ʱ�޴� [ 1. ȸ������ 2. �α��� 3.���̵�/��й�ȣ ã��]
			// 1. ȸ�����Խ� �Է¹޾� ���� ���̵�,��й�ȣ,�̸�
			// 2. �α��ν� ���̵�� ��й�ȣ�� �����ϸ� �α���ó��
			// 3. ���̵�ã��� �̸��� ��ȭ��ȣ�� �����ϸ� ���̵� ���
			// 4. ��й�ȣ ã��� ���̵�� ��ȭ��ȣ�� �����ϸ� ��й�ȣ ���
	public static void main(String[] args) {
		//���� �����ϴ� ���� : main �޼ҵ� �������� ����ϱ� ����
		
		
		Scanner sc = new Scanner(System.in);
		Member[] memberlist = new Member[100]; 
		//Member Ŭ������ ������� ��ü 100���� �����Ҽ� �ִ� �迭�� ����
		
		while(true) { //���α׷� ���� ���ѷ���
			System.out.println("----------ȸ����[Ŭ��������]-----------");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4. ��й�ȣã��");
			System.out.println("����: "); int ch = sc.nextInt();
			
			if( ch==1 ) { //ȸ������
//				1. ȸ�� ���� �Է¹ޱ�
				System.out.println("---------ȸ������ ������-------");
				System.out.println("���̵�: "); String id = sc.next();
				System.out.println("��й�ȣ: "); String password = sc.next();
				System.out.println("�̸�: "); String name = sc.next();
				System.out.println("����ó: "); String phone = sc.next();
//				2. ��ü �ҷ����� 
				Member member = new Member();
//				3. �Է¹��� ���� 4���� ��ü�� ����
				member.id = id;
				member.password = password;
				member.phone = phone;
				member.name = name;
				
				// ���̵� �ߺ�üũ 1. �迭�� ��ü�� �Է��� ���̵�� ������ ���̵� ã��
				boolean idcheck = false;
				for( Member temp : memberlist) {
					if(temp !=null && temp.id.equals(id)) {
						System.out.println("�˸� )) ������� ���̵��Դϴ�. ");
						
						idcheck=true;
						break;
					}
				}
				if(idcheck == false) {
					int i = 0;
					for(Member temp : memberlist) {
						System.out.println("�˸�)) ����Ҽ��ִ� ���̵��Դϴ�.");
						break;
					}
				}

				
				
				
				
//				4. ������ ��ü�� �����ϴ� �迭������
				
				
				// 1. ���� �ε���ã��
				int i = 0;
				for(Member temp : memberlist ) {
					
					// *memberlist �迭�� member ��ü �ϳ��� �����ͼ� temp ���� �ݺ� 100���ݺ��ϴ°���
					// 2. ���鿡 �ε����� ��ü����	
					if(temp == null) { //100���ݺ��ߴµ� �װ� null�̸� ����
						memberlist[i] = member; // �ش� �ε����� ���� ������� ��ü ����
						break;//for ������ [�ȳ����� ��� ���鿡 ������ ��ü ����Ǳ⶧����]
					}
					i++; //�ε�������
			    
						
				} //for end
				
				
			} //ȸ�� ���� end
			else if ( ch==2) {
//				1. ���� �Է¹ޱ�.
				System.out.println("----------�α���������-----------"); 
				System.out.println("���̵� : "); String loginid = sc.next();
				System.out.println("��й�ȣ : "); String loginpassword = sc.next();
				boolean logincheck = false;
//				2.�����迭[ȸ������Ʈ] �� �Է¹��� ���� ��
				for( Member temp: memberlist ) {
					if(temp !=null && 
// 		��ü�� null�̶��� ���ٴ� ���̴� ��ü�� null�϶� equals�� �Ұ��ϴ�, null�� �ƴѻ��¿����� equals����
							temp.id.equals(loginid)&&temp.password.equals(loginpassword)) {
						System.out.println("�˸�)) �α��� ����");
						logincheck = true;
					}
					
					
				}//for end
				if( logincheck == false ) { // �α��μ����ÿ��� �Ʒ� �ڵ� ����Ұ� 
					System.err.println(" �˸�))  ȸ�������� �����ϴ�.");
			
				}
			}
			else if ( ch==3) {//���̵� ã�� 1. �̸�������ó�ޱ� 2. �迭���������̸� ����ó�ִ��� Ȯ�� 3. �����Ѱ�ü������ �ش���̵���� 4.������ ���ٰ� ���
				System.out.println("----------���̵�ã�� ������------------");
				System.out.println("�̸�: "); String name1 = sc.next();
				System.out.println("����ó:"); String number1 = sc.next();
				
				boolean findcheck = false;
				for(Member temp : memberlist ) {
					
					if(temp!=null && temp.name.equals(name1)&& temp.phone.equals(number1)) {
						System.out.println("�˸�))���̵�ã�⼺�� ");
						System.out.println("ȸ������ ID��:" + temp.id+ "�Դϴ�.");
						findcheck = true;
						break;
					}
				}
				
				if(findcheck==false) {
					System.out.println("�˸�)) �Է��Ͻ� ������ �����Ͻ� ���̵� �����ϴ�. ");
				}
			}
			else if ( ch==4) {
				System.out.println(" ȸ������ ���̵� �Է����ּ���.: "); String id1 = sc.next();
				System.out.println(" ȸ������ ��ȭ��ȣ�� �Է����ּ���.: "); String ph1 = sc.next();
				boolean findcheck =false;
				for(Member temp : memberlist ) {
					if(temp !=null && temp.id.equals(id1)&& temp.phone.equals(ph1)) {
						System.out.println("�˸�))��й�ȣ ã�� �����Ͽ����ϴ�");
						System.out.println("ȸ������ ��й�ȣ��: "+temp.password+"�Դϴ�.");
						findcheck = true;
						break;
						
					}
				}
				if(findcheck==false) {
					System.out.println("�Է��� ������ �����ʽ��ϴ�.");
					
				}
				
			}
			
			
			
		}
	}
}
