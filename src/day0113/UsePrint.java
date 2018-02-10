package day0113;

/**
 * 표준 출력 method의 사용
 * @author sist05
 */
public class UsePrint {

	public static void main(String[] args) {
		/*
		System.out.print("안녕");
		System.out.print("하세요?");
		*/
		
		System.out.println(13);	//정수상수
		System.out.println(1.13);//실수상수
		System.out.println('A');	//문자상수
		System.out.println('가');	//문자상수
		System.out.println("가나다");	//문자열상수
		System.out.println(true);	//boolean상수
		System.out.println("1+13 = "+(1+13));	//연산식
		
		//
		byte b = -127;
		b = -128;
		//b = -129;  // 범위 초과
		
		//long l = 3000000000;
		long l = 3000000000L; // literal의 크기가 늘어남(형명시)
		System.out.println(l);
		
		//float f = 3.14;
		float f = 3.14F; // literal의 크기가 줄어듬(형명시)
		
		
	}//main

}//class
