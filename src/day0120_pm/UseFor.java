package day0120_pm;

import java.util.Iterator;

/**
 * ���۰� ���� �� �� ����ϴ� �ݺ��� : for
 * @author sist05
 */
public class UseFor {

	public static void main(String[] args) {
		// ���� for
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" ��° �ȳ��ϼ���.");
		}
		
		// ���� for
		// 1. 1~100���� ����ϴ� for
		// 2. 1~100���� Ȧ���� ��� for
		// 3. 1~100���� ������ for : 5050
		// 4. 'A'~'Z' ���� ����ϴ� for
		// 5. ������ 3�� ����ϴ� for
		
		// ���� for
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print(i+" ��° ���� for ���� -->  ");
				System.out.println("i : "+i+" , j : "+j);
				
			}//end for j
			System.out.println("  <--"+i+" ��° ���� for ��");
		}//end for i
		
		// ���� for
		// 6. ������ ��ü ��� for
		// 2x1=2 2x2=4 ...
		// ...
		// 9��
		// 7. ������ ���� ���
		// 8. 
		// 0 0
		// 1 0 1 1
		// 2 0 2 1 2 2 
		// 3 0 3 1 3 2 3 3
		
		System.out.println("-----------------------------");
		
		// for ���� loop : ������� �ʴ� ���α׷�(����, �ð�...)
		for( ; ; ) { // ���� ���� �ʴ� ���� ����
			System.out.println("����");
			break;
		}//end for
//		int temp; // ���� ���� �������� �ڵ�� ���� �ɼ� ����
		// �����ϴ� ���� ���� ���� ����
		for (int i = 0;  ; i++) {
			System.out.println("���� "+i);
			break;
		}
	}

}
