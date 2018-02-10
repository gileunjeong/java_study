package day0120_pm;

/**
 * Constant : ��𿡼��� ���Ǹ� �� ���� ���� �ʴ� ����
 *             - ���α׷��� ���ذ��� ����, ����� ����
 * @author sist05
 */
public class TestConstant {

	public static final int MIN = 0;
	public static final int MAX = 100;
	
	public static void main(String[] args) {
		//public static final int MAX = 100; // ����� �޼ҵ� ������ ������ �� ����
		System.out.println("����� : "+MIN);
		System.out.println("Ŭ������.����� : "+TestConstant.MAX);
		// ������� ���� �̿ܿ��� ���Ҵ��� �� �� ����
		// MAX = 99;
		// Wrapper Class : �⺻�� ���������� ��ü�� ����ϱ� ���� �ۼ��� Ŭ������.
		// �⺻�� : �� �����ɸ� ����, ��ü : �� ������, ������ �ϵ�.
		System.out.println("int Wrapper Class ��� "+Integer.MIN_VALUE+" , " +Integer.MAX_VALUE);
		System.out.println("long Wrapper Class ��� "+Long.MIN_VALUE+" , " +Long.MAX_VALUE);
		
	}

}
