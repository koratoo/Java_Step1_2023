package chapter03.IF;

//1�� ������Ʈ�� ������ �����
import javax.swing.JOptionPane;

public class IfExample04 {
	
	public static void main(String[] args) {
		
	
	int age;
	int charge = 0;
	
	age=Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է�"));
	
		System.out.println("======��������=======");
		
		//if
		if(age>0 && age<8) {
			charge=1000;
			System.out.println("�� ���� �Ƶ�");
		}else if(age>=8 && age<=13) {
			charge=2000;
			System.out.println("�ʵ��л�");
		}else if(age>13 && age<=19) {
			charge=3500;
			System.out.println("��,����л�");
		}else if(age>19 && age<120) {
			charge=5000;
			System.out.println("����");
		}else {
			System.out.println("�ſ� ��ȸ�� �ʿ��մϴ�.");
		}
		
		
		System.out.println("����: " +age +"��");
		System.out.println("��� : "+charge+"��");
		System.out.println("==================");
	}
}
