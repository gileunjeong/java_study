package day0203_pm;

//public class TestAbstract {	-> �Ϲ� class�� �߻�޼ҵ带 ������ ����
public abstract class TestAbstract {
	
	int i;
	public TestAbstract() {
		System.out.println("�߻�Ŭ������ ������");
	}
	
	// �߻�޼ҵ� - ������ ������, body�� ���� ���� ���ϴ� method
	public abstract void test();
	

//	public static void main(String[] args) {
//		// �߻�Ŭ������ ���� ��üȭ �� �� ����
//		TestAbstract ta = new TestAbstract();
//	}

}
