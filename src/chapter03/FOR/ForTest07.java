package chapter03.FOR;

import java.util.Scanner;

public class ForTest07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//�ν��Ͻ� ���� ����
		
		int i;
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int a = sc.nextInt();
		
		//if�� break, continue�� ����ؼ� ��������
		//if���� ���ǿ� 0���� ũ�鼭 11���� ���� �� 
		if(a>0 && a<11) {
			for(i=1;i<=a;i++) {
				System.out.println("JAVA ���α׷���!");
			}
		}else {
			System.out.println("�Է°��� �߸� �Ǿ����ϴ�!");
			
		}
			
		System.out.println("���α׷��� ����˴ϴ�.");
	}
}
