package day0120_am;

/**
 * ���׿����� ���
 * ~, !, +, -, ++, --
 * @author sist05
 */
public class Operator1 {

	public static void main(String[] args) {
		int i  = 20;
		System.out.println("~"+i+"="+~i);	//-21
//		System.out.println(!10);	// !�ڿ��� true �Ǵ� false
		
		int temp = 0;
		//�������� : ���� ����(���� �� ����)
		temp = ++i;
		System.out.println("�������� �� temp = "+temp+", i = "+i);
		//�������� : ���ǰ� ����(���� �� ����)
		temp = 0;
		temp = i++;
		System.out.println("�������� �� temp = "+temp+", i = "+i);
		
	}//main

}//class
