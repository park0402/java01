package Day05;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Day05_2 { // c s
	// ȸ���� �湮�� ���α׷�
		// 1. �ʱ�޴� [ 1. ȸ�� ���� 2. �α��� ]
			// 1. ȸ������ [ ���̵�, ��й�ȣ , �̸�]
			// 2. �α��� [���̵�, ��й�ȣ �����ϸ� �α���ó��]
		// 2. �α��ν� �޴� [1.�湮�Ͼ��� 2. �α׾ƿ� ]
			// 1. �湮�Ͼ��� [����, ���� , �ۼ���(�α��εȾ��̵�)]
			// 2. �α׾ƿ� [ �ʱ�޴��� ���ư���]
	public static void main(String[] args) { // m s
		//�غ�
		Scanner sc = new Scanner(System.in);
		//ȸ�� 100��[id,pw,name] �����ϴ� �迭
		String[][] memberlist = new String[100][3];
		//�湮�� 100��[title,contents, writer] �����ϴ� �迭
		String[][] boardlist = new String[100][3]; // �Խù��� 1��
		
		while(true) { //���ѷ��� [�������� : x] //wh s
			System.out.println("--------------ȸ���� �湮��---------------");
			System.out.println("--------------------------------------");
			System.out.println("-1.ȸ������ 2.�α��� ����:------------------");
			int ch = sc.nextInt();
			
			
			if(ch==1) { // if1 s
				System.out.println("------------ȸ������ ������---------");
				System.out.println("ID: "); String id = sc.next();
				System.out.println("Password: "); String pa = sc.next();
				System.out.println("Name: "); String na = sc.next();
				//string 3�� ������ �Է¹޾� memberlist 2���� �迭�� ����
					// 1. �����[����=0, ]�� ã�Ƽ� ���� [���࿡ ������� ������ ȸ�� 100�� �ʴ�]
					// 2. ���̵� �ߺ�üũ
				//���̵� �ߺ�üũ
				
			boolean idcheck = true; //�ߺ�üũ ���� true�̸� ���� false �̸� if �� �����¼��� ������ ����
			
			for( int i = 0 ; i<memberlist.length ; i++ ) {  // ȸ�����.length : �迭�� ���α��� => 100
				if( memberlist[i][0] != null && memberlist[i][0].equals(id) ) { // i��° id�� �����ϸ� 
							// ==null : ȸ��x , !=null : ȸ��o 
					System.err.println("�˸�)) : �ߺ��� ���̵� �����մϴ� ");
					
					idcheck = false; //���̵�üũ�� true�̸� ���� false �̸� if �� �����¼��� ������ ����
					break; // �ߺ�ã�� for ���� 
				}
			}
						
	////////////////////����κ�////////////////////////
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
				
				
			} //if 1 d
			
			else if (ch==2) { // eif s
				
				System.out.println("---------�α��� ������---------");
				System.out.println("ID: "); String id = sc.next();
				System.out.println("Password: "); String pa= sc.next();
				
				boolean logincheck = false;
				//�迭�� �����Ͱ� �Է¹��� id�� pass�� �����ϸ� �α���ó��
				
				for(int i =0; i<memberlist.length ; i++ ) {
					if( memberlist[i][0] !=null && memberlist[i][0].equals( id ) &&
							memberlist[i][1].equals(pa) ) {
					
					System.out.println("�˸� �α��� ����");//null �� == �� ���������� equals �� ����Ҽ�����
					logincheck = true; // �α��� ���� �� ���� 
	///////////////////////////////////////////////////////////////////////////////////////////////////////				
					
					while(true) {// �α��ν� �޴� ���ѷ��� [ ���� : �α׾ƿ� ] 
					
					System.out.println("-------------------------------");
					System.out.println("------�湮��----------------------");
					System.out.println("��ȣ\t�ۼ���\t����\t����");
					
					
						//��� �湮�� ����ϱ�
						for( int j = 0; j<boardlist.length ; j ++) {
							if(boardlist [j][0] != null) {
							
							System.out.printf("%d\t%s\t%s\t%s \n",
									j,
									boardlist[j][2],
									boardlist[j][0],
									boardlist[j][1]);
							}
						}
					
						System.out.println("--------1.�湮�ϳ����---2.�α׾ƿ�----"); int ch2 =sc.nextInt();
					
						if(ch2==1) {
							System.out.println(" �˸�)) �湮�� �����");
							System.out.println(" title : "); String title = sc.next();
							System.out.println(" content : "); String content = sc.next();
							//�迭�� ����ã�Ƽ� �����ϱ�
							for(int j =0; j<boardlist.length ; j++) {
								if(boardlist[j][0]==null) { //null �Ⱦ��� ���� ����� �� ����ã�ƾ���
									boardlist[j][0] = title;
									boardlist[j][1] = content; 
									boardlist[j][2] = id; //�α��ν� ���� id�� ����
									System.out.println("�˸�)) �湮���� �ۼ��Ǿ����ϴ�. ");
									break;
						
									}
							}
						}
					
						else if(ch2==2) {
							System.out.println(" �˸�)) �α׾ƿ��Ǿ����ϴ�. ");
						
						}	
						else { System.err.println(" �˸�)) �˼����� ��û�Դϴ�. ");
						}
						
						}
					
					}// for if ed
					
				} // eif -for ed
				
				if( logincheck == false ) System.err.println(" �˸�)) ȸ�������� ���ų� �ٸ��ϴ�.");
				
				
			} // eif d
			else {System.out.println("�˸�)) �˼� ���� �����Դϴ� .");}
		} // while d
		
	} // m d

} // c d
