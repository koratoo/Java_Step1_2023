package chapter03.IF;

import java.util.Scanner;

public class IfExample12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ID = "soldesk";
		int pw= 1234;
		
		String inputID =sc.nextLine();
		
		if(ID.equals(inputID)) {
			int pwc = sc.nextInt();
			if(pw!=pwc) {
				System.out.println("��й�ȣ�� �ٸ��ϴ�.");
			}else {
				System.out.println("�α��� ����");
			}
			
		}else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
	}
}
