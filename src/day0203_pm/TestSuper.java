package day0203_pm;

/**
 * 상속관계의 부모 클래스 : 자식클래스가 가지는 공통 기능 구현
 * @author sist05
 */
public class TestSuper {
	int i, j;
	
	public TestSuper() {
		super();	// 부모클래스의 기본생성자를 호출
		System.out.println("부모 Constructor");
	} // TestSuper
	
	public void parentMethod() {
		System.out.println("부모 Method");
	} // parentMethod
}
