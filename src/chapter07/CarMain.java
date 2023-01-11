package chapter07;

public class CarMain {

	public static void main(String[] args) {
		
		//객체를 생성하면서 초기화
		Car car = new Car("black",3000);
		
		//멤버변수에 직접 접근해서 출력
		System.out.println("==========================="); 
		
		//메소드를 이용한 출력
		System.out.println(car.getCc());
		System.out.println(car.getColor());
	}
}
