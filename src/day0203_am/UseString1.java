package day0203_am;

import java.util.Iterator;

public class UseString1 {

	// ������
	public UseString1() {
		String str = "AbcdEfdG";
		System.out.println(str);
		System.out.println(str+"�� ���� �� : "+str.length());
		System.out.println(str+" -> �빮�� : "+str.toUpperCase());
		System.out.println(str+" -> �ҹ��� : "+str.toLowerCase());
		System.out.println(str+" 'd'�� indexOf : "+str.indexOf('d'));
		System.out.println(str+" 'd'�� lastIndexOf : "+str.lastIndexOf('d'));  // �ڿ��� ������ ã��
		System.out.println(str+" 'k'�� indexOf : "+str.indexOf('k'));
		System.out.println(str+" ���� 5��° �ε����� ���� : "+str.charAt(5));
		System.out.println(str+" ���� 2~4 ������ ���ڿ�  : "+str.substring(2, 5));
		
		String temp = "����� ������ ���ﵿ";
		//temp = "����� ���빮��";
		temp = "��⵵ �����ν�";
		System.out.println(temp+"��(��) "+(temp.startsWith("����")?"Ư����":"�Ϲݵ���"));
		
		temp = "������ ���ﵿ";
		temp = "����� ������";
		System.out.println(temp+"��(��) "+(temp.endsWith("��")?"����":"�ð�"));
		
		temp = "Java, Oracle, JSP, MyBatics, Spring";
		System.out.println(temp+"���� 'a'�� 'test'�� ��ȯ : "+temp.replace('a', 'A'));			// replace(char arg0, char arg1)
		System.out.println(temp+"���� 'a'�� 'test'�� ��ȯ : "+temp.replaceAll("a", "test"));	// replaceAll(String arg0, String arg1)
		
		temp = "   A AA   ";
		System.out.println("["+temp+"]�� �յڰ��� ���� ["+temp.trim()+"]");
		System.out.println("["+temp+"]�� �յڰ��� ���� ["+temp.replaceAll(" ","")+"]");
		
	}// UseString1
	
	public static void main(String[] args) {
		// ��ü ���� �� ��ü������ ����, method�� ������� �ʴ� ��� ��üȭ
		// new ������();
		new UseString1();	
		//��ü ���� �� ��ü������ ����, method�� ����ϴ� ���
		// Ŭ������ ��ü�� = new ������();
		
	}

}
