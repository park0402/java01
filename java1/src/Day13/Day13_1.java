package Day13;

import java.util.Random;

public class Day13_1 {
	public static void main(String[] args) {
		
		//p.534 : Math 클래스 (java.lang패키지) [수학 관련 메소드 제공] 객체없이 사용가능
		
		// Math.abs(수) : 해당 수의 절대값
		System.out.println("절대값 " + Math.abs(-5)); //5
		System.out.println("절대값 " + Math.abs(-3.14)); //3.14
		
		// Math.ceil(수): 가까운 정수로 올림
		System.out.println("올림값"+ Math.ceil(5.3)); //6
		System.out.println("올림값"+ Math.ceil(-5.3)); //15
		
		// Math.floor(수): 가까운정수로 내림
		System.out.println( "버림값" + Math.floor(5.3));
		System.out.println( "버림값" + Math.floor(-5.3)); //-6
		
		// Math.max(수1,수2): 두수중의 더 큰수
		System.out.println("최댓값" + Math.max(5, 9)); //9
		System.out.println("최댓값" + Math.max(5.3, 2.5)); //5.3
		
		// Math.min(수1,수2): 두수중의 더 작은수
		System.out.println("최소값"+Math.min(5, 6)); //5
		System.out.println("최소값"+Math.min(5.3, 2.5)); //2.5
		
		// Math.random(): 0~1사이의 (double)형 난수 발생
		System.out.println("난수: " + Math.random()); //0~1 사이의 난수 발생
		
		// Math.rint(수) : 가까운 정수의 실수값으로 반올림
		System.out.println("가까운 정수의 실수값 : "+ Math.rint(5.3) ); //반올림[5이상 올림] 
		System.out.println("가까운 정수의 실수값 : "+ Math.rint(5.7) ); 
		
		// Math.round(수) : 가까운 정수의 정수값으로 반올림
		System.out.println("가까운 정수의 정수값: "+ Math.round(5.3));
		System.out.println("가까운 정수의 정수값: "+ Math.round(5.7));
		// 특정 소수점 위치에서 반올림
		System.out.println(Math.round(12.3456));
		double value = 12.3456; // 소수 셋쩨자리에서 반올림 
		double temp1 = value *100; //12.2345 *100 -> 1234.56
		long temp2 = Math.round(temp1);	//1234.56 반올림 => 1235
		double v16 = temp2/100.0;
				//temp2/100 -> long/int -> 기본정수형 : int
				//temp2/100.0 -> long/double -> 기본정수형 : double
		System.out.println("V16: " + v16);
		
		System.out.println("0~1사이의 실수형: " + Math.random() );
		System.out.println(Math.random()*6);
		System.out.println(Math.random()*6+1);
		int num = (int)(Math.random()*6)+1;
		
		System.out.println("1~6사이의 난수 : "+ num);
	///////////////////////////////////////
		Random random = new Random();
		System.out.println(random.nextInt(6)+1);
		System.out.println("1~6사이의 난수: " + random.nextInt(6)+1);
	
	
	
	}

}
