package day0203_pm;

public class TestAbstractSub extends TestAbstract{
	
	public TestAbstractSub() {
		System.out.println("�ڽ� ������");
	}
	
	@Override
	public void test() {
		// ������ �߻� method : body�� ������ �ڽ�Ŭ������ ��Ȳ�� �°� ����
		System.out.println("Override method");
		// Override�� method�� �ִٸ�, ��üȭ�� �پ�(is a ������ ��üȭ)�ϰ� �ϴ���
		// �ڽ��� ������ method�� ���� ���� ȣ���
	}
	
	public static void main(String[] args) {
		// �ڽ� Ŭ������ ��üȭ 
		TestAbstractSub tas = new TestAbstractSub();
		tas.test(); 	// Override�� method ȣ��
	}
}
