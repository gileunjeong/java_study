package day0203_pm;

/**
 * �����ϴ� Ŭ�������� �ݵ�� �ؾ��ϴ� ���� ����� ����
 * @author sist05
 */
public interface MyInter {
//	int i;	// interface�� ������ ���� �� ����
	public static final int TEST = 10; 	// constant�� ����
	
//	public void test() {	// �Ϲ� method ���� �� ����		
//	}
	
	public void test();		// abstract ����
	public abstract void temp();
	
	// default method : ���� ������ �� ����(body�� ���� �� ����) 
	public default void foo() {
		System.out.println("foo called!!!!");
	}
	
}
