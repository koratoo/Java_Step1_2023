package chapter06;

import javax.swing.JOptionPane;

public class SungJuk {
	//jvm
	//��� ���� �Ǵ� �ʵ�
	private String std_num;
	private String std_name;
	private int java,oracle,spring;
	
	//����Ʈ ������-�ݵ�� Ŭ���� �̸��� ���ƾ� ��
	//Ŭ���� �޸𸮸� ����� ���ΰ��̱� ������.
	
	//�޼���
	public void Sum() {
		int total=java +oracle+spring;
		System.out.println("�� �հ� : " + total);
	}
	
	public void Avg() {
		int avg = (java+oracle+spring)/3;
		System.out.println("��� : " +avg);
	}
	
	//main Jdk
	public static void main(String[] args) {
		
		SungJuk rec = new SungJuk();//������ ����,�Լ� = �����ڸ� ������ֶ�
		
		rec.std_num=JOptionPane.showInputDialog("�й�");
		rec.std_name=JOptionPane.showInputDialog("�̸�");
		
		rec.java=Integer.parseInt(JOptionPane.showInputDialog("�ڹ����� �Է�"));
		rec.oracle=Integer.parseInt(JOptionPane.showInputDialog("����Ŭ �Է�"));
		rec.spring=Integer.parseInt(JOptionPane.showInputDialog("������ �Է�"));
		
		System.out.println("�й�: " + rec.std_num+"| ���� -"+rec.std_name+"���� �����Դϴ�.");
		System.out.println("=========================================================");
		rec.Sum();
		rec.Avg();
	}
}
