package day0120_pm;

/**
 * if : ��� ���� ���� �� �ִ� ���ǹ�
 *      
 * @author sist05
 */
public class TestIf {

	public static void main(String[] args) {
		// ���� if : ���ǿ� �´� ��쿡�� �ڵ� ����
		int price = 3000;	// ��ǰ����
		// ������ : Ư���� 30%, �Ϲݰ� 10%
		double sale = 0.1D;	// D,d : �����
		String type = "�Ϲ�";
		if( "Ư��".equals(type)) {
//		if( type.equals("Ư��")) {  // NullPointerException�� �߻���ų�� ����
			sale = 0.3;
		}
		System.out.println(type+" ���� ���󰡴� "+price+", ���ΰ��� "+(price-price*sale)+"�Դϴ�.");
		
		System.out.println("------------------------------------------------------------------------------------");
		
		// if~else
		int num = -20;
		// �� �� �ϳ��� �ڵ带 �����ؾ� �� ��
		System.out.print(num+"�� ");
		if(num >= 0) {
			System.out.println("���");
		}else {
			System.out.println("����");
		}
		
		System.out.println("------------------------------------------------------------------------------------");
		
		// ���� if( else~if)
		// ������ �ִ� �������� ��
		// ���� ��ȿ ���� : ������ 0~100�� ���̸� ��ȿ
		int score = 200;
		
		System.out.print(score+"���� ");
		if( score < 0 ) {
			System.out.println("0���� ���� �� ����.");
		}else if( score > 100 ) {
			System.out.println("100���� Ŭ �� ����.");
		}else {
			System.out.println("��ȿ����!!!");
		}
		
		
		
	}

}
