package day0203_pm;

/**
 * interface를 구현한 클래스  : interface의 모든 추상메소드를 구현(Override)해야함
 * @author sist05
 */
public class MyInterImpl implements MyInter{

	@Override
	public void test() {
		System.out.println("test called!!!");
	}

	@Override
	public void temp() {
		System.out.println("temp called!!!");
	}
	
	public void impl() {
		System.out.println("자식의 method!!!");
	}
	
	public static void main(String[] args) {
		// interface는 직접 직접 객체화 될 수 없음
//		MyInter mi = new MyInter();	// error
		// 구현클래스가 객체화되면 그 주소는 저장할 수 있음(객체를 받는다-객체를 만드는게 아니라 받음)
		MyInter mi = new MyInterImpl();	// is a 관계의 객체화 , 객체 다형성
		// is a 관계의 객체화일때 객체로 호출 가능 한 것은 부모의 method와 변수
		mi.foo();		// default method는 body가 존재하므로 호출가능
		mi.test(); 	// Override된 method를 호출하면 자식이 구현한 method가 최우선적으로 호출됨
		mi.temp();
//		mi.impl();	// mi객체의 데이터형이 MyInter이므로 자식 클래스를 통하여 객체화 했다고 하더라도 호출이 불가능함.
	}

}
