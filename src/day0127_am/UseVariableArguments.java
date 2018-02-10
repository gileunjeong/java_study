package day0127_am;

/**
 * JDK1.5���� �߰��� ���
 * @author sist05
 */
public class UseVariableArguments {
	
	/**
	 * ���������� ����
	 * ȣ��) ȣ��� �Է°��� ���������� ���� �� ����
	 * vaMethod();
	 * vaMethod(1);
	 * vaMethod(1,2,3,4);
	 * vaMethod(1,2,3,,,,,,x);
	 * @param param
	 */
	public void vaMethod(int ... param) {
		for(int i = 0; i < param.length; i++) {
			System.out.println(param[i]);
		}
	}
	
	// variable arguments�� �������� �Ű������� ���� ���Ǹ� ���� ���������� ����
	protected void test(int i, String s, char ... c) {
//	protected void test(char ... c, int i, String s) { // Error
				
	}
	
	public static void main(String[] args) {
		UseVariableArguments uva = new UseVariableArguments();
//		uva.vaMethod();
		uva.vaMethod(2018,1,27,11,42);
		uva.test(1, "�ȳ�", 'A','B','��');
		System.out.println("-----------------------------------");
		System.out.printf("[%d][%4d][%-4d]\n", 12,12,12);
		System.out.printf("[%f][%5.2f][%-7.2f]\n", 1.2345,1.2345,1.2345);
		System.out.format("������ %d�� %d�� %d�� %c����(%s) �Դϴ�.\n", 
				2018, 1, 27, '��', "�����");
		
		System.out.println("������ \t ����� \n�Դϴ�.");
		
	}// main

}// class
