package day0203_pm;

public class TestSub extends TestSuper{
	
	int i;
	
	public TestSub() {
		super();
		System.out.println("�ڽ�Ŭ���� ������");
	}
	
	public void childMethod() {
		System.out.println("�ڽ� Method");
		// �ڽ�Ŭ������ �θ�Ŭ������ �������� �ٸ��ٸ� this�� ��� ���ٰ���
		System.out.println("�ڽ� i : "+this.i+" �θ� j : "+this.j);
		// �ڽ�Ŭ������ �θ�Ŭ������ �������� ���ٸ� this�δ� �ڽ�Ŭ������ �ڿ��� ��� �����ϰ�,
		// �θ�� super()�� �����Ͽ� ����Ѵ�.
		//this.i = 100;
		super.i = 100;
		System.out.println("�ڽ� i : "+i+", �θ� i : "+super.i);
	}

	public static void main(String[] args) {
		TestSub ts = new TestSub();	// �ڽ��� �����ϸ� �θ� ���� �����ȴ�.
		ts.childMethod();
	}

}
