package chapter06;

public class Bus {

	//���
	int busNumber;
	int passengerCount;
	int money;

	//����Ʈ ������ ���� -���� ����
	
	public Bus(int busNumber) {//������ �ʱ�ȭ�� ������ �ʴ°�
		// TODO Auto-generated constructor stub
		this.busNumber=busNumber;
	}
	
	public void take(int money) {//�°��� �� ��
		this.money += money;//�������忡�� ������ ������ ����
		passengerCount++;//�°��� ��
	}
	
	public void showInfo() {//������ �������
		System.out.println("���� " +busNumber + "���� �°��� "+passengerCount+"���̰�, ������ "+money+"�� �Դϴ�.");
	}
	
}
