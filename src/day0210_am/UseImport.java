package day0210_am;

// 특정 패키지내의 특정 클래스만 사용할 때
import java.util.Calendar;
import java.util.Date;

import kr.co.sist.service.Test;

//import java.util.*;			// util package의 모든 byte code(클래스, 인터페이스)를 참조. -> 속도가 느려져서 권장하지 않음 

public class UseImport {

	public static void main(String[] args) {
		Date date  =  new Date();
		Calendar cal = null;
		
		// 개발 된 project를 배포하기위해 .jar로 압축하여 배포되면
		// eclipse에서는 build path를 설정하여 사용하고 
		// service 할 때는 classpath를 설정하여 사용
		Test t = new Test();
		System.out.println(t.createDate());
		System.out.println(t.nowYear());
		
	}

}
