package day0127_pm;

/**
 * ��ī���� ������� �ۼ��� Ŭ����
 * �����Ư¡ : �Ѳ�, ��ü, �� ~>������(����)
 * ������Ư¡ : ���� ~>����(method)
 * �Ϲ����� ������ �����ϱ� ���� ����ϴ� �Ϲ�Ŭ���� �������� �ۼ�
 * ���)
 * ��üȭ : Marker marker = new Marker();
 * @author sist05
 */
public class Marker {
	private int cap, body;		// int�� 0���� �ʱ�ȭ
	private String color;			// String�� null�� �ʱ�ȭ
	
	/**
	 * Marker�� �⺻ ������
	 * �Ѳ� 1��, ��ü 1��, �������� ��ī�� ����
	 */
	public Marker() {
		// ��ü�� ������ �� ������ �� �⺻ �� ����
		cap = 1;
		body = 1;
		color = "����";
	}
	/**
	 * Overload�� ������ 
	 * �Է��� ������ ��ī���� �����ϴ� ������ 
	 * @param cap   �Ѳ��� ����
	 * @param body ��ü�� ����
	 * @param color ��
	 */
	public Marker(int cap, int body, String color) {
		// ��ü�� ������ �� ������ �� �⺻ ���� �ܺο��� �޾� ����(����)
		this.cap = cap;
		this.body = body;
		this.color = color;
	}
	
	// alt+shift+s : generate getters and setters...
	/**
	 * ������ ��ī�� ��ü�� �Ѳ� ���� ��ȯ�ϴ� �� 
	 * @return �Ѳ� ��
	 */
	public int getCap() {
		return cap;
	}
	/**
	 * ������ ��ī�� ��ü�� �Ѳ� ���� �����ϴ� ��
	 * @param cap ������ �Ѳ��� ��
	 */
	public void setCap(int cap) {
		this.cap = cap;
	}
	/**
	 * ������ ��ī�� ��ü�� ��ü ���� ��ȯ�ϴ� ��
	 * @return ��ü ��
	 */
	public int getBody() {
		return body;
	}
	/**
	 * ������ ��ī�� ��ü�� ��ü ���� �����ϴ� ��
	 * @param body ��ü ��
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
	 * ��ī���� �������� Ư¡ ������ method
	 * parameter�� �Էµ� �޼����� ������ ������ ĥ�ǿ� ���� �� ����
	 * @param msg ������ �ϴ� �޼���
	 * @return ���� ������ �޼��� ��� ���
	 */
	public String write(String msg) {
		return "ĥ�ǿ� "+color+"���� ��ī������ \""+msg+"\"�� ����.";
	}
	
}
