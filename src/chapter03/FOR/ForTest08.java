package chapter03.FOR;

import java.util.Scanner;

public class ForTest08 {

	public static void main(String[] args) {
		// 10���� ������ �Է¹޾� 3�� ����� 5�� ����� ���� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		int a, cnt3=0, cnt5=0;
		System.out.println("������ �Է��ϼ��� : ");
		
		for(int i =0 ; i<10; i++) {
			
			a=sc.nextInt();
			
			if(a%3==0 && a%5!=0) {
				System.out.println("3�� ��� : "+a);
				cnt3++;
			}else if(a%5==0 && a%3!=0) {
				System.out.println("5�� ��� : " +a);
				cnt5++;
			}else if(a%5==0 && a%3==0) {
				System.out.println("3,5�� ��� : "+ a);
				cnt3++;
				cnt5++;
			}//if end
		}//for end
		
		System.out.println("3�� ����� ���� cnt3 : " + cnt3);
		System.out.println("5�� ����� ���� cnt3 : " + cnt5);
	}
}
