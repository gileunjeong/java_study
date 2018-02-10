package day0127_pm;

/**
 * 마카펜을 대상으로 작성한 클래스
 * 명사적특징 : 뚜껑, 몸체, 색 ~>데이터(변수)
 * 동사적특징 : 쓴다 ~>동작(method)
 * 일반적인 업무를 구현하기 위해 사용하는 일반클래스 형식으로 작성
 * 사용)
 * 객체화 : Marker marker = new Marker();
 * @author sist05
 */
public class Marker {
	private int cap, body;		// int는 0으로 초기화
	private String color;			// String은 null로 초기화
	
	/**
	 * Marker의 기본 생성자
	 * 뚜껑 1개, 몸체 1개, 검은색인 마카펜 생성
	 */
	public Marker() {
		// 객체가 생성될 때 가져야 할 기본 값 설정
		cap = 1;
		body = 1;
		color = "검은";
	}
	/**
	 * Overload된 생성자 
	 * 입력한 값으로 마카펜을 생성하는 생성자 
	 * @param cap   뚜껑의 갯수
	 * @param body 몸체의 갯수
	 * @param color 색
	 */
	public Marker(int cap, int body, String color) {
		// 객체가 생성될 때 가져야 할 기본 값을 외부에서 받아 설정(동적)
		this.cap = cap;
		this.body = body;
		this.color = color;
	}
	
	// alt+shift+s : generate getters and setters...
	/**
	 * 생성된 마카펜 객체의 뚜껑 수를 반환하는 일 
	 * @return 뚜껑 수
	 */
	public int getCap() {
		return cap;
	}
	/**
	 * 생성된 마카펜 객체의 뚜껑 수를 설정하는 일
	 * @param cap 설정할 뚜껑의 수
	 */
	public void setCap(int cap) {
		this.cap = cap;
	}
	/**
	 * 생성된 마카펜 객체의 몸체 수를 반환하는 일
	 * @return 몸체 수
	 */
	public int getBody() {
		return body;
	}
	/**
	 * 생성된 마카펜 객체의 몸체 수를 설정하는 일
	 * @param body 몸체 수
	 */
	public void setBody(int body) {
		this.body = body;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * 마카펜의 동사적인 특징 구현한 method
	 * parameter로 입력된 메세지를 생성된 색으로 칠판에 쓰는 일 구현
	 * @param msg 쓰고자 하는 메세지
	 * @return 색을 가지고 메세지 기록 결과
	 */
	public String write(String msg) {
		return "칠판에 "+color+"색인 마카펜으로 \""+msg+"\"를 쓴다.";
	}
	
}
