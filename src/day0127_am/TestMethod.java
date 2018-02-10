package day0127_am;

public class TestMethod {
	public void instanceMethod() {
		System.out.println("instanceMethod called!");
	}//instanceMethod
	
	public static void staticMethod() {
		System.out.println("staticMethod called!");
	}//staticMethod
	
	// 1. 고정일 : 반환형 없고, 매개변수 없는 형
	public void typeA() {
		System.out.println("고정적인 일");
	}
	// 2. 가변일 : 반환형 없고, 매개변수 있는 형 
	public void typeB(int i) {
		System.out.println("가변 일 "+i);
	}
	// 3. 고정값 : 반환형 있고, 매개변수 없는 형
	public int typeC() {
		int i = 27;
		return i;
	}
	// 4. 가변값 : 반환형 있고, 매개변수 있는 형
	public int typeD(char c) {
		return (int)c;
	}
	
	public static void main(String[] args) {
		// static 영역에서는 instance영역(non-static field)의 변수, 메소드를 직접 사용(호출)할 수 없음
		// instanceMethod();
		// 객체화 후 호출 - tm(객체)
		TestMethod tm = new TestMethod();
		tm.instanceMethod();
		
		// static method는 객체화 없이 직접 사용가능
		staticMethod();					// 사용가능
		TestMethod.staticMethod();	// 권장
		
		// 고정일
		tm.typeA();
		// 가변일
		tm.typeB(2018);
		tm.typeB(1);
		tm.typeB(27);
		// 고정값
		int temp = tm.typeC();
		System.out.println(temp);
		// 가변값
		for(char c = 'A'; c <= 'Z'; c++) {
			
			temp = tm.typeD('b');
			System.out.print(c+"의 Unicode값 " +temp+" ");
			
		}
	}//main

}//class
