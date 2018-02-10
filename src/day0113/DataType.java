package day0113;

/**
 * 기본형 데이터형 사용.
 * 지역변수 선언.
 * 형명시.
 * 자동형변환
 * @author sist05
 */
public class DataType {
	
	public static void main(String[] args) {
		/*
		int i;		// 지역변수 선언
		i = 7;		// 값할당
		System.out.println(i);		// 변수 사용
		*/
		
		//* 정수형 Data *//
		byte a = 10;		// literal이 1byte로 자동 변환되어 할당(자동형변환)
		short b = 10;		// literal이 2byte로 자동 변환되어 할당(자동형변환)
		int c = 2_147_483_647;		// JDK1.7부터는 정수를 사용할 때 _를 구분자로 사용할 수 있음
		long d = 2147483647;
		long e = 2147483648L;		// 형명시 : literal을 4byte에서 8byte로 변환(Runtime때)
		
		System.out.println("byte = "+a+" \nshort = "+b+" \nint = "+c+" \nlong = "+ d+" , "+e);
		
		//* 문자형 Data *//
		char f = 'A';	// unicode값 할당
		//char f = 65;	
		char g = '0';
		char h = '가';
		
		System.out.println("char = "+f+" , "+g+" , "+h);
		
		//* 실수형 Data *//
		float i = 1.13F;	// 형명시 : literal을 8byte에서 4byte로 변경
		double j = 1.13;
		
		System.out.println("float = "+i+" , double = "+j);
		
		//* 불린형 Data *//
		boolean k = true;
		boolean l = false;
		
		System.out.println("boolean = "+k+", "+l);
		
		//
		byte num1 = 10;
		byte num2 = 20;
		int result = 0;
		result = num1 + num2;
		
	}//main

}//class
