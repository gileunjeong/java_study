package day0203_pm;

/**
 * 구현하는 클래스들이 반드시 해야하는 일의 목록을 정의
 * @author sist05
 */
public interface MyInter {
//	int i;	// interface는 변수를 가질 수 없음
	public static final int TEST = 10; 	// constant는 가짐
	
//	public void test() {	// 일반 method 가질 수 없음		
//	}
	
	public void test();		// abstract 생략
	public abstract void temp();
	
	// default method : 일을 구현할 수 있음(body를 가질 수 있음) 
	public default void foo() {
		System.out.println("foo called!!!!");
	}
	
}
