package day0203_am;

/**
 * 클래스의 이름이 java.lang package에서 제공하는 이름과 같다면
 * lang package의 클래스를 사용해야하는 상황에 내가 만든
 * 클래스를 사용하게 되므로 문제가 발생하게 된다. 
 * (오류: day0203_am.String 클래스에서 기본 메소드를 찾을 수 없습니다. 다음 형식으로 기본 메소드를 정의하십시오.
   public static void main(String[] args)
또는 JavaFX 애플리케이션 클래스는 javafx.application.Application을(를) 확장해야 합니다.)
 * (해결 :  클래스를 사용할 때 패키지명.클래스명으로 사용하든,
 *            클래스를 작성할 때 이름이 겹치지 않도록 작성)
 * @author sist05
 */
/*public class UseString {

	//public static void main(String[] args) { --> 오류 --> 클래스의 이름을 java.lang package에서 제공하는 이름과 다르게 주어야함
	public static void main(java.lang.String[] args) {
		// 기본형 : String str = "ABC";
		//String str = "ABC"; --> 에러
		System.out.println("test!!!");
	}// main

}// class
*/
public class UseString {

	public static void main(String[] args) {
		// 기본형 : String str = "ABC";
		String str = "ABC";   // ctrl+shift+x,y : 대소문자 변경 
		System.out.println("test!!!");
		String str1 = new String("ABC"); 
		// 비교
		// 기본형 형식 : ==, equals
		System.out.println("기본형 == 비교 : "+(str=="ABC"?"같다":"다르다"));
		System.out.println("기본형 equals 비교 : "+(str.equals("ABC")?"같다":"다르다"));
		
		// 참조형 형식 : equals
		System.out.println("참조형 == 비교 : "+(str1 == "ABC"?"같다":"다르다"));
		System.out.println("참조형 equals 비교 : "+(str1.equals("ABC")?"같다":"다르다"));
		
		
	}// main

}// class
