package Day08_����Ϲ�ũ;

import java.util.Scanner;


public class Loan {
	
	// 1. �ʵ�
	private double ����; 
	private int ����; 
	private int �����ݾ�; 
	private String �����ǰ��;	
	private String id ;
	private String ��ȯ����;
	//2. ������
	 public Loan() {}
	 
	public Loan(double ����, int ����, int �����ݾ�, String �����ȯ��, String �����ȯ��, String id,String ��ȯ����) {
		
		this.���� = ����;
		this.���� = ����;
		this.�����ݾ� = �����ݾ�;	
		this.�����ǰ�� = �����ǰ��;
		this.id = id;
		this.��ȯ���� = ��ȯ����;
		
		}

	
	

	
		
	
	// 3. �޼ҵ� 
	
	void �����ǰ���(){
		System.out.println("�����ǰ ���������");
		System.out.println("�����ǰ��: "); String �����ǰ�� = BankApplication.scanner.next();
		System.out.println("�������ڼ���: "); double ���� = BankApplication.scanner.nextDouble();
		
	}

	void �����û() {System.out.println("�����û������ ");}
	void ��ȯ����() {System.out.println("�����ȯ����Ȯ�� ");}
	
	
}
