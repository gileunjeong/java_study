package day0113;

/**
 * �⺻�� �������� ���.
 * �������� ����.
 * �����.
 * �ڵ�����ȯ
 * @author sist05
 */
public class DataType {
	
	public static void main(String[] args) {
		/*
		int i;		// �������� ����
		i = 7;		// ���Ҵ�
		System.out.println(i);		// ���� ���
		*/
		
		//* ������ Data *//
		byte a = 10;		// literal�� 1byte�� �ڵ� ��ȯ�Ǿ� �Ҵ�(�ڵ�����ȯ)
		short b = 10;		// literal�� 2byte�� �ڵ� ��ȯ�Ǿ� �Ҵ�(�ڵ�����ȯ)
		int c = 2_147_483_647;		// JDK1.7���ʹ� ������ ����� �� _�� �����ڷ� ����� �� ����
		long d = 2147483647;
		long e = 2147483648L;		// ����� : literal�� 4byte���� 8byte�� ��ȯ(Runtime��)
		
		System.out.println("byte = "+a+" \nshort = "+b+" \nint = "+c+" \nlong = "+ d+" , "+e);
		
		//* ������ Data *//
		char f = 'A';	// unicode�� �Ҵ�
		//char f = 65;	
		char g = '0';
		char h = '��';
		
		System.out.println("char = "+f+" , "+g+" , "+h);
		
		//* �Ǽ��� Data *//
		float i = 1.13F;	// ����� : literal�� 8byte���� 4byte�� ����
		double j = 1.13;
		
		System.out.println("float = "+i+" , double = "+j);
		
		//* �Ҹ��� Data *//
		boolean k = true;
		boolean l = false;
		
		System.out.println("boolean = "+k+", "+l);
		
		//
		byte num1 = 10;
		byte num2 = 20;
		int result = 0;
		result = num1 + num2;
		
	}//main

}//class
