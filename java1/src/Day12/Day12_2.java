package Day12;

public class Day12_2 {
	public static void main(String[] args) {
		
		//String �޼ҵ�
		//p499 charAt(): ���ڿ����� Ư������ ����
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch(sex) { //switch ��� [ switch (�˻���)]
			case '1' : 
			case '3' : System.out.println("����"); break;
			case '2' :
			case '4' : System.out.println("���� "); break;	
		}
		// p.501 equals() : ���ڿ� ��
		// �⺻ �ڷ��� ����ϴ� ������ ������ ��밡�� [==]
		// String Ŭ���� ����ϴ� ��ü�� ==������ ���Ұ��� [equals]
		
		//�ڹٸ޸� [	JVM]
			//���� �޸� :��������
			// �� �޸�	:��ü
			// �޼ҵ� �޸�
		
		//1.���ڿ� ����
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö"; // ��ü�� new �����ڰ� �ʼ������� String Ŭ������ �ڵ� ��ü����
		//2.���ڿ� ��
		if(strVar1==strVar2) { //���ڿ��� ==�� �ȵȴ� [ == �޸� �ּ� �� 
			System.out.println("���� String ��ü�� ����"); 
		} else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		//3. equals ���
		if(strVar1.equals(strVar2)){
			System.out.println("���� ���ڿ��� ����");
			
		}else {
			System.out.println("�ٸ����ڿ��� ����");
		}
		// p.502 getBytes() : ���ڿ� -> ����Ʈ�� ��ȯ
		String str = "�ȳ��ϼ���";
		byte[] bytes1 = str.getBytes(); //���ڿ�-> ����Ʈ�� ��ȯ
		System.out.println("����1byte �ѱ�2byte" + bytes1.length ); //�迭��.length 
		try {
			
				//1. ���ڵ� Ÿ��
			//EUC-KR
				byte[] bytes2 = str.getBytes("EUC-KR");//�Ϲݿ��� �߻�
				System.out.println("EUC-KR ����: " + bytes2.length );
				String str2 = new String( bytes2 , "EUC-KR");
				System.out.println("����Ʈ��-> ���ڿ�: "+str2);
			//UTF-8
				byte[] bytes3 = str.getBytes("UTF-8");//�Ϲݿ��� �߻�
				System.out.println("UTF-8 ����: " + bytes3.length );
				String str3 = new String( bytes3 , "UTF-8");
				System.out.println("����Ʈ��-> ���ڿ�: "+str3);
		}catch(Exception e) {
			
		}
		
		//P.504 iudexOf() ���� ��ġ[�ε���] ã��
		String subject = "�ڹ� ���α׷���";
		int location = subject.indexOf("���α׷���");
		System.out.println(location); // 3�� �ε������� ���α׷��� ã�� ����
		// ���ڿ��� Ư�� ���ڿ� ��ġ [�ε���] ã�� /.���࿡ ������ -1[����]
		if (subject.indexOf("�ڹ�") !=-1) {
			System.out.println("�ڹٿ� ���� å");
			
		}else {
			System.out.println("�ڹٿ� ���� ���� å");
		}
		
		System.out.println("------------------------------");
		
		//p.505 length(): ���ڿ� ����
		String ssn2 = "7306241230123";
		int length = ssn2.length();
		if(length == 13 ){
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ� .");
		}else {
			System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ� . ");
		}
		
		System.out.println("--------------------");
		// p.506 replace( "��������", "���ο��") : ���ڿ� ��ġ[����]
		String oldStr = " �ڹٴ� ��ü ���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		System.out.println( "�������ڿ�: " +oldStr );
		System.out.println( "���ο�ڿ�: " +newStr );
		
		//p.507 substring() vs split () : ���ڿ� �ڸ���
		String ssn3 = " 880815-1234567";
		
		String firstNum = ssn3.substring(0,6); //�����ε��� �������ε���
		System.out.println("Ȯ�� : " + firstNum);
		
		
		
		String str2 = String.valueOf(10);
		String str3 = String.valueOf(10.5);
		String str4 =  String.valueOf(true);
		String str5 =  10+""; //  int ���� String ������ ���� �Ұ���+ "" ���� ����+���ڴ� ->���� ����x
	}
	


}
