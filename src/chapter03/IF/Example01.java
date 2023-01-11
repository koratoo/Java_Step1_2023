package chapter03.IF;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int soft1 = sc.nextInt();
		int soft2 = sc.nextInt();
		int soft3 = sc.nextInt();
		int soft4 = sc.nextInt();
		int soft5 = sc.nextInt();
		int sum = soft1 + soft2 + soft3 + soft4 + soft5; 
		
		
		if(sum>=60 && soft1 >=8 && soft2 >=8 && soft3 >=8 && soft4 >=8 &&soft5>=8) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}

	}
}

/*
8
9
8
7
6
불합격
*/