package day0120_am;

/**
 * 대입연산자 : 연산 후 변수에 값이 변경되기 때문에 변수의 값을 주의하여 생각해야함
 * @author sist05
 */
public class Operator7 {

	public static void main(String[] args) {
		int i = 4;
		//System.out.println(i);
		i += 3; // i=i+3
		//System.out.println(i);
		i -= 2; // i=i-2
		//System.out.println(i);
		i *= 2; 
		i /= 3; 
		i %= 4; 
		
		//////// 쉬프트대입 ////////
		i <<= 4;		// i=i << 4; // 0000 0011 << 3 = 0011 0000
		i >>= 2;		// i=i >> 2; // 0011 0000 >> 2 = 0000 1100
		i >>>= 1;		// i=i >>> 1; // 0000 1100 >>> 1 = 0000 0110
				
		//////// 비트논리대입 ////////
		i &= 0x000000ffff;  // 0000 0110 & 1111 1111 = 0000 0110
		i |= 3;  // 0000 0110 | 0000 0011 = 0000 0111
		i ^= 8;  // 0000 0111 ^ 0000 1000 = 0000 1111
		
		System.out.println(i);
		
	}

}
