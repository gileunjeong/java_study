package day0203_pm;

/**
 * interface�� ������ Ŭ����  : interface�� ��� �߻�޼ҵ带 ����(Override)�ؾ���
 * @author sist05
 */
public class MyInterImpl implements MyInter{

	@Override
	public void test() {
		System.out.println("test called!!!");
	}

	@Override
	public void temp() {
		System.out.println("temp called!!!");
	}
	
	public void impl() {
		System.out.println("�ڽ��� method!!!");
	}
	
	public static void main(String[] args) {
		// interface�� ���� ���� ��üȭ �� �� ����
//		MyInter mi = new MyInter();	// error
		// ����Ŭ������ ��üȭ�Ǹ� �� �ּҴ� ������ �� ����(��ü�� �޴´�-��ü�� ����°� �ƴ϶� ����)
		MyInter mi = new MyInterImpl();	// is a ������ ��üȭ , ��ü ������
		// is a ������ ��üȭ�϶� ��ü�� ȣ�� ���� �� ���� �θ��� method�� ����
		mi.foo();		// default method�� body�� �����ϹǷ� ȣ�Ⱑ��
		mi.test(); 	// Override�� method�� ȣ���ϸ� �ڽ��� ������ method�� �ֿ켱������ ȣ���
		mi.temp();
//		mi.impl();	// mi��ü�� ���������� MyInter�̹Ƿ� �ڽ� Ŭ������ ���Ͽ� ��üȭ �ߴٰ� �ϴ��� ȣ���� �Ұ�����.
	}

}
