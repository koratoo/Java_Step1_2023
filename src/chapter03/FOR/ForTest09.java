package chapter03.FOR;

import java.util.Scanner;

public class ForTest09 {
	
	public static void main(String[] args) {
	//����� ������ �Է¹��� ������ ������ �ο����� �Է¹޴�.
	//������ ����� ���Ͻÿ�(��, ����� �Ǽ��� ���)
	
	Scanner sc = new Scanner(System.in);
	int i, sum=0;
	double avg=0;
	
	System.out.println("����� �л� ������ �Է� �����ðڽ��ϱ�? : ");
	int stu = sc.nextInt();
	
	for(i=0;i<stu;i++) {
		sum+=sc.nextInt();
	}
	
	avg=sum/stu;
	System.out.println(sum);
	System.out.println(avg);
	}
}
