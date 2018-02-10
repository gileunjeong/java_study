package day0203_pm;

public class TestSub extends TestSuper{
	
	int i;
	
	public TestSub() {
		super();
		System.out.println("자식클래스 생성자");
	}
	
	public void childMethod() {
		System.out.println("자식 Method");
		// 자식클래스와 부모클래스의 변수명이 다르다면 this로 모두 접근가능
		System.out.println("자식 i : "+this.i+" 부모 j : "+this.j);
		// 자식클래스와 부모클래스의 변수명이 같다면 this로느 자식클래스의 자원만 사용 가능하고,
		// 부모는 super()로 접근하여 사용한다.
		//this.i = 100;
		super.i = 100;
		System.out.println("자식 i : "+i+", 부모 i : "+super.i);
	}

	public static void main(String[] args) {
		TestSub ts = new TestSub();	// 자식을 생성하면 부모가 먼저 생성된다.
		ts.childMethod();
	}

}
