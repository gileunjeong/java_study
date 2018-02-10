package day0127_am;

public class TestMethod {
	public void instanceMethod() {
		System.out.println("instanceMethod called!");
	}//instanceMethod
	
	public static void staticMethod() {
		System.out.println("staticMethod called!");
	}//staticMethod
	
	// 1. ������ : ��ȯ�� ����, �Ű����� ���� ��
	public void typeA() {
		System.out.println("�������� ��");
	}
	// 2. ������ : ��ȯ�� ����, �Ű����� �ִ� �� 
	public void typeB(int i) {
		System.out.println("���� �� "+i);
	}
	// 3. ������ : ��ȯ�� �ְ�, �Ű����� ���� ��
	public int typeC() {
		int i = 27;
		return i;
	}
	// 4. ������ : ��ȯ�� �ְ�, �Ű����� �ִ� ��
	public int typeD(char c) {
		return (int)c;
	}
	
	public static void main(String[] args) {
		// static ���������� instance����(non-static field)�� ����, �޼ҵ带 ���� ���(ȣ��)�� �� ����
		// instanceMethod();
		// ��üȭ �� ȣ�� - tm(��ü)
		TestMethod tm = new TestMethod();
		tm.instanceMethod();
		
		// static method�� ��üȭ ���� ���� ��밡��
		staticMethod();					// ��밡��
		TestMethod.staticMethod();	// ����
		
		// ������
		tm.typeA();
		// ������
		tm.typeB(2018);
		tm.typeB(1);
		tm.typeB(27);
		// ������
		int temp = tm.typeC();
		System.out.println(temp);
		// ������
		for(char c = 'A'; c <= 'Z'; c++) {
			
			temp = tm.typeD('b');
			System.out.print(c+"�� Unicode�� " +temp+" ");
			
		}
	}//main

}//class
