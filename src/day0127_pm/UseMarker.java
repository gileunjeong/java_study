package day0127_pm;

/**
 * ��ī�� Ŭ������ ��ü�� ����� ����ϴ� Ŭ����
 * @author sist05
 *
 */
public class UseMarker {

	/**
	 * Java Application�� ��������� �����ϴ� method(�ܵ�����)
	 * VM Arguments : java.exe�� ������
	 * 		java -Xms512m -Xmx1024m
	 * Program Arguments : ����Ǵ� Java class�� �Է��ϴ� ��
	 *     java UseMaker �ȳ� �ϼ���? 1�� 27��
	 * java UseMarker �� �� �� ...
	 * @param args Program Arguments -����� �Է��ϴ� ��
	 */
	public static void main(String[] args) {
		
		// ���� : instance ������ �ʱ�ȭ��(������-0, �Ǽ���-0.0, �Ҹ���-false, ������-\u0000, ������-null)
		// ��ü : ������ �������� - �ּҸ� ����
		Marker black = new Marker();
		Marker red = new Marker(3,3,"����");
		System.out.println("heap�� �ּ� : "+black);		// day0127_pm.Marker@47fd17e3
		System.out.println("�⺻ ������ ��� : "+black.getCap()+" "+black.getBody()+" "+black.getColor());
		
		// setter method�� ������ ��ü�� �� ����
//		black.setCap(1);
//		black.setBody(1);
//		black.setColor("����");
		// getter method�� ��ü�� ������ �� ���
		System.out.println("Overload�� ������ ��� : "+red.getCap()+" "+red.getBody()+" "+red.getColor());
		
		// �������� Ư¡ ���(����)
		System.out.println(black.write("�ȳ��ϼ���."));
		System.out.println(red.write("�ȳ��ϼ���."));
	}

}
