package chapter06;

public class StdInfo {

	//필드
	public String studentName;
	public int grade;
	public int money;
	
	//free compile 생략
	
	//생성자가 오버로딩
	public StdInfo(String studentName, int money) {
		// TODO Auto-generated constructor stub
		this.studentName = studentName;
		this.money = money;
	}
	
	//버스
	//                  매개변수로 Bus(클래스)가  올 수 있음
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;//내 입장에서 돈이 나감
	}
	
	//지하철
		//                  매개변수로 Subway(클래스)가  올 수 있음
		public void takeSubway(Subway subway) {
			subway.take(1500);
			this.money -= 1500;//내 입장에서 돈이 나감
		}
		
	//남은 잔액
		public void showInfo() {
			System.out.println(studentName+"님의 남은 잔액 :" +money+"원 입니다.");
		}
	
}
