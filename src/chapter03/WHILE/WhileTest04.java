package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("자바 교과목 점수를 입력하세요 : ");
			int scr = sc.nextInt();
			
			//점수가 0미만 또는 100초과
			if(scr < 0 || scr >100) {
					break;
			}else if(scr >= 60) {
						System.out.println("합격하셨습니다.");
					}else {
						System.out.println("불합격하셨습니다.");
					}
			
			}//while
		System.out.println("프로그램종료");
			
		}
	}

