package Day09;

import java.util.Random;

public class ������Ʈ�ѷ� { //Ŭ����
	
	//�ش� Ŭ������ ���� ���� ��Ʈ�ѷ�
	// M : �� [������]
	// V : �� [ �����]
	// C : ��(M)�� ��(V) ���� ����
	
	// �信�� ��û�ϴ� ����[���] ����
		// 1.���»���
	
	//�� ��ü����
	
	public boolean ���»���(String ��й�ȣ , String ������, int �����ȣ) {
		//1. �Է¹��� ���� �����´� 
			//���� �ڵ�����
		Random rendom = new Random();
			//4�ڸ� ����
		
		//2. ��üȭ�� ��Ų�� [�ټ��� ������ �ϳ��� ��üȭ]
		���� temp = null;
		if( �����ȣ==1) {
			temp = new ��������("0," , ��й�ȣ , ������ ,0);
		}else if (�����ȣ==2) { 
			temp = new ��������("0," , ��й�ȣ , ������ ,0);
		}else if (�����ȣ==3) {
			temp = new �ϳ�����("0," , ��й�ȣ , ������ ,0);
		}
		//3. �迭�� ����
		int i = 0; //�ε���
		for (���� temp2 : ����������α׷�_���.���¸���Ʈ) {
			if(temp2==null) {
				����������α׷�_���.���¸���Ʈ[i]=temp; // ���� �ε����� ����
				
				System.out.println("���� ��� ");
				return true;
				
			}
			i++; //�ε��� ���� �����ϸ鼭 �����ε��� ���� �ʼ� �ε��� �����
		}
		
		return false;
		}
		// 2. �Ա�
	public boolean �Ա�() {
		return false;}
		// 3. ���
	public boolean ���() {
		return false;
		}
		// 4. ��ü
	public boolean ��ü() {
		return false;
		}
		// 5. �����¸��
	public boolean ���¸��() {
		return false;
		}
		// 6. ����
	public boolean ����() {
		return false;
		}

}
