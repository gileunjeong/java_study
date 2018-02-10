package day0127_am;

/**
 * JDK1.5에서 추가된 기능
 * @author sist05
 */
public class UseVariableArguments {
	
	/**
	 * 가변인자형 연습
	 * 호출) 호출시 입력값을 가변적으로 넣을 수 있음
	 * vaMethod();
	 * vaMethod(1);
	 * vaMethod(1,2,3,4);
	 * vaMethod(1,2,3,,,,,,x);
	 * @param param
	 */
	public void vaMethod(int ... param) {
		for(int i = 0; i < param.length; i++) {
			System.out.println(param[i]);
		}
	}
	
	// variable arguments가 여러개의 매개변수와 같이 사용되면 가장 마지막에만 정의
	protected void test(int i, String s, char ... c) {
//	protected void test(char ... c, int i, String s) { // Error
				
	}
	
	public static void main(String[] args) {
		UseVariableArguments uva = new UseVariableArguments();
//		uva.vaMethod();
		uva.vaMethod(2018,1,27,11,42);
		uva.test(1, "안녕", 'A','B','가');
		System.out.println("-----------------------------------");
		System.out.printf("[%d][%4d][%-4d]\n", 12,12,12);
		System.out.printf("[%f][%5.2f][%-7.2f]\n", 1.2345,1.2345,1.2345);
		System.out.format("오늘은 %d년 %d월 %d일 %c요일(%s) 입니다.\n", 
				2018, 1, 27, '토', "토요일");
		
		System.out.println("오늘은 \t 토요일 \n입니다.");
		
	}// main

}// class
