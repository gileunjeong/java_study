package day0203_am;

/**
 * Ŭ������ �̸��� java.lang package���� �����ϴ� �̸��� ���ٸ�
 * lang package�� Ŭ������ ����ؾ��ϴ� ��Ȳ�� ���� ����
 * Ŭ������ ����ϰ� �ǹǷ� ������ �߻��ϰ� �ȴ�. 
 * (����: day0203_am.String Ŭ�������� �⺻ �޼ҵ带 ã�� �� �����ϴ�. ���� �������� �⺻ �޼ҵ带 �����Ͻʽÿ�.
   public static void main(String[] args)
�Ǵ� JavaFX ���ø����̼� Ŭ������ javafx.application.Application��(��) Ȯ���ؾ� �մϴ�.)
 * (�ذ� :  Ŭ������ ����� �� ��Ű����.Ŭ���������� ����ϵ�,
 *            Ŭ������ �ۼ��� �� �̸��� ��ġ�� �ʵ��� �ۼ�)
 * @author sist05
 */
/*public class UseString {

	//public static void main(String[] args) { --> ���� --> Ŭ������ �̸��� java.lang package���� �����ϴ� �̸��� �ٸ��� �־����
	public static void main(java.lang.String[] args) {
		// �⺻�� : String str = "ABC";
		//String str = "ABC"; --> ����
		System.out.println("test!!!");
	}// main

}// class
*/
public class UseString {

	public static void main(String[] args) {
		// �⺻�� : String str = "ABC";
		String str = "ABC";   // ctrl+shift+x,y : ��ҹ��� ���� 
		System.out.println("test!!!");
		String str1 = new String("ABC"); 
		// ��
		// �⺻�� ���� : ==, equals
		System.out.println("�⺻�� == �� : "+(str=="ABC"?"����":"�ٸ���"));
		System.out.println("�⺻�� equals �� : "+(str.equals("ABC")?"����":"�ٸ���"));
		
		// ������ ���� : equals
		System.out.println("������ == �� : "+(str1 == "ABC"?"����":"�ٸ���"));
		System.out.println("������ equals �� : "+(str1.equals("ABC")?"����":"�ٸ���"));
		
		
	}// main

}// class
