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
				
				boolean insertbook = false;
				
				for(int i =0; i<memberlist.length ; i++ ) {
				    
					if(id.equals("admin")){  //������ �޴��� �����������
						System.out.println("������ �޴��Դϴ�");
						System.out.println("1.�������\t2.�������\t3.��������\t4.�α׾ƿ�"); int ��ȣ1 =sc.nextInt();
						
						insertbook = true; 
						
						if(��ȣ1==1) { 

						System.out.println(" ���� : "); String title = sc.next();
						System.out.println(" �۰� : "); String content = sc.next();

							 
								
								
							
				
									
								System.out.println("-------------------------------");
								System.out.println("------�������----------------------");
								System.out.println("��ȣ\t�����\t����\t�۰�");
								
							 
							
						
					
					
						}	//if ed
					
				
				
							
						else if(��ȣ1==2) {
							

							for( int j = 0; j<boardlist.length ; j ++) {
							if(boardlist [j][0] != null) {
							
							System.out.printf("%d\t%s\t%s\t%s \n",
									j,
									boardlist[j][2],
									boardlist[j][0],
									boardlist[j][1]);
							}
						}}
						else if(��ȣ1==3) {System.out.println(" �˸�)) ������ �����մϴ�.");}
						else if(��ȣ1==4) { System.out.println(" �˸�)) �α׾ƿ��Ǿ����ϴ�. ");}
						else { System.out.println("�߸��� �Է��Դϴ�. �ʱ�޴��� ���ư��ϴ�");}
						
					break;
						
						
						
						
					} // admin if d
					
					else if( memberlist[i][0] !=null && memberlist[i][0].equals( id ) &&
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


