package ����������; // ������ �� �� ��Ʈ�ѷ��� ¥�������� �ϴ� �� ��Ʈ�ѷ��� ���Ƴ���

import java.io.FileOutputStream;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class �������� { //�ڿ����ۼ�

	
	//�ʵ�
	private String ������ȣ;
	private int ������ġ;


	//���� String ���� �ٲ���ϴ�. 
	
	
	//������
	
	public ��������() {};
	//�������
	
	
	
	public ��������(String ������ȣ,  int ������ġ) { //�ڿ����ۼ� 
		super();
		this.������ȣ = ������ȣ;
		this.������ġ = ������ġ;
		
	}
	

	public void �������(String ������ȣ1, int index) { 
		������ȣ = ������ȣ1; // ����ȣ ���ڷ� �޾ �ʵ��� ����
		������ġ = index;		// ��ġ�޾Ƽ� �ʵ忡 ����
		����Ÿ��.������Ȳ[index] = "[" + ������ȣ1 + "]"; 
		save();
	} // ������� e
	
	public void ��������(String ������ȣ1) { // �������� s
		for(int i=0; i<12; i++) { // for s
			if(����Ÿ��.������Ȳ[i].equals("[" + ������ȣ1 + "]")) {
				����Ÿ��.������Ȳ[i] = "[ ]"; 
				save();
				return;
			}
		} // for e
		���� = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
	} // �������� e



		


	
	
	public boolean save(){// �������� ���� ����
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("C:/Users/Public/����.txt");
		String parkOutput = null;
		for(int i = 0; i<12; i++) {
		parkOutput = ����Ÿ��.������Ȳ[i]+","; // ��ǥ�� ����
		fileOutputStream.write(parkOutput.getBytes()); 
		}
		fileOutputStream.close();
		return true; 
		
	}catch (Exception e) {
				System.out.println(" ���忡 �����Ͽ����ϴ� ");
	 return false;
	} 
			
		}
	
	public String get������ȣ() {
		return ������ȣ;
	}
	public void set������ȣ(String ������ȣ) {
		this.������ȣ = ������ȣ;
	}

	public int get������ġ() {
		return ������ġ;
	}
	public void set������ġ(String ������ȣ, int ������ġ) {
		this.������ȣ = ������ȣ;
		this.������ġ = ������ġ;
	}
	
	
	//���� �ð�
	private ZonedDateTime ���� = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
	//���� �ð�
	private ZonedDateTime ����;

	public ZonedDateTime get����() {
		return ����;
	}

	public ZonedDateTime get����() {
		return ����;
	}
	
	
	
	
	
	
	
	
	
}
	
	

