package day0120_pm;

/**
 * 시작과 끝을 모를때 사용하는 반복문
 * while : 최소 0번부터 최대 조건까지 수행
 * do ~ while :  최소 1번부터 최대 조건까지 수행
 * @author sist05
 */
public class TestWhile {
	
	int test;
	
	// instance method (static이 없는 method)
	public void m() {
		test = 100;
	}

	// static method(static: 클래스가 실행되면 memory에 가장처음 올라가는 method. method영역)
	public static void main(String[] args) {
		//test = 100;
		
		int i = 0;
		while( i < 10 ) { // 조건식 : true/false 무한 loop
			System.out.println(i+"번 수행");
			i++;
		}
		
		int j = 1000;
		do {
			System.out.println("-------"+j+"-------");
			j++;
		}while( j < 10 );
	}

}
