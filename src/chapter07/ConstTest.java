package chapter07;

public class ConstTest {

	//��������� private�̾ ���� Ŭ������ ������ �����ϸ� ��밡��
	private int aa;
	private int bb;
	
	//�⺻ ������
	
	public ConstTest() {
		
	}

	public ConstTest(int aa, int bb) {
		this.aa = aa;
		this.bb = bb;
	}
	
	public static void main(String[] args) {
		
		ConstTest obj1 = new ConstTest();
		
		ConstTest obj2 = new ConstTest(30,40);
		System.out.println(obj2.aa);
		System.out.println(obj2.bb);
	}
	
	
}
