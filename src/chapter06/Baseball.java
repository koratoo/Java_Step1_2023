package chapter06;

import java.util.Random;
import java.util.Scanner;
//야구게임
public class Baseball {
	
	public String game() {
		Scanner scan = new Scanner(System.in);
		
		//컴퓨터가 발생한 난수 1개
		int com1 = 0;
		int com2 = 0;
		int com3 = 0;
		
		do {
			//1~9사이의 난수를 발생
			com1=new Random().nextInt(9)+1;
			com2=new Random().nextInt(9)+1;
			com3=new Random().nextInt(9)+1;
		} while (com1==com2 || com1==com3 || com2==com3); {
		
		//컴퓨터 준비완료
			
		//사용자가 입력할 수 
		int user1=0;
		int user2=0;
		int user3=0;
			
		while(true) {
			System.out.println("1~9 까지의 수를 입력하세요--");
			System.out.print("첫번째 수를 입력 하세요: ");
			user1=scan.nextInt();
			System.out.print("두번째 수를 입력 하세요: ");
			user2=scan.nextInt();
			System.out.print("세번째 수를 입력 하세요: ");
			user3=scan.nextInt();
			
			int strike =0;
			int ball =0;
			
			//만약에 com1과 사용자가 입력한 첫번째(user1) 숫자가 같을 확률 
			
			//com1 == user1이 strike, com1 == user2 면 ball, com1 == user3 면 ball
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

				System.out.println("3 Ball ㅠㅠ");
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

			System.out.println("◆◆◆◆정답 : "+com1+" " + com2 +" "+ com3 +" ◆◆◆◆");
			
			System.out.println("=========================");
				}//while
			}
		
		}
	public static void main(String[] args) {
		
		
	  
	}
}
