package chapter03.IF;

//1�� ������Ʈ�� ������ �����
import javax.swing.JOptionPane;

public class IfExample05 {
	
	public static void main(String[] args) {
		
	
	int age;
	int charge;
	
	age=Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է�"));
	
		System.out.println("======��������=======");
		
		if(age<=7) {
			charge=1000;
			System.out.println("�� ���� �Ƶ�");
		}else if(age<=13) {
			charge=2000;
			System.out.println("�ʵ��л�");
		}else if(age<=19) {
			charge=3500;
			System.out.println("��,����л�");
		}else {
			charge=5000;
			System.out.println("����");
		}
		
		
		System.out.println("����: " +age +"��");
		System.out.println("��� : "+charge+"��");
		System.out.println("==================");
	}
}
