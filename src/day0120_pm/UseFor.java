package day0120_pm;

import java.util.Iterator;

/**
 * 시작과 끝을 알 때 사용하는 반복문 : for
 * @author sist05
 */
public class UseFor {

	public static void main(String[] args) {
		// 단일 for
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" 번째 안녕하세요.");
		}
		
		// 단일 for
		// 1. 1~100까지 출력하는 for
		// 2. 1~100까지 홀수만 출력 for
		// 3. 1~100까지 누적합 for : 5050
		// 4. 'A'~'Z' 까지 출력하는 for
		// 5. 구구단 3단 출력하는 for
		
		// 다중 for
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print(i+" 번째 안쪽 for 시작 -->  ");
				System.out.println("i : "+i+" , j : "+j);
				
			}//end for j
			System.out.println("  <--"+i+" 번째 안쪽 for 끝");
		}//end for i
		
		// 다중 for
		// 6. 구구단 전체 출력 for
		// 2x1=2 2x2=4 ...
		// ...
		// 9단
		// 7. 구구단 세로 출력
		// 8. 
		// 0 0
		// 1 0 1 1
		// 2 0 2 1 2 2 
		// 3 0 3 1 3 2 3 3
		
		System.out.println("-----------------------------");
		
		// for 무한 loop : 종료되지 않는 프로그램(서버, 시계...)
		for( ; ; ) { // 수를 세지 않는 무한 루프
			System.out.println("무한");
			break;
		}//end for
//		int temp; // 무한 루프 다음줄의 코드는 실행 될수 없음
		// 증가하는 수를 세는 무한 루프
		for (int i = 0;  ; i++) {
			System.out.println("무한 "+i);
			break;
		}
	}

}
