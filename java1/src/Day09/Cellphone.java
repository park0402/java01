package Day09;

public class Cellphone {
	//1. �ʵ�
	
	String model;
	String color;
	
	
	//2. ������
	
	
	
	
	
	//3. �޼ҵ�
	
	void powerOn() {System.out.println("������ �մϴ�.");}
	//��ȯŸ�� �޼ҵ�� (�μ�){�����ڵ�} //�μ�x��ȯx
	void powerOff() {System.out.println("������ ���ϴ�.");}
	void bell() {System.out.println("���̿︳�ϴ�.");}
	void sendVoice(String message) {System.out.println("�ڱ�: "+ message);}
	//��ȯŸ�� �޼ҵ�� (�μ�){�����ڵ�} //�μ�o��ȯx
	
	void receiveVoice(String message) {System.out.println("����: ");}
	void hangUp() {System.out.println("��ȭ�� �����ϴ� .");}
	

}
