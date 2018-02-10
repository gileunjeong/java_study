package day0120_pm;

/**
 * Constant : 어디에서든 사용되며 값 변경 되지 않는 변수
 *             - 프로그램의 기준값을 저장, 사용할 목적
 * @author sist05
 */
public class TestConstant {

	public static final int MIN = 0;
	public static final int MAX = 100;
	
	public static void main(String[] args) {
		//public static final int MAX = 100; // 상수는 메소드 내에서 선언할 수 없음
		System.out.println("상수명 : "+MIN);
		System.out.println("클래스명.상수명 : "+TestConstant.MAX);
		// 상수에는 선언 이외에는 값할당을 할 수 없음
		// MAX = 99;
		// Wrapper Class : 기본형 데이터형을 객체로 사용하기 위해 작성된 클래스들.
		// 기본형 : 값 저장기능만 존재, 객체 : 값 저장기능, 정해진 일들.
		System.out.println("int Wrapper Class 상수 "+Integer.MIN_VALUE+" , " +Integer.MAX_VALUE);
		System.out.println("long Wrapper Class 상수 "+Long.MIN_VALUE+" , " +Long.MAX_VALUE);
		
	}

}
