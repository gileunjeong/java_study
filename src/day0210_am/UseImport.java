package day0210_am;

// Ư�� ��Ű������ Ư�� Ŭ������ ����� ��
import java.util.Calendar;
import java.util.Date;

import kr.co.sist.service.Test;

//import java.util.*;			// util package�� ��� byte code(Ŭ����, �������̽�)�� ����. -> �ӵ��� �������� �������� ���� 

public class UseImport {

	public static void main(String[] args) {
		Date date  =  new Date();
		Calendar cal = null;
		
		// ���� �� project�� �����ϱ����� .jar�� �����Ͽ� �����Ǹ�
		// eclipse������ build path�� �����Ͽ� ����ϰ� 
		// service �� ���� classpath�� �����Ͽ� ���
		Test t = new Test();
		System.out.println(t.createDate());
		System.out.println(t.nowYear());
		
	}

}
