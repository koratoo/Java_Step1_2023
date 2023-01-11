package chapter03.WHILE;

import java.util.Scanner;

public class ExampleWhile01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int deposit=0;//예금
		int withdraw=0;//출금
		int mymoney=0;//잔고
		
		do {

		System.out.println("-----------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("(※선택지에 없는 번호를 입력시 자동 종료됩니다.)");
		System.out.println("-----------------------------------");
		System.out.print("선택>");
		num=sc.nextInt();
		
		
		switch (num) {
		case 1:
			System.out.print("예금액>");
			deposit=sc.nextInt();
			break;
		case 2:
			System.out.print("출금액>");
			
			withdraw=sc.nextInt();
			if(deposit<withdraw ) {
				System.out.println("예금액이 부족합니다.");
			}
			break;
		case 3:
			
			mymoney=deposit-withdraw;
			System.out.print("잔고>");
			System.out.println(mymoney);
			break;	
			
		}
		
	
		}while(num<4);
		
		System.out.println();
		System.out.println("프로그램이 종료되었습니다."); 
		
	}

	
	
}
