package ��2;

import java.util.Scanner;

	//1. ���ѷ��� ���۽� ����ǥ ��� �迭 �� �������
	//2. ���� ���� ��� 1������ �ʱ�ȭ 

public class ����ǥ���� { // c s
	
	public static void main(String[] args) { // m  s
		
		//1. �⺻���� 1.��ĳ���� 2. �迭����
		Scanner sc = new Scanner(System.in);
		�л�[] stu = new �л�[100];  //�迭 100��
		//2. �޴� 1�� 2�� �Է¹ޱ� ���ѷ�������
		
		while(true) {// ���ѷ��� ���� w s
			try {//���� �߻�ó�� ���ڿ� �ٸ��� �Է�������
				System.out.println("---------------------------------------------------");
				System.out.println("                        ����ǥ                       ");
				System.out.println("---------------------------------------------------");
		
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s \n","��ȣ","�̸�","����","����","����","����","���","����");			
				for (int i= 0; i<stu.length ; i++) {
					if(stu[i] != null) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
								stu[i].get��ȣ(),stu[i].get�̸�(),stu[i].get����()
								,stu[i].get����(),stu[i].get����(),stu[i].get����(),stu[i].get���(),i+1 );
					}else {
						break;
						
					}
				} //for end
				System.out.println("----------------------------");
				System.out.println("1.�л����� ���2.�л����� ����");
				int ch = sc.nextInt();
				if(ch==1) { //1. �л� ���� ��� �Է¹ޱ�
					System.out.println("�л������� ������ּ���.");
					System.out.println("��ȣ: "); int ��ȣ = sc.nextInt();
					System.out.println("�̸�: "); String �̸� = sc.next();
					System.out.println("����: "); int ���� = sc.nextInt();
					System.out.println("����: "); int ���� = sc.nextInt();
					System.out.println("����: "); int ���� = sc.nextInt();
					//2. �Է°�
					int ����= ����+����+����; 
					double ���= (double)���� / 3;
					//3. ��üȭ
					�л� ������ü = new �л�(��ȣ,�̸�,����,����,����,����,���);
					//4. ��ü ����
					for(int i =0; i<stu.length; i++) {
						if(stu[i]==null) {
							stu[i]=������ü; 
						break;
						
						}
						
					}// for2 end
				}//1.�л�������� ��
//				if(stu[1]!=null) {
//					for(int i =0 ; i <stu.length; i++) {
//						
//						for(int j = i + 1; j <stu.length; i++) {
//							if(stu[i].get����()<stu[j].get����()) {
//								System.out.println(stu[i].get����()+ ","+stu[j].get����());
//								�л� temp = stu[i]; 
//								stu[i] = stu[j];
//							    stu[j] = temp;
//							} //if-if end	
//					
//						} // if-for-for end
//					} //if-for end
//					
//				} //���� if end				

				

			else if (ch==2) { //��������
				System.out.println("�л������� �����մϴ�. �л���ȣ�� �Է����ּ���.");
				int �л���������= sc.nextInt();
				boolean ���� = false;
				for(int i=0 ;i<stu.length ;i++) {
					if(stu[i].get��ȣ() == �л���������) {
						stu[i]=null;
						for(int j=i; j< stu.length; j++) {
							stu[j]=stu[j+1];
						}
						System.out.println("������ �����߽��ϴ�.");
						����= true;
						break;
					
					
					}
				}
				if (����==false) {
					System.err.println("�ش��ȣ�� �л��� �����ϴ�.");
				}
			
			}
			else {
				 System.err.println("��ȣ��Ȯ�����ּ���.");
			}
						
				
			
				
				
				
				
			}catch(Exception a) { System.out.println("�˸�)) �߸��� �Է����ִ��� Ȯ�����ּ���.");
				
				
			}//catch end
			
			 
		}// w s
			
		
		
	} // m  d
	

} // c d