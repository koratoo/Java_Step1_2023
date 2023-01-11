package chapter03.FOR;

import java.util.Scanner;

public class ForTest07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//인스턴스 변수 생성
		
		int i;
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		//if로 break, continue를 사용해서 제어했음
		//if문의 조건에 0보다 크면서 11보다 작은 수 
		if(a>0 && a<11) {
			for(i=1;i<=a;i++) {
				System.out.println("JAVA 프로그래밍!");
			}
		}else {
			System.out.println("입력값이 잘못 되었습니다!");
			
		}
			
		System.out.println("프로그램이 종료됩니다.");
	}
}
