package Day05;

import java.util.Scanner;

public class Day05_�����뿩���α׷� { // c s
	public static void main(String[] args) { // m s
		Scanner sc = new Scanner(System.in);
		//ȸ�� 100��[id,pw] �����ϴ� �迭
		String[][] memberlist = new String[100][3];
		//���� 100��[������,�뿩����(�뿩����,�뿩��),�뿩��(�α��νþ��̵�)] �����ϴ� �迭
		String[][] boardlist = new String[100][3]; // ������ϴ� 1��
		
		while(true) { //wh s
			System.out.println("���� ���� ���α׷�---------------");
			System.out.println("----------------------------");
			System.out.println("1.ȸ������ 2.�α��� ����:---------");
			int ch = sc.nextInt();
			
			if(ch==1) { // if1 s
				System.out.println("------------ȸ������ ������---------");
				System.out.println("ID: "); String id = sc.next();
				System.out.println("Password: "); String pa = sc.next();
				System.out.println("Name: "); String na = sc.next();
				
		
			boolean idcheck = true; 
			
			for( int i = 0 ; i<memberlist.length ; i++ ) {  
				if( memberlist[i][0] != null && memberlist[i][0].equals(id) ) {  
							
					System.err.println("�˸�)) : �ߺ��� ���̵� �����մϴ� ");
					
					idcheck = false; 
					break;  
				}
			}
			if( idcheck ) {
				for( int i= 0; i<memberlist.length ; i ++) { // if-for s
					//i < memberlist.length ����� = 100 
					if(memberlist [1][0] == null) { //i��°�࿡ id�� ������ = �����
				
						memberlist[0][0] = id;
						memberlist[0][1] = pa;
						memberlist[0][2] = na;
						System.out.println("�˸�))) ȸ�������� �Ϸ� �Ǿ����ϴ�. ");
						break; //���������鳡
				
						} //if-for-if d
				
					} // if-for d
				}//if
			
			
			} // if 1 d
			
				else if (ch==2) { // 2��° ���� ����
					
				
				System.out.println("---------�α��� ������---------");
				System.out.println("ID: "); String id = sc.next();
				System.out.println("Password: "); String pa= sc.next();
				
				boolean logincheck = false;
				
				
				for(int i =0; i<memberlist.length ; i++ ) {
					if( memberlist[i][0] !=null && memberlist[i][0].equals( id ) &&
							memberlist[i][1].equals(pa) ) {
					
					
					logincheck = true; 
					System.out.println("�˸�))) �α��� ����");
					
						while(true) {// �α��ν� �޴�
						}
					}
					
					
					
					else if(logincheck == false) {
						System.err.println("���� ! �α��� ������ �ٸ��ų� �����ϴ�.");
					break;
					}
					
					System.out.println("1.�����˻�\t2.�������\t3.�����뿩\t4.�����ݳ�\t5.�α׾ƿ� ");
					break;
					
					} //for end
					
					
					
					
						
					
					
					
				
			     
				} // 2��° ���� ��
			
				
		 } //wh d
			
	
	} // m d
	
	
	
} // c d


