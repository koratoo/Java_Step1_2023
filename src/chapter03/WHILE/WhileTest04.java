package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�ڹ� ������ ������ �Է��ϼ��� : ");
			int scr = sc.nextInt();
			
			//������ 0�̸� �Ǵ� 100�ʰ�
			if(scr < 0 || scr >100) {
					break;
			}else if(scr >= 60) {
						System.out.println("�հ��ϼ̽��ϴ�.");
					}else {
						System.out.println("���հ��ϼ̽��ϴ�.");
					}
			
			}//while
		System.out.println("���α׷�����");
			
		}
	}

