package day0203_am;

import java.util.Iterator;

public class UseString1 {

	// 생성자
	public UseString1() {
		String str = "AbcdEfdG";
		System.out.println(str);
		System.out.println(str+"의 글자 수 : "+str.length());
		System.out.println(str+" -> 대문자 : "+str.toUpperCase());
		System.out.println(str+" -> 소문자 : "+str.toLowerCase());
		System.out.println(str+" 'd'의 indexOf : "+str.indexOf('d'));
		System.out.println(str+" 'd'의 lastIndexOf : "+str.lastIndexOf('d'));  // 뒤에서 앞으로 찾음
		System.out.println(str+" 'k'의 indexOf : "+str.indexOf('k'));
		System.out.println(str+" 에서 5번째 인덱스의 문자 : "+str.charAt(5));
		System.out.println(str+" 에서 2~4 사이의 문자열  : "+str.substring(2, 5));
		
		String temp = "서울시 강남구 역삼동";
		//temp = "서울시 동대문구";
		temp = "경기도 의정부시";
		System.out.println(temp+"은(는) "+(temp.startsWith("서울")?"특별시":"일반도시"));
		
		temp = "강남구 역삼동";
		temp = "장흥면 교현리";
		System.out.println(temp+"은(는) "+(temp.endsWith("동")?"도시":"시골"));
		
		temp = "Java, Oracle, JSP, MyBatics, Spring";
		System.out.println(temp+"에서 'a'를 'test'로 변환 : "+temp.replace('a', 'A'));			// replace(char arg0, char arg1)
		System.out.println(temp+"에서 'a'를 'test'로 변환 : "+temp.replaceAll("a", "test"));	// replaceAll(String arg0, String arg1)
		
		temp = "   A AA   ";
		System.out.println("["+temp+"]를 앞뒤공백 제거 ["+temp.trim()+"]");
		System.out.println("["+temp+"]를 앞뒤공백 제거 ["+temp.replaceAll(" ","")+"]");
		
	}// UseString1
	
	public static void main(String[] args) {
		// 객체 생성 후 객체명으로 변수, method를 사용하지 않는 경우 객체화
		// new 생성자();
		new UseString1();	
		//객체 생성 후 객체명으로 변수, method를 사용하는 경우
		// 클래스명 객체명 = new 생성자();
		
	}

}
