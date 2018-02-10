package day0127_pm;

/**
 * 마카펜 클래스를 객체로 만들어 사용하는 클래스
 * @author sist05
 *
 */
public class UseMarker {

	/**
	 * Java Application을 만들기위해 정의하는 method(단독실행)
	 * VM Arguments : java.exe에 설정값
	 * 		java -Xms512m -Xmx1024m
	 * Program Arguments : 실행되는 Java class에 입력하는 값
	 *     java UseMaker 안녕 하세요? 1월 27일
	 * java UseMarker 값 값 값 ...
	 * @param args Program Arguments -실행시 입력하는 값
	 */
	public static void main(String[] args) {
		
		// 생성 : instance 변수가 초기화됨(정수형-0, 실수형-0.0, 불린형-false, 문자형-\u0000, 참조형-null)
		// 객체 : 참조형 데이터형 - 주소를 가짐
		Marker black = new Marker();
		Marker red = new Marker(3,3,"빨간");
		System.out.println("heap의 주소 : "+black);		// day0127_pm.Marker@47fd17e3
		System.out.println("기본 생성자 사용 : "+black.getCap()+" "+black.getBody()+" "+black.getColor());
		
		// setter method로 생성된 객체에 값 설정
//		black.setCap(1);
//		black.setBody(1);
//		black.setColor("검은");
		// getter method로 객체에 설정된 값 얻기
		System.out.println("Overload된 생성자 사용 : "+red.getCap()+" "+red.getBody()+" "+red.getColor());
		
		// 동사적인 특징 사용(동작)
		System.out.println(black.write("안녕하세요."));
		System.out.println(red.write("안녕하세요."));
	}

}
