package day0120_am;

/**
 * 단항연산자 사용
 * ~, !, +, -, ++, --
 * @author sist05
 */
public class Operator1 {

	public static void main(String[] args) {
		int i  = 20;
		System.out.println("~"+i+"="+~i);	//-21
//		System.out.println(!10);	// !뒤에는 true 또는 false
		
		int temp = 0;
		//전위연산 : 내것 먼저(연산 후 대입)
		temp = ++i;
		System.out.println("전위연산 후 temp = "+temp+", i = "+i);
		//후위연산 : 남의것 먼저(대입 후 연산)
		temp = 0;
		temp = i++;
		System.out.println("후위연산 후 temp = "+temp+", i = "+i);
		
	}//main

}//class
