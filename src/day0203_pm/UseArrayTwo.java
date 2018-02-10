package day0203_pm;

public class UseArrayTwo {
	
	public void array2() {
		// 1. 선언 : 데이터형[][] 배열명 = null;
		int[][] arr = null;
		
		// 2. 생성 : 배열명 = new 데이터형[행수][열수];   -> 모든방의 값이 초기화
		arr = new int[3][2];
		// 열의 갯수를 설정하지 않으면 가변배열(행마다 열의 수가 다른 배열)로 생성
		int[][] variableArr = null;
		variableArr = new int[5][];
		
		// 3. 값 할당 : 배열명[행][열] = 값;
		arr[0][0] = 10;
		arr[2][1] = 20;
		// 가변배열은 열이 생성되어있지 않기 때문에 행마다 열을 생성해야 한다.
		// 배열명[행의번호] = new 데이터형[열의수];
		// 고정값을 설정하여 열 생성 :  배열명[행의번호] = new 데이터형[]{값,,,,,};
		variableArr[0] = new int[2];	// 모든 방의 값 초기화
		variableArr[1] = new int[3];	// 모든 방의 값 초기화
		variableArr[2] = new int[]{1,2,3,4,5,5,6,7,7,8,};	// 고정값으로 방을 생성
		variableArr[3] = new int[5];	// 모든 방의 값 초기화
		variableArr[4] = new int[2];	// 모든 방의 값 초기화
		
		// 가변배열 값 할당
		variableArr[0][0] = 2;
		variableArr[4][1] = 20;
		
		// 값 사용
		for(int i = 0; i < arr.length; i++) { // 행
			for(int j = 0; j < arr[i].length; j++) { // 열
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		// 가변배열 모든 방 값 출력
		for(int i = 0; i < variableArr.length; i++) { // 행
			for(int j = 0; j < variableArr[i].length; j++) { // 열
				System.out.print(variableArr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------");
		for(int[] arr1 :  variableArr) { // 이차원 배열의 한 행은 일차원 배열로 이루어져있음
			for(int value : arr1) { // 일차원 배열의 방 하나는 데이터형으로 이루어져있음
				System.out.print(value + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------");
		// 이차원 배열의 기본형 형식의 사용(행구분 괄호 사용)
		// 데이터형[][] 배열명 = {{값,,},{,,,},{,,,}};
		int[][] tempArr = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
		for(int[] arr1: tempArr) {	// 행
			for(int value : arr1) {	// 열
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new UseArrayTwo().array2();
	}

}
