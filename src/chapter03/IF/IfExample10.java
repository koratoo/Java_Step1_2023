package chapter03.IF;

import java.util.Scanner;

public class IfExample10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String ID="soldesk";//�ν��Ͻ� ����
		int pw = 1234;//������ ����
		
		String id = sc.nextLine();
		
		
		if(ID.equals(id)) {
			System.out.println("��й�ȣ�� �Է��� �ּ���.");
			int pass = sc.nextInt();
				if(pw==pass) {
					System.out.println("�α��ο� �����߽��ϴ�.");
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					
				}
			}else {//if end
				System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
				
		}//else end
		
	}
}
