package chapter06;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		
		
		System.out.println("����ȸ��: " + car.company);
		System.out.println("��: " + car.model);
		System.out.println("����: " + car.color);
		System.out.println("�ְ�ӵ�: " + car.maxSpeed);
		System.out.println("����ӵ�: " + car.speed);
		System.out.println("========================");
		car.setSpeed(60);

		System.out.println("����ӵ�: " + car.speed); 
		
	}

}
