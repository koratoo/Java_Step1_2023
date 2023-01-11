package chapter06;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		
		
		System.out.println("제작회사: " + car.company);
		System.out.println("모델: " + car.model);
		System.out.println("색깔: " + car.color);
		System.out.println("최고속도: " + car.maxSpeed);
		System.out.println("현재속도: " + car.speed);
		System.out.println("========================");
		car.setSpeed(60);

		System.out.println("변경속도: " + car.speed); 
		
	}

}
