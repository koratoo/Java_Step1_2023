package chapter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int select;
		String check;
		
		//객체생성
		Start start = new Start();
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			select = sc.nextInt();
			start.check(select);
			
			check=start.check(select);
			if(check.equals("SUCCESS"))
				break;
		}//while
		
	}//main
}
