package Day09;

public class Student extends People{
		// ����Ŭ����	extends ����Ŭ����
	
	// 1. �ʵ�
	public int studnetNo; //�л���ȣ
	
	// 2. ������
	public Student( String name
			, String Ssn
			, int studentNo) {
		// �θ�Ŭ������ ��� �ʵ��ʱ�ȭ [���ֱ�]
//		1.�ʵ忡�����ϴ� ���
//		this.name = name;
//		this.Ssn = Ssn;
//		2.�����ڿ� �����ϴ� ���
		super(name, Ssn, studentNo);
		this.studnetNo = studentNo;
	}
	
	
	// 3. �޼ҵ� 
	
	

}
