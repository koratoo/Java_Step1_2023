package chapter01;

public class BinaryTest3 {
	
	public static void main(String[] args) {
		//int : ����(4����Ʈ) => 32 ��Ʈ
		//0 => ��� / 1 => ����
		int num1 = 0B000000000000000000000000101;//2����
		
		//�ڵ� ���� ������ �μ��δ� ��Ȯ�� ǥ���� �ȵ�.
		int num2 = 0B11111111111111111111111111111010;//2���� ����(-)
		//���ڸ��� +1�� �ϹǷ� ��Ȯ�� ������ ������ => 0(����?/���?)
		int num3 = 0B11111111111111111111111111111011;//2������ 1�� ����

		
		System.out.println(num1);		
		System.out.println(num2);
		System.out.println(num3);
	}
}
