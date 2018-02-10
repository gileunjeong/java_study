package day0203_am;

public class UseArrayOne {

	public UseArrayOne() {
//		System.out.println("생성자");
	}
	
	public void array1() {
		// 1. 선언 : 데이터형[] 배열명 = null;
		int[] arr = null;
		
		// 2. 생성 : 배열명 = new 데이터형[방의수];  -> 모든 방의 값이 초기화
		arr = new int[5];
		
		// 선언과 생성 동시에 : 데이터형[] 배열명 = new 데이터형[방의수];
		int[] arr1 = new int[10];
		
		System.out.println("arr 배열의 방의 수 : "+arr.length+", arr1 배열의 방의 수 : "+arr1.length);
		
		// 방의 값이 고정되어 있다면 기본형 형식으로 생성할 수 있음
		// 문법) 데이터형[] 배열명 = {값1, 값2, 값3,......};
		String[] subjArr = {"Java", "JDBC", "JNDI", "DBCP"};
		
		// 3. 값 할당 : 배열명[방의번호] = 값;
		arr[0] = 100;
		
		// 모든 방의 값 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
		// 개선된 for (JDK1.5) - 인덱스를 사용할 수 없으며, 모든 방의 값을 출력
		System.out.println("개선된 for");
		for(int value : arr) {
			System.out.println(value);
		}
		
		for(String subject : subjArr) {
			System.out.println(subject);
		}
		
	}

	public static void main(String[] args) {
//		UseArrayOne uao = new UseArrayOne();
//		uao.array1();
		
		// 객체 생성 후 method 호출 동시에 하는 객체화 : new 생성자().method명(); -chain
		new UseArrayOne().array1();
	}

}
