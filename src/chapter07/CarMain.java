package chapter07;

public class CarMain {

	public static void main(String[] args) {
		
		//��ü�� �����ϸ鼭 �ʱ�ȭ
		Car car = new Car("black",3000);
		
		//��������� ���� �����ؼ� ���
		System.out.println("==========================="); 
		
		//�޼ҵ带 �̿��� ���
		System.out.println(car.getCc());
		System.out.println(car.getColor());
	}
}
