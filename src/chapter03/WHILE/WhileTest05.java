package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num,cnt=0,sum=0;
		double avg;
		//0을 입력하면 종료
		while(true) {
			System.out.print("숫자를 입력하세요"); 
			num = scan.nextInt();
			if(num==0) {
				break;
			}else {
				sum+=num;
				cnt++;
			}
		}
		System.out.println(sum);
		System.out.println(sum/(double)cnt);
	}
}
