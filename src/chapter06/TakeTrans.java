package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		
		StdInfo studentJames = new StdInfo("James",12000);		
		StdInfo studentTom = new StdInfo("Tom",10000);
		
		//����Ÿ��
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		System.out.println("===================");
		//���� 987��
		Bus bus987 = new Bus(987);
		studentTom.takeBus(bus987);
		studentTom.showInfo();
		bus987.showInfo();
		System.out.println("===================");
		//����ö Ÿ��
		Subway subGreen = new Subway("2ȣ��");
		studentTom.takeSubway(subGreen);
		//����Ȯ��
		studentTom.showInfo();
		subGreen.showInfo();
		System.out.println("===================");
		Subway subOrange = new Subway("3ȣ��");
		studentJames.takeSubway(subOrange);
		studentJames.showInfo();
		subOrange.showInfo();
		
	}
}
