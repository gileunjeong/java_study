package day0127_pm;

/**
 * ������ Overload - ��ü�� ������ �� �پ��� ���� ������ ��ü�� ������ �� �ִ�.
 * 
 * method Overload - ���� �̸��� method�� ȣ�� ������ �پ��� ���� ������ �� �ִ�.
 * @author sist05
 */
public class TestOverload {
	// �ν��Ͻ� ����
	int temp;
	public TestOverload() {
		System.out.println("�⺻������(default Constructor)");
	}
	public TestOverload(int i) {
		temp = i;
		System.out.println("Overload ������");
	}
	public TestOverload(String i) {
		temp = Integer.parseInt(i);		//���ڿ��� ������ ����
		System.out.println("Overload ������");
	}

	public void star() {
		System.out.println("*");
	}
	public void star(int cnt) {
		for(int i = 0; i < cnt; i++) {
			System.out.print("*");
		}
	}
	
	public static void main(String[] args) {
		TestOverload to = new TestOverload();			// �⺻������ ���
		TestOverload to1 = new TestOverload(27);		// Overload�� ������ ���
		TestOverload to2 = new TestOverload("30");	// Overload�� ������ ���
		System.out.println("�⺻ ������ ��� "+to.temp);
		System.out.println("Overload�� ������ ��� "+to1.temp);
		System.out.println("Overload�� ������ ��� "+to2.temp);
		
		// Overload�� method ȣ��
		// �� �ϳ� ���
		to.star();
		// �� ������ ���
		to.star(5);
		
	}

}
