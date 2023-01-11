package chapter03.FOR;

import java.util.Scanner;

public class ForTest08 {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아 3의 배수와 5의 배수를 각각 출력하시오
		Scanner sc = new Scanner(System.in);
		int a, cnt3=0, cnt5=0;
		System.out.println("정수를 입력하세요 : ");
		
		for(int i =0 ; i<10; i++) {
			
			a=sc.nextInt();
			
			if(a%3==0 && a%5!=0) {
				System.out.println("3의 배수 : "+a);
				cnt3++;
			}else if(a%5==0 && a%3!=0) {
				System.out.println("5의 배수 : " +a);
				cnt5++;
			}else if(a%5==0 && a%3==0) {
				System.out.println("3,5의 배수 : "+ a);
				cnt3++;
				cnt5++;
			}//if end
		}//for end
		
		System.out.println("3의 배수의 갯수 cnt3 : " + cnt3);
		System.out.println("5의 배수의 갯수 cnt3 : " + cnt5);
	}
}
