package Day09;

public class Tire { //Ŭ���� ���� 
	//1. �ʵ�
	public int maxRotation; // �ִ�ȸ���� (Ÿ�̾����)
	public int accumulatedRotation; // ����ȸ����
	public String location; // Ÿ�̾��� ��ġ
	
	
	//2. ������
	public Tire(String locatin, int maxRotation) {
		this.location = locatin;
		this.maxRotation  = maxRotation;
	}
	

	
	
	//3. �޼ҵ�
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"tire ����: "+(maxRotation-accumulatedRotation)+"ȸ");
			 return true;
		}else {
			System.out.println("***"+location+"Tire ��ũ***");
			return false;
		}
	
	}
	
}
