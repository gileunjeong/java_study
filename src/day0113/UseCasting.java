package day0113;

/**
 * ���� ����ȯ
 * @author sist05
 */
public class UseCasting {

	public static void main(String[] args) {
		float f = (float)1.13;		// ����÷� �Ҵ� ����, ��������ȯ���� �Ҵ� ����
		int i = (int)f;
		
		System.out.println("f = "+f+"\ni = "+i);  	// ������ �� ���ս� �߻�

		//* �⺻�� ���������� ������ ���������� ���� casting �� �� ����.
		//String str = "10";		// ������
		//int num = str;
		
		//* boolean�� ���������θ� casting ��
		boolean b = false;
		//int num = b;
		
		// ����
		int a1 = 10;	// 10����
		int a2 = 010;	// 8���� 10 : ���ֻ������ ����
		int a3 = 0xa;	// 16���� 10 : ��ǥ���Ҷ� ���� ��
		
		System.out.println(a1+a2+a3);	// 30
		
		// 1�� ��������(~.tild)
		// ~��� : ��ȣ���� 1����
		// ~���� : ��ȣ���� 1����
		int t=10;
		System.out.println(~t); 
		
		// ! (not)
		System.out.println(!(3>2));
		
		
		
		
	}//main

}//class
