package chapter04.Example;

import java.util.Scanner;

public class Example03 {
	
	static int score[] = new int[10];
	static int stuNum;//�л���
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int pickNum=0;
		int max=0;
		double total=0;
		double avg=0;
		
		
		while(pickNum!=5) {
			System.out.println("===========================================");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("===========================================");
		
			System.out.print("����>");
			pickNum = sc.nextInt();
			
			switch (pickNum) {
			case 1:

				System.out.print("�л����� �Է��� �ּ���(�ִ� 10��)>");
				stuNum =sc.nextInt();
				break;
			case 2:
				if(stuNum>0) {
					for(int i=0; i<stuNum; i++) {
						System.out.print("score["+i+"]>");
						score[i]=sc.nextInt();
					}
				}else if(stuNum==0){
					System.out.println("�л� ���� �Է��� �ּ���.");
				}
				break;	
			case 3:
				if(stuNum>0) {
					for(int i=0; i<stuNum; i++) {
						System.out.println("score["+i+"] : " + score[i]);
					}
				}else if(stuNum==0){
					System.out.println("��ϵ� �л� ������ �����ϴ�.");
				}
				break;
			case 4:
				if(stuNum>0) {
					for(int i=0; i<stuNum; i++) {
						if(max<score[i]) 
							max=score[i];
					}//�ִ� for
					
					for(int i=0; i<stuNum; i++) {
						total+=score[i];
					}
					avg=total/(double)stuNum;
					
					System.out.println("�ְ� ���� : " + max);
					System.out.println("���� : " + total);
					System.out.println("��� : " + avg);
				}
				else if(stuNum==0){
					System.out.println("��ϵ� �л� ������ �����ϴ�.");
				}
				
				break;
			default:
				if(pickNum>5 || pickNum<1)
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
				break;
			}
			
			
		}//while end
	
	System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
	
	}
}
