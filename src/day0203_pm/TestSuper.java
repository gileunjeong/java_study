package day0203_pm;

/**
 * ��Ӱ����� �θ� Ŭ���� : �ڽ�Ŭ������ ������ ���� ��� ����
 * @author sist05
 */
public class TestSuper {
	int i, j;
	
	public TestSuper() {
		super();	// �θ�Ŭ������ �⺻�����ڸ� ȣ��
		System.out.println("�θ� Constructor");
	} // TestSuper
	
	public void parentMethod() {
		System.out.println("�θ� Method");
	} // parentMethod
}
