package chapter05;

public class TryCatchThrows {

	public static void fun() throws Exception{
		//������ �ƴϰ� �޼��带 ȣ���Ҷ� ������ ������ ��� �����ش�.
		try { //�����ڵ�
			System.out.println("fun()�޼��� ����");
			throw new Exception();
		} catch (RuntimeException e) { 
			//RuntimeException ���� �� �߻��ϴ� Exception
			// ������ �����ϴ� ���๮
			System.out.println("���ܹ߻�");
			
		}
	}
	
	
	public static void main(String[] args) {
		//throws Exception �޼ҵ� �̹Ƿ� try catch�� ȣ��
		//fun();
		try {
			fun();
		} catch (Exception e) {
			System.out.println("main()�� catch�� ����");
		}
		
	}//main
}
