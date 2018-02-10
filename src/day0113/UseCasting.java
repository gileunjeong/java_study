package day0113;

/**
 * 강제 형변환
 * @author sist05
 */
public class UseCasting {

	public static void main(String[] args) {
		float f = (float)1.13;		// 형명시로 할당 가능, 강제형변환으로 할당 가능
		int i = (int)f;
		
		System.out.println("f = "+f+"\ni = "+i);  	// 정수의 값 값손실 발생

		//* 기본형 데이터형과 참조형 데이터형은 서로 casting 할 수 없다.
		//String str = "10";		// 참조형
		//int num = str;
		
		//* boolean은 동일형으로만 casting 됨
		boolean b = false;
		//int num = b;
		
		// 진수
		int a1 = 10;	// 10진수
		int a2 = 010;	// 8진수 10 : 자주사용하지 않음
		int a3 = 0xa;	// 16진수 10 : 색표현할때 많이 씀
		
		System.out.println(a1+a2+a3);	// 30
		
		// 1의 보수연산(~.tild)
		// ~양수 : 부호변경 1증가
		// ~음수 : 부호변경 1감소
		int t=10;
		System.out.println(~t); 
		
		// ! (not)
		System.out.println(!(3>2));
		
		
		
		
	}//main

}//class
