package chapter06;

public class StdInfo {

	//�ʵ�
	public String studentName;
	public int grade;
	public int money;
	
	//free compile ����
	
	//�����ڰ� �����ε�
	public StdInfo(String studentName, int money) {
		// TODO Auto-generated constructor stub
		this.studentName = studentName;
		this.money = money;
	}
	
	//����
	//                  �Ű������� Bus(Ŭ����)��  �� �� ����
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;//�� ���忡�� ���� ����
	}
	
	//����ö
		//                  �Ű������� Subway(Ŭ����)��  �� �� ����
		public void takeSubway(Subway subway) {
			subway.take(1500);
			this.money -= 1500;//�� ���忡�� ���� ����
		}
		
	//���� �ܾ�
		public void showInfo() {
			System.out.println(studentName+"���� ���� �ܾ� :" +money+"�� �Դϴ�.");
		}
	
}
