package chapter06;

import java.util.Random;
import java.util.Scanner;
//�߱�����
public class Baseball {
	
	public String game() {
		Scanner scan = new Scanner(System.in);
		
		//��ǻ�Ͱ� �߻��� ���� 1��
		int com1 = 0;
		int com2 = 0;
		int com3 = 0;
		
		do {
			//1~9������ ������ �߻�
			com1=new Random().nextInt(9)+1;
			com2=new Random().nextInt(9)+1;
			com3=new Random().nextInt(9)+1;
		} while (com1==com2 || com1==com3 || com2==com3); {
		
		//��ǻ�� �غ�Ϸ�
			
		//����ڰ� �Է��� �� 
		int user1=0;
		int user2=0;
		int user3=0;
			
		while(true) {
			System.out.println("1~9 ������ ���� �Է��ϼ���--");
			System.out.print("ù��° ���� �Է� �ϼ���: ");
			user1=scan.nextInt();
			System.out.print("�ι�° ���� �Է� �ϼ���: ");
			user2=scan.nextInt();
			System.out.print("����° ���� �Է� �ϼ���: ");
			user3=scan.nextInt();
			
			int strike =0;
			int ball =0;
			
			//���࿡ com1�� ����ڰ� �Է��� ù��°(user1) ���ڰ� ���� Ȯ�� 
			
			//com1 == user1�� strike, com1 == user2 �� ball, com1 == user3 �� ball
			if(com1 == user1) {
				strike++;
			}else if(com2 == user2) {
				strike++;
			}else if(com3 == user3) {
				strike++;
			}else {
				ball++;
			}
			
			if(com1 == user1 && com2 == user2 && com3 ==user3) {
				System.out.println("=========================");

				System.out.println("WIN");
				return "WIN";
			}else if(com1 != user1 && com2 != user2 && com3 !=user3){
				System.out.println("=========================");

				System.out.println("3 Ball �Ф�");
			}else if(com1 == user1&&com2 != user2 && com3 !=user3) {
				System.out.println("1strike 2ball");
			}else if(com1 != user1&&com2 == user2 && com3 !=user3) {
				System.out.println("1strike 2ball");
			}else if(com1 != user1&&com2 != user2 && com3 ==user3) {
				System.out.println("1strike 2ball");
			}else if(com1 == user1&&com2 == user2 && com3 !=user3) {
				System.out.println("2strike 1ball");
			}else if(com1 != user1&&com2 == user2 && com3 ==user3) {
				System.out.println("2strike 1ball");
			}else if(com1 == user1&&com2 != user2 && com3 ==user3) {
				System.out.println("2strike 1ball");
			}
			
			System.out.println("=========================");

			System.out.println("�ߡߡߡ����� : "+com1+" " + com2 +" "+ com3 +" �ߡߡߡ�");
			
			System.out.println("=========================");
				}//while
			}
		
		}
	public static void main(String[] args) {
		
		
	  
	}
}
