package chapter03.WHILE;

import java.util.Scanner;

public class ExampleWhile01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int deposit=0;//����
		int withdraw=0;//���
		int mymoney=0;//�ܰ�
		
		do {

		System.out.println("-----------------------------------");
		System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
		System.out.println("(�ؼ������� ���� ��ȣ�� �Է½� �ڵ� ����˴ϴ�.)");
		System.out.println("-----------------------------------");
		System.out.print("����>");
		num=sc.nextInt();
		
		
		switch (num) {
		case 1:
			System.out.print("���ݾ�>");
			deposit=sc.nextInt();
			break;
		case 2:
			System.out.print("��ݾ�>");
			
			withdraw=sc.nextInt();
			if(deposit<withdraw ) {
				System.out.println("���ݾ��� �����մϴ�.");
			}
			break;
		case 3:
			
			mymoney=deposit-withdraw;
			System.out.print("�ܰ�>");
			System.out.println(mymoney);
			break;	
			
		}
		
	
		}while(num<4);
		
		System.out.println();
		System.out.println("���α׷��� ����Ǿ����ϴ�."); 
		
	}

	
	
}
