package day0113;

/**
 * ǥ�� ��� method�� ���
 * @author sist05
 */
public class UsePrint {

	public static void main(String[] args) {
		/*
		System.out.print("�ȳ�");
		System.out.print("�ϼ���?");
		*/
		
		System.out.println(13);	//�������
		System.out.println(1.13);//�Ǽ����
		System.out.println('A');	//���ڻ��
		System.out.println('��');	//���ڻ��
		System.out.println("������");	//���ڿ����
		System.out.println(true);	//boolean���
		System.out.println("1+13 = "+(1+13));	//�����
		
		//
		byte b = -127;
		b = -128;
		//b = -129;  // ���� �ʰ�
		
		//long l = 3000000000;
		long l = 3000000000L; // literal�� ũ�Ⱑ �þ(�����)
		System.out.println(l);
		
		//float f = 3.14;
		float f = 3.14F; // literal�� ũ�Ⱑ �پ��(�����)
		
		
	}//main

}//class
