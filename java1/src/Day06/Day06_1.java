package Day06;

public class Day06_1 {
	
	// Class 
		// 1. Ŭ���� : ���赵
		// 2. ��ü(�ν��Ͻ�) : ���赵 ������� �޸� �Ҵ���� ����
			// ��) �ؾ Ʋ = Ŭ����
				// �а���, ��, ��, ��ũ�� => �ʵ� [�Ӽ�=����]
				// ����,������,�Ǹ� => �޼ҵ�[�ൿ]
				// �ؾ Ʋ�κ��� ������ �ؾ ����
					// ���� �ٸ� �ؾ ���� [�ؾ1, �ؾ2]
	
			//��) ȸ�� =Ŭ���� 
				//���̵�, ��й�ȣ, �̸�, �������, ���� , �̸��� ,��ȭ��ȣ => �ʵ�
				//ȸ������, ���̵�ã��, ��й�ȣã��, ȸ��Ż��, �α׸� => �޼ҵ� [�ൿ]
				// ���δٸ� ȸ������ �����ȴ� [ȸ��1 , ȸ��2 ~~~~~]
	
	public static void main(String[] args) { // m s
		
		//��1) p.195
		Student s1 = new Student();
		// 1. Student : ���ǵ� Ŭ������
		// 2. s1 : ��ü��[�ƹ��ų�] :��õ[Ŭ������ �ҹ���]
		// 3. new������ : �޸�(�������) ����
		// 4. Student() : �����ڸ�()
		// * ��ü ������ 4���� �ʿ� 
		 System.out.println( "s1 ������ Student ��ü�� �����մϴ�. "+s1);
		 
		 Student s2 = new Student();
		 System.out.println("s2 ������ �� �ٸ� Student ��ü�� �����մϴ�."+s2);
		
		 
		
		
//		Student <----- ���赵�� ������ ����Ұ�
		
	} // m d

}