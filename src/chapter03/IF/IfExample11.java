package chapter03.IF;

import java.util.Scanner;

public class IfExample11 {

	public static void main(String[] args) {
		//scan �ν��Ͻ� ���� ����
		Scanner scan = new Scanner(System.in);
		
		//ID��� ������ ID�ޱ�
		String ID="soldesk";//�ν��Ͻ� ����
		//pw(String)
		String pw = "1234";//������ ����
		
		System.out.println("=====�ֵ���ũ�� ���� ���� ȯ���մϴ�.=====");
		System.out.print("���̵� �Է��� �ּ��� : ");
		String id = scan.nextLine();
		
		/*
		if(ID.equals(id)) {
			System.out.print("��й�ȣ�� �Է��� �ּ��� : ");
			int pass = scan.nextInt();
			
			//��Ʈ������ ����ȯ
			if(Integer.parseInt(pw)==pass) {
					System.out.println("�α��ο� �����߽��ϴ�.");
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					
				}
			}else {//if end
				System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
				
		}//else end
		*/
		
		//4�� �� ���� ���
		System.out.print("��й�ȣ�� �Է��� �ּ��� : ");
		int pass = scan.nextInt();
		if(ID.equals(id) && Integer.parseInt(pw)==pass) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����"); 		
		}
		
		
		System.out.println("=================================");
		
	}
}
