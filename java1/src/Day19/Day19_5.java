package Day19;

import java.util.TreeSet;

public class Day19_5 {
	
	public static void main(String[] args) {
		//p753 : TreeSet Ŭ����
			//1.�ϳ��� ��ü = ���
			//2. �� ���� �ִ� 2���� �ڽ� ��带 ������ �ִ� .
			//3. �θ𺸴� ������ ���� �ڽ�/ �θ𺸴� ũ�� ������ �ڽ�
			
		//1. TreeSet Ŭ������ ��ü����
		TreeSet<Integer> scores = new TreeSet<>();
		//2. TreeSet ��ü�� ��ü(���) �߰� 
		System.out.println("-----�ڵ�����-----");
		scores.add(87); System.out.println("Ȯ�� " + scores );
		scores.add(98); System.out.println("Ȯ�� " + scores );
		scores.add(75); System.out.println("Ȯ�� " + scores );
		scores.add(95); System.out.println("Ȯ�� " + scores );
		scores.add(80); System.out.println("Ȯ�� " + scores );
		
		//3. 
		System.out.println( scores.first() ); //���� ���� ��ü�� ����  ���� ���� ��Ʈ[���� ����] ȣ��
		System.out.println( scores.last() ); //���ϳ��� ��ü�� ���� ���� ������ ��� ȣ��
		System.out.println( scores.lower(95) ); // �־��� ��ü���� �Ʒ� ��ü�� ����
		System.out.println( scores.higher(95) ); // �־��� ��ü���� ���� ��ü�� ����
		System.out.println(scores.floor(95)); //95���� �������� ���ʳ��[ 95���� ���ų� ����]
		System.out.println(scores.ceiling(85)); //85���� �������� ���ʳ��[ 85���� ���ų� ū]
		
		//4.
		System.out.println(scores.pollFirst()); // ���� �����ʳ�� [���� ū] ����
		System.out.println(scores.pollLast()); // ���� ���ʳ��[���� ����] ����
		System.out.println("Ȯ��: " +scores);
		//5. �������� vs �������� ��������(�⺻��)
		System.out.println(" ���ļ��� \n [��������]: "+ scores );
		// ��������
		System.out.println( " [��������] : " + scores.descendingSet()); //������������ �ٲ��ִ°�
		
		for( Integer temp : scores ) { System.out.println(temp); 

		
		for( Integer tmep : scores.descendingSet()) {
			System.out.println(tmep);
		}
	}


}
