package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		
		StdInfo studentJames = new StdInfo("James",12000);		
		StdInfo studentTom = new StdInfo("Tom",10000);
		
		//버스타기
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		System.out.println("===================");
		//버스 987번
		Bus bus987 = new Bus(987);
		studentTom.takeBus(bus987);
		studentTom.showInfo();
		bus987.showInfo();
		System.out.println("===================");
		//지하철 타기
		Subway subGreen = new Subway("2호선");
		studentTom.takeSubway(subGreen);
		//정보확인
		studentTom.showInfo();
		subGreen.showInfo();
		System.out.println("===================");
		Subway subOrange = new Subway("3호선");
		studentJames.takeSubway(subOrange);
		studentJames.showInfo();
		subOrange.showInfo();
		
	}
}
