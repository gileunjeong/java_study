package day0127_am;

/**
 * class field에 선언되는 변수의 사용
 * instance(member)변수 : 객체화하여 사용, 객체가 GC(-garbage collector/  System.gc())에 의해 메모리에서 수거되는 때 사라짐.
 *                                  '객체명.변수명'으로 사용(객체마다 각각의 변수를 사용)
 * static(class)변수 : 클래스가 실행되면(java 클래스명) 메모리(method 영역)에 로드되고 JVM(java.exe)이 종료되면 메모리에서 사라짐.
 *                         공용변수(모든 객체가 하나의 변수를 사용)
 * @author sist05
 */
public class FieldVariable {
	
	int i;	//객체화해야 사용가능
	static int j;
	
	public static void main(String[] args) {
		
		//static 영역은 클래스가 실행될 때 가장먼저 실행
		//i = 27;		//static 영역에서 instance 변수는 직접 사용할 수 없음
		j = 27;		//static 변수는 직접 사용가능
		
		//i 사용하려면.. 1. 객체화 2. 객체명.변수명으로 사용
		//1. 객체화 :  클래스명 객체명 = new 생성자();
		FieldVariable fv = new FieldVariable();
		//변수사용
		fv.i = 1;
		
		System.out.println("static 변수 "+FieldVariable.j +" , instance 변수 : "+fv.i);
		
		//static 변수 (공용-특정객체에 속하지 않은) 사용가능 하지만
		//잘못 사용하는 문법 : 객체명.변수명
		fv.j = 20;
		
		fv.finalize();
	
		
	}//mian
	
	public void finalize() {
		// 객체(fv)가 GC에 의해 소멸되면 호출되는 메소드
		// Servlet/JSP(destroy/_jspDestroy)
		
	}
}//class
