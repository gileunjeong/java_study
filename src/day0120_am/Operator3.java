package day0120_am;

/**
 * ����Ʈ ������
 * <<, >>, >>>
 * @author sist05
 */
public class Operator3 {

	public static void main(String[] args) {
		int i = 10;	// 0000 1010
		// 0000 1010 << 2 = 0010 1000
		System.out.println(i+" << 2  = "+(i << 2));
		/*
		i = 1;	// 0000 0000 0000 0000 0000 0000 0000 0001	(���� literal�� 4byte)
		System.out.println(i<<31); 	//-2147483648
		System.out.println(i<<32); 	//1	(�� ����Ʈ�� ��� �ٽ� �ڷ� �ͼ� ä����)
		System.out.println(i<<33); 	//2
		*/
		//0000 1010 >> 2 = 0000 0010
		System.out.println(i+" >> 2  = "+(i >> 2));
		i = -1;
		System.out.println(i+" >> 200  = "+(i >> 200));
		// 1111 1111 1111 1111 1111 1111 1111 1111 >> 1
		// = 0111 1111 1111 1111 1111 1111 1111 1111 
		System.out.println(i+" >>> 1  = "+(i >>> 1));	// 2147483647
		
	}

}
