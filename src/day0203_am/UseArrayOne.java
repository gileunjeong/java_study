package day0203_am;

public class UseArrayOne {

	public UseArrayOne() {
//		System.out.println("������");
	}
	
	public void array1() {
		// 1. ���� : ��������[] �迭�� = null;
		int[] arr = null;
		
		// 2. ���� : �迭�� = new ��������[���Ǽ�];  -> ��� ���� ���� �ʱ�ȭ
		arr = new int[5];
		
		// ����� ���� ���ÿ� : ��������[] �迭�� = new ��������[���Ǽ�];
		int[] arr1 = new int[10];
		
		System.out.println("arr �迭�� ���� �� : "+arr.length+", arr1 �迭�� ���� �� : "+arr1.length);
		
		// ���� ���� �����Ǿ� �ִٸ� �⺻�� �������� ������ �� ����
		// ����) ��������[] �迭�� = {��1, ��2, ��3,......};
		String[] subjArr = {"Java", "JDBC", "JNDI", "DBCP"};
		
		// 3. �� �Ҵ� : �迭��[���ǹ�ȣ] = ��;
		arr[0] = 100;
		
		// ��� ���� �� ���
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
		// ������ for (JDK1.5) - �ε����� ����� �� ������, ��� ���� ���� ���
		System.out.println("������ for");
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
		
		// ��ü ���� �� method ȣ�� ���ÿ� �ϴ� ��üȭ : new ������().method��(); -chain
		new UseArrayOne().array1();
	}

}
