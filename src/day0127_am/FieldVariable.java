package day0127_am;

/**
 * class field�� ����Ǵ� ������ ���
 * instance(member)���� : ��üȭ�Ͽ� ���, ��ü�� GC(-garbage collector/  System.gc())�� ���� �޸𸮿��� ���ŵǴ� �� �����.
 *                                  '��ü��.������'���� ���(��ü���� ������ ������ ���)
 * static(class)���� : Ŭ������ ����Ǹ�(java Ŭ������) �޸�(method ����)�� �ε�ǰ� JVM(java.exe)�� ����Ǹ� �޸𸮿��� �����.
 *                         ���뺯��(��� ��ü�� �ϳ��� ������ ���)
 * @author sist05
 */
public class FieldVariable {
	
	int i;	//��üȭ�ؾ� ��밡��
	static int j;
	
	public static void main(String[] args) {
		
		//static ������ Ŭ������ ����� �� ������� ����
		//i = 27;		//static �������� instance ������ ���� ����� �� ����
		j = 27;		//static ������ ���� ��밡��
		
		//i ����Ϸ���.. 1. ��üȭ 2. ��ü��.���������� ���
		//1. ��üȭ :  Ŭ������ ��ü�� = new ������();
		FieldVariable fv = new FieldVariable();
		//�������
		fv.i = 1;
		
		System.out.println("static ���� "+FieldVariable.j +" , instance ���� : "+fv.i);
		
		//static ���� (����-Ư����ü�� ������ ����) ��밡�� ������
		//�߸� ����ϴ� ���� : ��ü��.������
		fv.j = 20;
		
		fv.finalize();
	
		
	}//mian
	
	public void finalize() {
		// ��ü(fv)�� GC�� ���� �Ҹ�Ǹ� ȣ��Ǵ� �޼ҵ�
		// Servlet/JSP(destroy/_jspDestroy)
		
	}
}//class
