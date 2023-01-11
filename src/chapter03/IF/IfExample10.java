package chapter03.IF;

import java.util.Scanner;

public class IfExample10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String ID="soldesk";//인스턴스 변수
		int pw = 1234;//정수형 변수
		
		String id = sc.nextLine();
		
		
		if(ID.equals(id)) {
			System.out.println("비밀번호를 입력해 주세요.");
			int pass = sc.nextInt();
				if(pw==pass) {
					System.out.println("로그인에 성공했습니다.");
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					
				}
			}else {//if end
				System.out.println("존재하지 않는 아이디 입니다.");
				
		}//else end
		
	}
}
