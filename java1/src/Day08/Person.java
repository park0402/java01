package Day08;

public class Person {
	
	// static + final : ���α׷� ���������� ���Ǵ� ���
	static final double pi = 3.14; 
	
	//static ���α׷� ���������� ���Ǵ� ���� 
	static double pi2 = 3.14; 
	
	//final : ��ü������ ���Ǵ� ���
	final double pi3 = 3.14;
	
	// 1. �ʵ�
	final String nation = "korea"; // final ������
	final String ssn; 
	String name;
	//2. ������ ��ü�ʱ�ȭ
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name= name;
		
	}
	     


}
