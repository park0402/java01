package Day19;

import java.util.HashMap;


public class Day19_3 {
	public static void main(String[] args) {
		
		//1. Map 컬렉션 = json(javaScript Object Notation)
			// 키, 값(객체) = 엔트리
			// 키 : set 컬렉션(중복불가능) 값:list 컬렉션(중복가능)
			// HashMap 클래스
				//1.map객체명.put ( 키, 값) : 엔트리 (키와 값 한쌍단위)
				//2.map객체명.size() : 엔트리 수
				//3.map객체명.get(키객체): 해당 키의 값 호출
				//4.map객체명.keySet(): map 객체내 모든 키호출
				//5.map객체명.values()  map 객체내 모든 값 호출
						// * 키를 알고 있으면 값을 알수 있다.
						//for(임시객체명: map객체명.ketSet()){}
		
		// 1. HashMap 클래스의 객체 선언
		HashMap<String, Integer> map  = new HashMap<>();
//		HashMap<String, ArrayList<String> map = new HashMap<>(); ArrayList도 가능 객체하나에 리스트가있는것 
		
		
		//HashMap: 컬렉션 프레임워크 map 클래스
			// <제네릭,제네릭>: key, value 와 구성된 제네릭
				//map : map 객체명 ( 아무거나) 
					//new : 객체 생성시 메모리 할당
							// HashMap<>() : 생성자
			// 2. map 객체에 추가
		map.put("신용권", 85); System.out.println( " 확인 :" + map);
		
		// 리스트 = [ 객체,객체,객체] 
		// 셋트 =[ 객체, 객체 , 객체]
		// 맵 = {키 = 값}
		
		map.put("신용권", 90); System.out.println( " 확인 :" + map);
		map.put("동장군", 80); System.out.println( " 확인 :" + map);
		// key는 중복이 불가 [기존 key 없어지고 새로운키로대치 ]
		map.put("홍길동", 95); System.out.println( " 확인 :" + map);
		//value는 중복이 가능
		map.put("유재석", 95); System.out.println( " 확인 :" + map);
		//3. map객체명.size() : map 객체내 엔트리 (키=값) 개수
		System.out.println(" map 객체내 엔트리수 : " + map.size()  );
		//4. map객체명.get ( 키 ) : map객체내 키 -> 값 호출 
		System.out.println("map 객체내 값호출 ( 키호출시 -> 값호출 : " + map.get("유재석"));
		
		//5. 모든 key 호출
		System.out.println( "map 객체내 모든 키 호출 : " + map.keySet() );
		//6. 모든 value 호출
		System.out.println( "map 객체내 모든 값 호출: " + map.values() );
		
		//7. 반복문 [ key 반복문 이용해서 모든 value 호출가능 ]
		for(String temp: map.keySet () ) {
			System.out.println(temp+ ": "+ map.get(temp));
		}
		//8. 삭제
		map.remove("홍길동"); System.out.println("확인 : " + map );
		
		//9. 초기화
		map.clear(); System.out.println("확인 : " + map );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
