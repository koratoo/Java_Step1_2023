package chapter06;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;

	//����Ʈ ������ ���� -���� ����
	
	public Subway(String lineNumber) {//������ �ʱ�ȭ�� ������ �ʴ°�
		// TODO Auto-generated constructor stub
		this.lineNumber=lineNumber;
	}
	
	public void take(int money) {//�°��� �� ��
		this.money += money;//����ö ��������
		passengerCount++;//�°��� ��
	}
	
	public void showInfo() {//������ �������
		System.out.println("����ö " +lineNumber + "���� �°��� "+passengerCount+"���̰�, ������ "+money+"�� �Դϴ�.");
	}
	
}
