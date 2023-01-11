package chapter03.FOR;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		int count = 0;
		
		for(int i=0; i<10; i++) {
			num = sc.nextInt();
			sum += num;
			
			if(num%2==0 && num>0)
				count++;
		}
		System.out.println("ÇÕ : "+ sum);
		System.out.println("Â¦¼öÀÇ °¹¼ö : " + count);
	}
}
