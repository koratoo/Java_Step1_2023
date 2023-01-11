package chapter03.FOR;

import java.util.Scanner;

public class ForTest10 {

	public static void main(String[] args) {
		//입력받은 수를 초과하면 반복문 멈추는 조건
		Scanner sc = new Scanner(System.in);
		
		int i, sum=0;
		
		System.out.println("정수를 입력하세요 : ");
		int num =sc.nextInt();
		
		//조건이 없는 for문
		for(i=1; ;i++) {
			if(sum>num) {
				break;
			}
			
			sum+=i;
		}
		System.out.println(i-1+"번째까지의 총합 : "+sum);
		
	}
}
