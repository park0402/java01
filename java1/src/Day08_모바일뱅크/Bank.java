package Day08_����Ϲ�ũ;

public class Bank {
	// 1. �ʵ�
	private String ���¹�ȣ; // ���¹�ȣ 
	private	String ������; //���� ������
	private int	�ܾ�; // �ܾ�
	private int  ���; //��й�ȣ

	
	//2. ������
	
	public Bank() {}
	public Bank(String ���¹�ȣ, String ������, int �ܾ�, int ���) {

		this.���¹�ȣ=���¹�ȣ;
		this.������=������;
		this.�ܾ�=�ܾ�;
		this.���=���;
		
	}
	
	public Bank(String ���¹�ȣ, int ���, String ������ ) {
		this.���¹�ȣ=���¹�ȣ;
		this.������=������;
		this.�ܾ�=0;
		this.���=���;
		
	}
	

	//3. �޼ҵ�  
	
	
	
	
	// ���»���    
	public void ���»��� (){
		System.out.println("���� ��� ȭ��");
		System.out.println("���¹�ȣ�� �Է����ּ��� : ");
		   String ���¹�ȣ = BankApplication.scanner.next();
		   System.out.println("���º�й�ȣ�� �Է����ּ���: ");
		   int ��� = BankApplication.scanner.nextInt();
		   System.out.println("���¼����ָ��� �Է����ּ���: "); 
		   String ������ = BankApplication.scanner.next();
		   
		   Bank Bank = new Bank(���¹�ȣ,���,������); //�����ֿ� ��� �مf���� ����ȵǴ����� ? String Int ?
		   
		   BankApplication.���¸��.add(Bank);
		   
		
		
	}
	
	
	
	
	
	//	�Ա�
	
	public void �Ա�() {
		System.out.println("�Ա� ȭ���Դϴ�. ");
		 System.out.println( "���¹�ȣ :  ");
		  String ���¹�ȣ = BankApplication.scanner.next();
		 System.out.println("��й�ȣ: ");
		  int ��� = BankApplication.scanner.nextInt();
		 System.out.println("�Աݾ�");
		 int �Աݾ�= BankApplication.scanner.nextInt();
		 
		 for( Bank temp : BankApplication.���¸��) {
			 if(temp.get���¹�ȣ().equals(���¹�ȣ)&& temp.get���() == ��� ) {
				 temp.�Ա�ó��(�Աݾ�);
				   return;
			 }
		 }	 
		 
		 System.out.println("����)) ���¹�ȣ Ȥ�� ��й�ȣ�� �ٸ��ϴ� .");
	}
	
	
	public String get���¹�ȣ() {
		return this.���¹�ȣ;
	}
	
	public int get���() {
		return this.���;
	}
	
	public void �Ա�ó��( int �Աݾ� ) {
		this.�ܾ� += �Աݾ�;
		System.err.println("\n[[[ [�Ϸ�] �Ա�ó���� �Ǿ����ϴ�  ]]]");
	}

	
	
	
	//	���
	
	public void ���() {}
	
	
	
	
	//	������ü
	
	public void ������ü() {}
	
	
	
	
	
	
	
	
	
	
	
}
