package Day19;

import java.util.Hashtable;
import java.util.Scanner;

public class Day19_4 {

	
	
	public static void main(String[] args) {
		//p.747
		//1. Hashtable Ŭ���� ��ü ����
		Hashtable<String, String> map = new Hashtable<>();
		
		//2. map ��ü�� �߰�
		
		map.put("spring", "12") ; 
		map.put("summer", "123") ; 
		map.put("fall", "1234") ; 
		map.put("winter", "12345") ; 
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�: "); String id = sc.next();
			System.out.println("��й�ȣ: "); String password = sc.next();
			
			
			// ���࿡ map��ü�� �ش� key �� �����ϸ� [.contains(Ű) = map ��ü�� �ش�Ű�� �����ϸ�true �ƴϸ�false]
			
			if(map.containsKey(id)) { //containsKey�� �Է��ؾ���
				if(map.get(id).equals(password)) {
					System.out.println("�α��ο� �����Ͽ����ϴ� ");
					
				}else {System.out.println("�Է��Ͻ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");}
			
			} else {System.out.println(" �Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");}
			
			
			
		}
		
		
		
	}
}
