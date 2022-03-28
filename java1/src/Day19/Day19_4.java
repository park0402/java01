package Day19;

import java.util.Hashtable;
import java.util.Scanner;

public class Day19_4 {

	
	
	public static void main(String[] args) {
		//p.747
		//1. Hashtable 클래스 객체 선언
		Hashtable<String, String> map = new Hashtable<>();
		
		//2. map 객체에 추가
		
		map.put("spring", "12") ; 
		map.put("summer", "123") ; 
		map.put("fall", "1234") ; 
		map.put("winter", "12345") ; 
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디: "); String id = sc.next();
			System.out.println("비밀번호: "); String password = sc.next();
			
			
			// 만약에 map객체내 해당 key 가 존재하면 [.contains(키) = map 객체내 해당키가 존재하면true 아니면false]
			
			if(map.containsKey(id)) { //containsKey를 입력해야함
				if(map.get(id).equals(password)) {
					System.out.println("로그인에 성공하였습니다 ");
					
				}else {System.out.println("입력하신 비밀번호가 틀렸습니다.");}
			
			} else {System.out.println(" 입력하신 아이디가 존재하지 않습니다.");}
			
			
			
		}
		
		
		
	}
}
