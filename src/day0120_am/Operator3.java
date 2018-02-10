package day0120_am;

/**
 * 쉬프트 연산자
 * <<, >>, >>>
 * @author sist05
 */
public class Operator3 {

	public static void main(String[] args) {
		int i = 10;	// 0000 1010
		// 0000 1010 << 2 = 0010 1000
		System.out.println(i+" << 2  = "+(i << 2));
		/*
		i = 1;	// 0000 0000 0000 0000 0000 0000 0000 0001	(정수 literal은 4byte)
		System.out.println(i<<31); 	//-2147483648
		System.out.println(i<<32); 	//1	(좌 쉬프트인 경우 다시 뒤로 와서 채워짐)
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
