package day0120_pm;

/**
 * if : 모든 값을 비교할 수 있는 조건문
 *      
 * @author sist05
 */
public class TestIf {

	public static void main(String[] args) {
		// 단일 if : 조건에 맞는 경우에만 코드 실행
		int price = 3000;	// 상품가격
		// 할인율 : 특별고객 30%, 일반고객 10%
		double sale = 0.1D;	// D,d : 형명시
		String type = "일반";
		if( "특별".equals(type)) {
//		if( type.equals("특별")) {  // NullPointerException을 발생시킬수 있음
			sale = 0.3;
		}
		System.out.println(type+" 고객님 정상가는 "+price+", 할인가는 "+(price-price*sale)+"입니다.");
		
		System.out.println("------------------------------------------------------------------------------------");
		
		// if~else
		int num = -20;
		// 둘 중 하나의 코드를 실행해야 할 때
		System.out.print(num+"은 ");
		if(num >= 0) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}
		
		System.out.println("------------------------------------------------------------------------------------");
		
		// 다중 if( else~if)
		// 연관성 있는 여러조건 비교
		// 점수 유효 범위 : 점수는 0~100점 사이만 유효
		int score = 200;
		
		System.out.print(score+"점은 ");
		if( score < 0 ) {
			System.out.println("0보다 작을 수 없다.");
		}else if( score > 100 ) {
			System.out.println("100보다 클 수 없다.");
		}else {
			System.out.println("유효범위!!!");
		}
		
		
		
	}

}
