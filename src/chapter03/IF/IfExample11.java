package chapter03.IF;

import java.util.Scanner;

public class IfExample11 {

	public static void main(String[] args) {
		//scan 인스턴스 변수 선언
		Scanner scan = new Scanner(System.in);
		
		//ID라는 변수로 ID받기
		String ID="soldesk";//인스턴스 변수
		//pw(String)
		String pw = "1234";//정수형 변수
		
		System.out.println("=====솔데스크에 오신 것을 환영합니다.=====");
		System.out.print("아이디를 입력해 주세요 : ");
		String id = scan.nextLine();
		
		/*
		if(ID.equals(id)) {
			System.out.print("비밀번호를 입력해 주세요 : ");
			int pass = scan.nextInt();
			
			//인트형으로 형변환
			if(Integer.parseInt(pw)==pass) {
					System.out.println("로그인에 성공했습니다.");
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					
				}
			}else {//if end
				System.out.println("존재하지 않는 아이디 입니다.");
				
		}//else end
		*/
		
		//4줄 논리 연산 사용
		System.out.print("비밀번호를 입력해 주세요 : ");
		int pass = scan.nextInt();
		if(ID.equals(id) && Integer.parseInt(pw)==pass) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패"); 		
		}
		
		
		System.out.println("=================================");
		
	}
}
