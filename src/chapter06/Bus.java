package chapter06;

public class Bus {

	//멤버
	int busNumber;
	int passengerCount;
	int money;

	//디폴트 생성자 생략 -쓸일 없음
	
	public Bus(int busNumber) {//생성자 초기화는 변하지 않는것
		// TODO Auto-generated constructor stub
		this.busNumber=busNumber;
	}
	
	public void take(int money) {//승객이 낸 돈
		this.money += money;//버스입장에서 버스의 수입이 증가
		passengerCount++;//승객의 수
	}
	
	public void showInfo() {//버스의 정보출력
		System.out.println("버스 " +busNumber + "번의 승객은 "+passengerCount+"명이고, 수입은 "+money+"원 입니다.");
	}
	
}
