package day0120_pm;

/**
 * ���۰� ���� �𸦶� ����ϴ� �ݺ���
 * while : �ּ� 0������ �ִ� ���Ǳ��� ����
 * do ~ while :  �ּ� 1������ �ִ� ���Ǳ��� ����
 * @author sist05
 */
public class TestWhile {
	
	int test;
	
	// instance method (static�� ���� method)
	public void m() {
		test = 100;
	}

	// static method(static: Ŭ������ ����Ǹ� memory�� ����ó�� �ö󰡴� method. method����)
	public static void main(String[] args) {
		//test = 100;
		
		int i = 0;
		while( i < 10 ) { // ���ǽ� : true/false ���� loop
			System.out.println(i+"�� ����");
			i++;
		}
		
		int j = 1000;
		do {
			System.out.println("-------"+j+"-------");
			j++;
		}while( j < 10 );
	}

}
