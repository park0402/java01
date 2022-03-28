package Day19;

import java.util.HashSet;
import java.util.Iterator;

public class Day19_1 {
	public static void main(String[] args) {
		// �÷���(����=����)�����ӿ�ũ(�̸��������Ŭ����)
		// �迭�� ������ ���� ���
		// 1. list �÷���
			// *�ε���(�������)
			// 1. ArrayList Ŭ���� : �̱� ������ / ������ �߰�, ���� ����
			// 2. Vector Ŭ���� : ���׽����� (����ȭ)
			// 3. LinkedList Ŭ���� : �߰� ����/ ����
		// 2. set �÷���
			//* �ε��� x (��������� ���⶧���� �ڵ����� ��ü�� �ߺ��Ұ���)
			// 1. HashSet Ŭ����
				// 1. .add(��ü��) : set ��ü �� ��ü(���) �߰�
				// 2. .size() : set ��ü�� ��ü(���) ���� 
				// 3. .iterator() : set ��ü ��ȸ �޼ҵ�
					//*Iterator<���׸�> �������̽���: �������� ��ü ��ȸ �������̽�
					//*Iterator<���׸�> iterator = set.iretator();
					//	1.	iterator.hashnext() : ���� ��ü ���� ���� Ȯ��
					// 	2.	iterator. next(): ���� ��� ��������
					// 	3.	.remove() : �ش� ��ü����             
					// 	3.	.reset() : �ʱ�ȭ
					//or
					//for(�ӽð�ü��: set��ü��){}
		// 3. Map
		
	// p.737
		//1. HashSet Ŭ������ ��ü����
		HashSet<String> set = new HashSet<>();
		//1. HashSet : �÷��� ������ ��ũ Ŭ����
			//2.<���׸�> : Set Ŭ���� �ȿ� ���� �ڷ���
				//3. set: ��ü��(�ƹ��ų�)
					//4. new: ��ü ������ �޸� �Ҵ�
						//5. HashSet<���׸�:��������>(); : ������
		//2. set ��ü�� ��ü �ֱ� [ set��ü��.add(��ü��)];
		set.add("java"); System.out.println("Ȯ��: " +set); 
		set.add("JDBC"); System.out.println("Ȯ��: " +set); 
		set.add("Servlet/JSP"); System.out.println("Ȯ��: " +set); 
		set.add("java"); System.out.println("Ȯ��: " +set); // ��ü �ߺ� �Ұ���
		set.add("iBATIS");
		//3. set ��ü�� ��ü �� [ set��ü��.size():]
		System.out.println("set �ȿ� ������ ��ü �� : " + set.size() );
		
		//4. Iterator : ����� ��ü�� �ѹ��� �������� �ݺ��� ����(��ȸ)
			//*set �÷��ǿ��� ���Ǵ� ����: �ε����� ���⶧���� ��ü�� ȣ���ϴ� ���x get
		Iterator<String> iterator = set.iterator(); //set ��ü�� iterator(): ��ȸ
		while(iterator.hasNext()) {
			//hasNext(): ���� ��� ������ true ������ false 
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		// * for���� �÷���Ȱ��
			//for ( �ӽð�ü��: �÷���/�迭) : �÷���/�迭�� ��ҵ��� �ѹ��� �������� �ݺ���
		for(String element : set) { // : �� iterator ������ �ϴ°� 
			System.out.println("\t"+element);
		}
		
		
		//5. set��ü��.remove( ��ü��) : set��ü�� �ش� ��ü�� ����
		set.remove("JDBC"); System.out.println("Ȯ�� : "   +set);
		//6. set��ü��.clear(): set ��ü�� ��� ��ü�� ���� [����]
		set.clear(); System.out.println("Ȯ��: " + set );
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
